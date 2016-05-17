package oop.inhe.ya;

import java.util.Scanner;

public abstract class ExamConsole {
	
	private Exam exam;
	// �������̽� �ڷ������� ������...�����սôٿ�.
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
		avg = total / 3.0f; //3.0f�� ����� ������ �Ǽ� ����� ��� ���ؼ� ...

		if(titlePrintListener != null)
			titlePrintListener.onTitlePrint();
		else
		{
			 System.out.println("��������������������������");
		     System.out.println("��          ����  ���         ��");
		     System.out.println("��������������������������");
		}
		
		
        for(int i=0; i<3; i++)
        {
        	System.out.printf("   ��ȣ : %d\n", i+1);
	        System.out.printf("   ���� : %d\n", kor);
	        System.out.printf("   ���� : %d\n", eng);
	        System.out.printf("   ���� : %d\n", math);
	        // ���ļ� ����ؾ� �� �κ��� ��ŷ? ����? �ϴ� �������
	        // ������ ��ĥ �� �ֵ��� �ϴ� ����� ����� �� �ִ�.
	        // �� �� ����� ��������?�� ��� �� ���ΰ�
	        // ������ ��ü�� �ڷ����� �츮�� �˰� �־�߸� �ϴ°�?
	        // �ƴ� �׳� �Ծ�? ��Ī������ �ذ� �� �� �־�� �ϴµ�
	        // �� �� �Ծ��� �� ������ �Լ� ����� ������ �Ծ� ĸ��
	        // �� �װ��� �ڹٿ����� ��ü �������̽���� �Ѵٿ�~
	        // interface Yo~~!!
	        // printListener ������ ������ ������ �� �������̽� ��������
	        // ���� �� ����.... �� ����...
	        /*if(printListener != null)
	        	printListener.onPrint();*/
	        onPrint();
	        System.out.printf("   ���� : %d\n", total);
	        System.out.printf("   ��� : %f\n", avg);
	        System.out.println("��������������������������");
        }
	}

	/*
	 * �� �Լ��� print() �޼ҵ带 �������ϰ��� �� �� ������ ���Խ�Ű�� �ʹٸ�
	 * �� �Լ��� �������ؼ� ���ϴ� ������ ���Խ�....
	 */
	protected  abstract void onPrint();

	public void input() {
		
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
        
        exam.setKor(kor);
        exam.setEng(eng);
        exam.setMath(math);
	}	
}
