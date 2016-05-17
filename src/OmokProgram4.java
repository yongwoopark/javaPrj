import java.util.Scanner;

public class OmokProgram4 {

	public static void main(String[] args) {
		
		int width = 25;
		int height = 15;
		//오목판 배열 생성
		char[][] board = new char[height][width];
		
		int[] xs = new int[width*height];
		int[] ys = new int[width*height];
		int[] types = new int[width*height];
		int count = 0;
		
		int ox;
		int oy;
		int otype;
		
		Scanner scan = new Scanner(System.in);
		
		//- 오목판 초기화 ---------------------------
		for(int y=0; y<height; y++)		
			for(int x=0; x<width; x++)
				board[y][x] = '┼';
		
		/*// 테두리 그리기 : 데코레이션
		for(int i=0; i<width; i++)
			board[0][i] = '┬';
		for(int i=0; i<width; i++)
			board[height-1][i] = '┴';
		for(int i=0; i<height; i++)
			board[i][0] = '├';
		for(int i=0; i<height; i++)
			board[i][width-1] = '┤';
		
		board[0][0] = '┌';
		board[0][width-1] = '┐';
		board[height-1][0] = '└';
		board[height-1][width-1] = '┘';			*/
		
		//- 오목판 출력 -----------------------------
		for(int y=0; y<height; y++)
		{
			for(int x=0; x<width; x++)
				System.out.printf("%c", board[y][x]);
			
			System.out.println();
		}
				
		while(true){
			// 문제 : 이부분은 내가 쳐줄께요.... 밑을 보세요...
			// 사용자 입력을 받는 로직				
			System.out.print("오목 두기 (x sp y) : ");
			
			ox = scan.nextInt();
			oy = scan.nextInt();
			otype = 1;//하얀돌 1, 검은돌 2
			
			xs[count] = ox;
			ys[count] = oy;
			types[count] = otype;
			count++;
			
			// 사용자 입력에 대한 위치에 오목을 두는 로직
			for(int i=0; i<count; i++)
				// 이 부분을 고치시오. 
				// 위에서 오목데이터, xs, ys, types를 이용해서			
				// board[(3-1)][(3-1)] = '○';
			    // 정답 : 위의 코드를 다음처럼 고쳤어야지요~~
				board[(ys[i]-1)][(xs[i]-1)] = '○';
			
			//- 오목판 출력 -----------------------------
			for(int y=0; y<height; y++)
			{
				for(int x=0; x<width; x++)
					System.out.printf("%c", board[y][x]);
				
				System.out.println();
			}
		}
			
	}

}
