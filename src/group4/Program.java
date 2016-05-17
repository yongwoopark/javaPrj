package group4;

import java.util.Calendar;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		CalendarConsole cal;
		Calendar calu = Calendar.getInstance();
		int yyyy = calu.get(Calendar.YEAR);
	    int mm = calu.get(Calendar.MONTH)+1;      // 0 to 11
	    int dd = calu.get(Calendar.DATE);

	    
		cal = new CalendarConsole(yyyy,mm);
		cal.printCal(yyyy,mm,dd, true); 
		out: while (true) {
			

			// ���� �޷� �Լ� //			
		
			System.out.println("����������������������������������������������������������");
			System.out.println("\t\t\t\t1. �� �޷� ����");
			System.out.println("\t\t\t\t2. ��¥ ��� ���� ");
			System.out.println("\t\t\t\t3. ����");
			System.out.println("����������������������������������������������������������");
			System.out.println("�Է�> ");
			int menu = scan.nextInt();

			switch (menu) {

			case 1:

				System.out.println(" �� �� �Է��ϼ���:  YYYY sp MM");
				int year = scan.nextInt();
				int month = scan.nextInt();

				try {
					cal = new CalendarConsole(year, month);
					cal.printCal(year, month,1,false);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case 2:
				System.out.println(" �� �� �� �Է��ϼ���: YYYY sp MM sp DD");
				int year1 = scan.nextInt();
				int month1 = scan.nextInt();
				int day1 = scan.nextInt();
				
				try {
					cal = new CalendarConsole(year1, month1);
					cal.printCal(year1, month1,day1,true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
			case 3:

				System.out.println("���α׷��� �����մϴ�");
				break out;

			}

		}

	}


}
