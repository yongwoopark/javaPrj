import java.util.Scanner;

/*
   �ۼ��� : 2016-02-24
   �ۼ��� : newlec
   ���۱� : ����� ��   
 */

public class Program2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total;
		float avg;
		
		int menu;
		
		/*kor=50;
		eng=10;
		math= 100;*/
		
		���:
		while(true)
		{	
			System.out.println("��������������������������");
	        System.out.println("��          ����  �޴�         ��");
	        System.out.println("��������������������������");
	        System.out.println(" 1.����  �Է�");
	        System.out.println(" 2.����  ���");
	        System.out.println(" 3.����");
	        System.out.println(" ����>");
	        
	        menu = scan.nextInt();
			
	        switch(menu){
	        case 1:
		        {
					// ���� �Է� �ڵ� �ۼ�
					System.out.println("��������������������������");
			        System.out.println("��          ����  �Է�         ��");
			        System.out.println("��������������������������");
			        System.out.print("   ���� : ");
			        kor = scan.nextInt();
			        System.out.print("   ���� : ");
			        eng = scan.nextInt();
			        System.out.print("   ���� : ");
			        math = scan.nextInt();
		        }	
		        break;
	        case 2:
		        {
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
		        break;
	        case 3:
		        {
		        	System.out.println("Good Bye~");
		        	break ���;
		        }    
		        
		    default:
		    	{
		        	System.out.println("��ȿ���� ���� �޴��� �����߽��ϴ�.1~3�������� ������ �� �ֽ��ϴ�.");	        	
		        }		    	
	        }
		}
		
	}

}
