package app.omok;

import java.util.Scanner;

public class Stone {
	private int x;
	private int y;
	private int type;
	
	private static boolean isWhiteTurn;
	
	static{
		isWhiteTurn = false;
	}
	
	public static void toggleTurn(){
		isWhiteTurn = ! isWhiteTurn;
	}
	
	public Stone() {
		x = -1;
		y = -1;
		type = 1; // °ËÀºµ¹
	}
	
	public void input(){
		Scanner scan = new Scanner(System.in);
		System.out.print("x sp y > ");

		x = scan.nextInt();
		y = scan.nextInt();
		
		type = isWhiteTurn ? 2/* white */ : 1/* black */;
		//isWhiteTurn = ! isWhiteTurn;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	
}
