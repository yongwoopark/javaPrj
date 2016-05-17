package capsule;

import java.util.Scanner;

public class Exam {
	private int kor;
	private int eng;
	private int math;
	
	// ���� ������ �ִ� exam�� ������ �� ���ŵ�..����..
	// exam���� ���� kor �� �� ������~~~ get get come on`~~
	public static int getKor(Exam exam){
		return exam.kor;
	}
	
	public static void setKor(Exam exam, int kor){
		exam.kor = kor;
	}	
	
	public static int getEng(Exam exam){
		return exam.eng;
	}
	
	public static void setEng(Exam exam, int eng){
		exam.eng = eng;
	}
	
	public static int getMath(Exam exam){
		return exam.math;
	}
	
	public static void setMath(Exam exam, int math){
		exam.math = math;
	}	
	
	public static void printExam(Exam exam) {
		int kor = exam.kor;
		int eng = exam.eng;
		int math = exam.math;
		int total = 0;
		float avg = 0;
		
		total = kor + eng + math;
		avg = total / 3.0f; //3.0f�� ����� ������ �Ǽ� ����� ��� ���ؼ� ...

        System.out.println("��������������������������");
        System.out.println("��          ����  ���         ��");
        System.out.println("��������������������������");
        for(int i=0; i<3; i++)
        {
        	System.out.printf("   ��ȣ : %d\n", i+1);
	        System.out.printf("   ���� : %d\n", kor);
	        System.out.printf("   ���� : %d\n", eng);
	        System.out.printf("   ���� : %d\n", math);
	        System.out.printf("   ���� : %d\n", total);
	        System.out.printf("   ��� : %f\n", avg);
	        System.out.println("��������������������������");
        }
	}

	public static void inputExam(Exam exam) {
		
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
        
        exam.kor = kor;
        exam.eng = eng;
        exam.math = math;
	}
	
	public static int total(Exam exam) {
		
		return total(exam.kor, exam.eng, exam.math);
	}

	public static int total(int kor, int eng, int math) {
				
		return kor + eng + math;
	}
}
