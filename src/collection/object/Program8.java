package collection.object;
import java.util.ArrayList;
import java.util.Scanner;

/*
   �ۼ��� : 2016-02-24
   �ۼ��� : newlec
   ���۱� : ����� ��   
   ���� : ���� �����͸� ����ȭ�ϱ�
 */

public class Program8 {
	// ������ �־�� �ٵ� ������ ������.~~~
	static ArrayList list;
	
	public static void main(String[] args) {

		/*int kor;
		int eng;
		int math;*/
		/*Exam[] exams = new Exam[3];
		int current = -1;*/
		list = new ArrayList();
		
		// ���� 1 : ���� �ʱ�ȭ�� ExamCollection ĸ�� ������ �ű�ÿ�.
		//list.exams = new Exam[3];
		//list.current = -1;
		
		while(true){
			switch(inputMainMenu())
			{
			case 1:
				inputExam();
				break;
			case 2:
				printExam();
				break;
			case 3:
				bye();
				break;
			}
		}
	}

	private static void bye() {
		
	}

	private static void printExam() {
		System.out.println("��������������������������");
        System.out.println("��          ����  ���         ��");
        System.out.println("��������������������������");
        
        // ���� 2: �����ڵ� for(int i=0; i<list.current+1; i++) 
        // �̺κп��� ĸ���� ���� ������ �߻��Ͽ���.
        // ���� �ڵ带 ����ó�� ��ġ���� �Ѵ�. size() �޼ҵ带 �ۼ��Ͻÿ�.
        for(int i=0; i<list.size(); i++)
        {
        	// ���� 3: ���� �ڵ� Exam exam = list.exams[i];
        	// �� �κп��� ĸ���� ���� ������ �߻��Ͽ���.
        	// ���� �ڵ带 ����ó�� ��ġ���� �Ѵ�. �׸��� ��ȯ���ִ� �޼ҵ带 �ۼ��Ͻÿ�.
        	//Exam exam = (Exam)list.get(i); // �������� �÷����� ����ϴ� �Ϳ� ���� ������...
        	
        	Exam exam = null;
        	Object obj = list.get(i);
        	if(obj instanceof Exam)
        		exam = (Exam)obj;
        	
			int kor = exam.kor;
			int eng = exam.eng;
			int math = exam.math;
			int total = 0;
			float avg = 0;
			
			total = kor + eng + math;
			avg = total / 3.0f; //3.0f�� ����� ������ �Ǽ� ����� ��� ���ؼ� ...
        	
        	System.out.printf("   ��ȣ : %d\n", i+1);
	        System.out.printf("   ���� : %d\n", kor);
	        System.out.printf("   ���� : %d\n", eng);
	        System.out.printf("   ���� : %d\n", math);
	        System.out.printf("   ���� : %d\n", total);
	        System.out.printf("   ��� : %f\n", avg);
	        System.out.println("��������������������������");
        }
	}

	private static void inputExam() {
		
		Scanner scan = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		// ���� �Է� �ڵ� �ۼ�
		System.out.println("��������������������������");
        System.out.println("��          ����  �Է�         ��");
        System.out.println("��������������������������");
        
        // ���� ��ȿ�� �˻�
        do{
        	
	        System.out.print("   ���� : ");
	        kor = scan.nextInt();
        
	    	if(!(0 <= kor && kor <= 100))
	    		System.out.println("���� ������ ������ϴ�. ��ȿ����(0~100)");
	        
        }while(!(0 <= kor && kor <= 100));
        
        System.out.print("   ���� : ");
        eng = scan.nextInt();
        System.out.print("   ���� : ");
        math = scan.nextInt();
        
        Exam exam = new Exam();
        
        exam.kor = kor;
        exam.eng = eng;
        exam.math = math;
          
        // ���� 4: ���� �ڵ� list.exams[++list.current] = exam;
    	// �� �κп��� ĸ���� ���� ������ �߻��Ͽ���.
    	// ���� �ڵ带 ����ó�� ��ġ���� �Ѵ�. ���� �ڵ带 ??() ��� �̸����� �����Ͻÿ�.
        list.add(exam);
	}

	private static int inputMainMenu() {
		Scanner scan = new Scanner(System.in);
		int menu;
		
		System.out.println("��������������������������");
        System.out.println("��          ����  �޴�         ��");
        System.out.println("��������������������������");
        System.out.println(" 1.����  �Է�");
        System.out.println(" 2.����  ���");
        System.out.println(" 3.����");
        System.out.println(" ����>");
        
        menu = scan.nextInt();
        
		return menu;
	}

}
