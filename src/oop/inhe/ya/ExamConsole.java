package oop.inhe.ya;

import java.util.Scanner;

public abstract class ExamConsole {
	
	private Exam exam;
	// 인터페이스 자료형식이 없지롱...생성합시다요.
	private PrintListener printListener;	
	private TitlePrintListener titlePrintListener;
	
		
	public void setTitlePrintListener(TitlePrintListener titlePrintListener) {
		this.titlePrintListener = titlePrintListener;
	}

	public void setPrintListener(PrintListener printListener) {
		this.printListener = printListener;
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public ExamConsole() {
		// TODO Auto-generated constructor stub
	}
	
	public ExamConsole(Exam exam) {
		this.exam = exam;
		//exam = new Exam();
	}
	
	public void print() {
		int kor = exam.getKor();
		int eng = exam.getEng();
		int math = exam.getMath();
		int total = 0;
		float avg = 0;
		
		total = kor + eng + math;
		avg = total / 3.0f; //3.0f를 사용한 이유는 실수 결과를 얻기 위해서 ...

		if(titlePrintListener != null)
			titlePrintListener.onTitlePrint();
		else
		{
			 System.out.println("┌───────────┐");
		     System.out.println("│          성적  출력         │");
		     System.out.println("└───────────┘");
		}
		
		
        for(int i=0; i<3; i++)
        {
        	System.out.printf("   번호 : %d\n", i+1);
	        System.out.printf("   국어 : %d\n", kor);
	        System.out.printf("   영어 : %d\n", eng);
	        System.out.printf("   수학 : %d\n", math);
	        // 고쳐서 사용해야 할 부분을 도킹? 세팅? 하는 방법으로
	        // 끼워서 고칠 수 있도록 하는 방법을 사용할 수 있다.
	        // 이 때 사용할 변수형식?은 어떻게 할 것인가
	        // 끼워질 객체의 자료형을 우리는 알고 있어야만 하는가?
	        // 아니 그냥 규약? 명칭만으로 해결 할 수 있어야 하는데
	        // 그 때 규약은 곧 구현한 함수 목록을 가지는 규약 캡슐
	        // 곧 그것을 자바에서는 객체 인터페이스라고 한다요~
	        // interface Yo~~!!
	        // printListener 변수를 위에서 선언할 때 인터페이스 형식으로
	        // 선얼 할 꺼임.... 좀 보심...
	        /*if(printListener != null)
	        	printListener.onPrint();*/
	        onPrint();
	        System.out.printf("   총점 : %d\n", total);
	        System.out.printf("   평균 : %f\n", avg);
	        System.out.println("─────────────");
        }
	}

	/*
	 * 이 함수는 print() 메소드를 재정의하고자 할 때 과목을 포함시키고 싶다면
	 * 이 함수를 재정의해서 원하는 과목을 포함시....
	 */
	protected  abstract void onPrint();

	public void input() {
		
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
        
        exam.setKor(kor);
        exam.setEng(eng);
        exam.setMath(math);
	}	
}
