import java.util.Scanner;

public class OmokProgram2 {

	public static void main(String[] args) {
		
		int width = 25;
		int height = 15;
		//오목판 배열 생성
		char[] board = new char[height*width];
		
		//- 오목판 초기화 ---------------------------
		for(int i=0; i<height*width; i++)
			board[i] = '┼';
		
		// 좌표를 이용한 오목 두기 또는 테두리 그리기
		/*board[width*0 + 0] = '┌';
		board[width*0 + 24] = '┐';
		board[width*14 + 0] = '└';
		board[width*14 + 24] = '┘';*/
		
		board[width*(3-1) + (3-1)] = '○';
		
		//- 오목판 출력 -----------------------------
		for(int y=0; y<height; y++)
		{
			for(int x=0; x<width; x++)
				System.out.printf("%c", board[y*width + x]);
			
			System.out.println();
		}
			
	}

}
