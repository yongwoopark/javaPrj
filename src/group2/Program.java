package group2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		   
		///////기본 달력 출력
		Scanner scan = new Scanner(System.in);
		ShowCal showcal= new ShowCal();
		showcal.makeCal();
		int a,b,c;

		//////////////메뉴 선택////////////////
		while(true){
		switch(selectMenu()){
			case 1:{/// 월 검색 --> 년 월 입력
				System.out.println("원하는 년,월을 입력해주세요.");
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
			case 2:{// 날짜 검색 --> 년 월 일
				System.out.println("원하는 년,월,일 입력해주세요.");
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
			case 3:{ // 프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
			default:
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
		}
		}
	}
	private static int selectMenu() {
		System.out.println("메뉴를 선택해주세요");
		System.out.println("1. 달 검색하기"); // (1 sp Year sp Mon)
		System.out.println("2. 날짜 검색하기"); // (2 sp Year sp Mon sp Day)
		System.out.println("3. 프로그램 종료");
		System.out.println("선택>");
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
}