package capsule;

import java.util.Scanner;

public class Exam {
	private int kor;
	private int eng;
	private int math;
	
	// 내가 가지고 있는 exam의 구조를 못 보거든..제발..
	// exam에서 제발 kor 값 좀 꺼내줘~~~ get get come on`~~
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
		avg = total / 3.0f; //3.0f를 사용한 이유는 실수 결과를 얻기 위해서 ...

        System.out.println("┌───────────┐");
        System.out.println("│          성적  출력         │");
        System.out.println("└───────────┘");
        for(int i=0; i<3; i++)
        {
        	System.out.printf("   번호 : %d\n", i+1);
	        System.out.printf("   국어 : %d\n", kor);
	        System.out.printf("   영어 : %d\n", eng);
	        System.out.printf("   수학 : %d\n", math);
	        System.out.printf("   총점 : %d\n", total);
	        System.out.printf("   평균 : %f\n", avg);
	        System.out.println("─────────────");
        }
	}

	public static void inputExam(Exam exam) {
		
		Scanner scan = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		// 성적 입력 코드 작성
		System.out.println("┌───────────┐");
        System.out.println("│          성적  입력         │");
        System.out.println("└───────────┘");
        
        // 성적 유효성 검사
        do{
        	
	        System.out.print("   국어 : ");
	        kor = scan.nextInt();
        
	    	if(!(0 <= kor && kor <= 100))
	    		System.out.println("값의 범위를 벗어났습니다. 유효범위(0~100)");
	        
        }while(!(0 <= kor && kor <= 100));
        
        System.out.print("   영어 : ");
        eng = scan.nextInt();
        System.out.print("   수학 : ");
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
