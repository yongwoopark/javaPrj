import java.util.Scanner;

/*
   �ۼ��� : 2016-02-24
   �ۼ��� : newlec
   ���۱� : ����� ��   
   ���� : ������ ������ ���� ��ü �ٷ��
 */

public class Program7 {

	public static void main(String[] args) {

		/*int kor;
		int eng;
		int math;*/
		/*Exam[] exams = new Exam[3];
		int current = -1;*/
		ExamCollection list = new ExamCollection();
		list.exams = new Exam[3];
		list.current = -1;
		
		int x = 0;
		int y;
		
		x += 3;
		y = x + 2;
		
		while(true){
			switch(inputMainMenu())
			{
			case 1:
				inputExam(list);
				break;
			case 2:
				printExam(list);
				break;
			case 3:
				bye();
				break;
			}
		}
	}

	private static void bye() {
		
	}

	private static void printExam(ExamCollection list) {
		System.out.println("��������������������������");
        System.out.println("��          ����  ���         ��");
        System.out.println("��������������������������");
        for(int i=0; i<list.current+1; i++)
        {
        	Exam exam = list.exams[i];
        	
			int kor = exam.kor;
			int eng = exam.eng;
			int math = exam.math;
			int total = 0;
			float avg = 0;
			
			//total = total(kor, eng, math);//kor + eng + math;
			total = total(exam);
			
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

	private static int total(Exam exam) {
				
		return total(exam.kor, exam.eng, exam.math);
	}

	private static int total(int kor, int eng, int math) {
				
		return kor + eng + math;
	}

	private static void inputExam(ExamCollection list) {
		
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
          
        list.exams[++list.current] = exam;
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
