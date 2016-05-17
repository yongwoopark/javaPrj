import java.util.Scanner;

/*
   �ۼ��� : 2016-02-24
   �ۼ��� : newlec
   ���۱� : ����� ��   
   ���� : ������ ����ü�� �迭 �ٷ�� 
 */

public class Program6 {

	public static void main(String[] args) {
		
		/*int kor;
		int eng;
		int math;*/
		Exam[] exams = new Exam[3];
		int current = -1;

		ExitMainMenu:
		while(true){
			switch(inputMainMenu())
			{
			case 1:
				inputExam(exams, current);
				break;
			case 2:
				printExam(exams, current);
				break;
			case 3:
				
				if(bye() == 1)
					break ExitMainMenu;
				
				break;
			}
		}
	}

	private static int bye() {
		// ���� �����Ŵ�?
		// yes/ no(1/0);
		return 1;
	}

	private static void printExam(Exam[] exams, int current) {
		System.out.println("��������������������������");
        System.out.println("��          ����  ���         ��");
        System.out.println("��������������������������");
        for(int i=0; i<current+1; i++)
        {
        	Exam exam = exams[i];
        	
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

	private static void inputExam(Exam[] exams, int current) {
		
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
          
        exams[++current] = exam;
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
