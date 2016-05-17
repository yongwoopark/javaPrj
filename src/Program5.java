import java.util.Scanner;

/*
   작성일 : 2016-02-24
   작성자 : newlec
   저작권 : 맘대로 써   
   내용 : 함수를 이용해 구조만 작성하는 코드 
 */

public class Program5 {

	public static void main(String[] args) {

		/*int kor;
		int eng;
		int math;*/
		Exam exam = new Exam();
		
		while(true){
			switch(inputMainMenu())
			{
			case 1:
				inputExam(exam);
				break;
			case 2:
				printExam(exam);
				break;
			case 3:
				bye();
				break;
			}
		}
	}

	private static void bye() {
		
	}

	private static void printExam(Exam exam) {
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

	private static void inputExam(Exam exam) {
		
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

	private static int inputMainMenu() {
		Scanner scan = new Scanner(System.in);
		int menu;
		
		System.out.println("┌───────────┐");
        System.out.println("│          메인  메뉴         │");
        System.out.println("└───────────┘");
        System.out.println(" 1.성적  입력");
        System.out.println(" 2.성적  출력");
        System.out.println(" 3.종료");
        System.out.println(" 선택>");
        
        menu = scan.nextInt();
        
		return menu;
	}

}
