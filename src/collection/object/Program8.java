package collection.object;
import java.util.ArrayList;
import java.util.Scanner;

/*
   작성일 : 2016-02-24
   작성자 : newlec
   저작권 : 맘대로 써   
   내용 : 공유 데이터를 전역화하기
 */

public class Program8 {
	// 복도에 있어요 다들 가져다 쓰세요.~~~
	static ArrayList list;
	
	public static void main(String[] args) {

		/*int kor;
		int eng;
		int math;*/
		/*Exam[] exams = new Exam[3];
		int current = -1;*/
		list = new ArrayList();
		
		// 문제 1 : 다음 초기화를 ExamCollection 캡슐 안으로 옮기시오.
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
		System.out.println("┌───────────┐");
        System.out.println("│          성적  출력         │");
        System.out.println("└───────────┘");
        
        // 문제 2: 이전코드 for(int i=0; i<list.current+1; i++) 
        // 이부분에서 캡슐을 깨는 문제가 발생하였다.
        // 위의 코드를 다음처럼 고치려고 한다. size() 메소드를 작성하시오.
        for(int i=0; i<list.size(); i++)
        {
        	// 문제 3: 이전 코드 Exam exam = list.exams[i];
        	// 이 부분에서 캡슐을 깨는 문제가 발생하였다.
        	// 위의 코드를 다음처럼 고치려고 한다. 항목을 반환해주는 메소드를 작성하시오.
        	//Exam exam = (Exam)list.get(i); // 범용적인 컬렉션을 사용하는 것에 대한 단점은...
        	
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
			avg = total / 3.0f; //3.0f를 사용한 이유는 실수 결과를 얻기 위해서 ...
        	
        	System.out.printf("   번호 : %d\n", i+1);
	        System.out.printf("   국어 : %d\n", kor);
	        System.out.printf("   영어 : %d\n", eng);
	        System.out.printf("   수학 : %d\n", math);
	        System.out.printf("   총점 : %d\n", total);
	        System.out.printf("   평균 : %f\n", avg);
	        System.out.println("─────────────");
        }
	}

	private static void inputExam() {
		
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
        
        Exam exam = new Exam();
        
        exam.kor = kor;
        exam.eng = eng;
        exam.math = math;
          
        // 문제 4: 이전 코드 list.exams[++list.current] = exam;
    	// 이 부분에서 캡슐을 깨는 문제가 발생하였다.
    	// 위의 코드를 다음처럼 고치려고 한다. 다음 코드를 ??() 라는 이름으로 구현하시오.
        list.add(exam);
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
