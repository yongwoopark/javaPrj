import java.util.Scanner;

public class OmokProgram {

	public static void main(String[] args) {
		for(int y=0; y<20; y++)
		{			
			for(int x=0; x<20; x++)
				if(x == 0 && y == 0)
					System.out.printf("%c", '┌');
				else if(x == 19 && y == 0)
					System.out.printf("%c", '┐');
				else if(x == 0 && y == 19)
					System.out.printf("%c", '└');
				else if(x == 19 && y == 19)
					System.out.printf("%c", '┘');
			
				else if(x == 0)
					System.out.printf("%c", '├');
				else if(x == 19)
					System.out.printf("%c", '┤');
				else if(y == 0)
					System.out.printf("%c", '┬');
				else if(y == 19)
					System.out.printf("%c", '┴');
			
				else
					System.out.printf("%c", '┼');		
			
			System.out.println();
		}
		
		Scanner scan = new Scanner(System.in);
		// 사용자에게 오목 좌표 하나를 입력 받는다.
		int omokX, omokY; // 오목
		System.out.print("오목 좌표 입력( x sp y ) : ");
		omokX = scan.nextInt();
		omokY = scan.nextInt();
		
		// 오목판 출력
		for(int y=0; y<20; y++)
		{			
			for(int x=0; x<20; x++)
				// 특정 위치 조건			
				if (x == omokX && y == omokY)
					System.out.printf("%c", '○');
				else if(x == 0 && y == 0)
					System.out.printf("%c", '┌');
				else if(x == 19 && y == 0)
					System.out.printf("%c", '┐');
				else if(x == 0 && y == 19)
					System.out.printf("%c", '└');
				else if(x == 19 && y == 19)
					System.out.printf("%c", '┘');				
				// 외벽
				else if(x == 0)
					System.out.printf("%c", '├');
				else if(x == 19)
					System.out.printf("%c", '┤');
				else if(y == 0)
					System.out.printf("%c", '┬');
				else if(y == 19)
					System.out.printf("%c", '┴');
				// 나머지
				else
					System.out.printf("%c", '┼');		
			
			System.out.println();
		}
	}

}
