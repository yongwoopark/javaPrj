package app.omok;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board board = new Board();
		//boolean isWhiteTurn = false;
		
		while (true) {
			board.print();
			
			Stone stone = new Stone();
			// type 값을 설정하는 코드를 main 에서 책임지도록 한 코드
			stone.input();
			//stone.setType(isWhiteTurn ? 2/* white */ : 1/* black */ );
			//isWhiteTurn = !isWhiteTurn;
			
			boolean duplicated = board.checkDuplicated(stone);
			if(duplicated)
				printError();
			else
				board.add(stone);
			
			//board.putStone(stone);			
		}
	}

	private static void printError() {
		// TODO Auto-generated method stub
		System.out.println("오류~~");
	}

}
