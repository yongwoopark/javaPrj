package group2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		   
		///////�⺻ �޷� ���
		Scanner scan = new Scanner(System.in);
		ShowCal showcal= new ShowCal();
		showcal.makeCal();
		int a,b,c;

		//////////////�޴� ����////////////////
		while(true){
		switch(selectMenu()){
			case 1:{/// �� �˻� --> �� �� �Է�
				System.out.println("���ϴ� ��,���� �Է����ּ���.");
				System.out.println("(Year sp Mon)");
				try {
					a=scan.nextInt();
					b=scan.nextInt();
					showcal = new ShowCal();
					showcal.makeCal(a,b);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			}
			case 2:{// ��¥ �˻� --> �� �� ��
				System.out.println("���ϴ� ��,��,�� �Է����ּ���.");
				System.out.println("(Year sp Mon sp Day)");
				try {
					a=scan.nextInt();
					b=scan.nextInt();
					c=scan.nextInt();
					showcal = new ShowCal();
					showcal.makeCal(a,b,c);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			}
			case 3:{ // ���α׷� ����
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			}
			default:
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
		}
		}
	}
	private static int selectMenu() {
		System.out.println("�޴��� �������ּ���");
		System.out.println("1. �� �˻��ϱ�"); // (1 sp Year sp Mon)
		System.out.println("2. ��¥ �˻��ϱ�"); // (2 sp Year sp Mon sp Day)
		System.out.println("3. ���α׷� ����");
		System.out.println("����>");
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
}