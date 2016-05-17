package app.omok;

public class Board {
	private int width;
	private int height;
	private char[][] buf;
	private Stone[] stones;
	private int current;

	public Board() {
		width = 20;
		height = 10;
		buf = new char[height][width];
		
		stones = new Stone[width * height];
		current = -1;

		//initBoard();

	}

	private void initBoard() {
		// - 오목판 초기화 ---------------------------
		for (int y = 0; y < height; y++)
			for (int x = 0; x < width; x++)
				buf[y][x] = '┼';

		// 테두리 그리기 : 데코레이션
		for (int i = 0; i < width; i++)
			buf[0][i] = '┬';
		for (int i = 0; i < width; i++)
			buf[height - 1][i] = '┴';
		for (int i = 0; i < height; i++)
			buf[i][0] = '├';
		for (int i = 0; i < height; i++)
			buf[i][width - 1] = '┤';

		buf[0][0] = '┌';
		buf[0][width - 1] = '┐';
		buf[height - 1][0] = '└';
		buf[height - 1][width - 1] = '┘';
	}

	public void print() {
		
		initBoard();
		
		for(int i=0; i<current+1; i++)
			putStone(stones[i]);
		
		for(int y=0; y<height; y++)
		{
			for(int x=0; x<width; x++)
				System.out.printf("%c", buf[y][x]);
			
			System.out.println();
		}
	}

	public void putStone(Stone stone) {
		buf[stone.getY()][stone.getX()] = stone.getType() == 1 ? '●' : '○';
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public char[][] getBuf() {
		return buf;
	}

	public void setBuf(char[][] buf) {
		this.buf = buf;
	}

	public Stone[] getStones() {
		return stones;
	}

	public void setStones(Stone[] stones) {
		this.stones = stones;
	}

	public void add(Stone stone) {
		stones[++current] = stone;
		
		Stone.toggleTurn();
		//putStone(stone);
	}

	public boolean checkDuplicated(Stone stone) {
		
		for(int i=0; i<current+1; i++)
			if(stones[i].getX() == stone.getX() && stones[i].getY() == stone.getY())			
				return true;
		
		return false;
	}

}
