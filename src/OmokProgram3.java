import java.util.Scanner;

public class OmokProgram3 {

	public static void main(String[] args) {
		
		int width = 25;
		int height = 15;
		//������ �迭 ����
		char[][] board = new char[height][width];
		
		int[] xs = new int[400];
		int[] ys = new int[400];
		int[] types = new int[400];
		int count = 0;
		
		//- ������ �ʱ�ȭ ---------------------------
		for(int y=0; y<height; y++)		
			for(int x=0; x<width; x++)
				board[y][x] = '��';
		
		// �׵θ� �׸��� : ���ڷ��̼�
		for(int i=0; i<width; i++)
			board[0][i] = '��';
		for(int i=0; i<width; i++)
			board[height-1][i] = '��';
		for(int i=0; i<height; i++)
			board[i][0] = '��';
		for(int i=0; i<height; i++)
			board[i][width-1] = '��';
		
		board[0][0] = '��';
		board[0][width-1] = '��';
		board[height-1][0] = '��';
		board[height-1][width-1] = '��';			
		
		// ���� : �̺κ��� ���� ���ٲ���.... ���� ������...
		// ����� �Է��� �޴� ����
		int ox;
		int oy;
		int otype;
		
		ox = 5;
		oy = 7;
		otype = 1;//�Ͼᵹ 1, ������ 2
		
		xs[count] = ox;
		ys[count] = oy;
		types[count] = otype;
		count++;	
				
		// ����� �Է¿� ���� ��ġ�� ������ �δ� ����
		for(int i=0; i<count; i++)
			// �� �κ��� ��ġ�ÿ�. 
			// ������ ��������, xs, ys, types�� �̿��ؼ�			
			// board[(3-1)][(3-1)] = '��';
		    // ���� : ���� �ڵ带 ����ó�� ���ƾ������~~
			board[(ys[i]-1)][(xs[i]-1)] = '��';
		
		//- ������ ��� -----------------------------
		for(int y=0; y<height; y++)
		{
			for(int x=0; x<width; x++)
				System.out.printf("%c", board[y][x]);
			
			System.out.println();
		}
			
	}

}
