import java.util.Scanner;

public class OmokProgram2_1 {

	public static void main(String[] args) {
		
		int width = 25;
		int height = 15;
		//������ �迭 ����
		char[] board = new char[height*width];
		
		//- ������ �ʱ�ȭ ---------------------------
		for(int i=0; i<height*width; i++)
			board[i] = '��';
				
		int ox = 3;
		int oy = 5;
		board[oy*width + ox] = '��';
		
		// ��ǥ�� �̿��� ���� �α� �Ǵ� �׵θ� �׸���
		/*board[width*0 + 0] = '��';
		board[width*0 + 24] = '��';
		board[width*14 + 0] = '��';
		board[width*14 + 24] = '��';*/
				
		//- ������ ��� -----------------------------
		for(int y=0; y<height; y++)
		{
			for(int x=0; x<width; x++)
				System.out.printf("%c", board[y*width + x]);
			
			System.out.println();
		}
			
	}

}
