// 함수 모듈로 분리하는 로또 프로그램

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class LottoProgram5 {

	public static int inputMainMenu()
	{
		Scanner scan = new Scanner(System.in);
		int menu;
		System.out.println("로또 메인 메뉴");
		System.out.println("   1. 번호 목록 ");						
		System.out.println("   2. 번호 읽기 ");
		System.out.println("   3. 번호 저장 ");
		System.out.println("   4. 종료 ");
		menu = scan.nextInt();		
		
		return menu;
	}
	
	//로또 번호 생성
	public static void genLotto(int[] lotto)
	{	
		Random rand = new Random();
		
		for(int i=0; i<6; i++)
			lotto[i] = rand.nextInt(45)+1;
	}
	
	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		// 컬렉팅 하기 위한 변수들과 함께 저장소 변수 선언
		int[][] lottos = new int[10][6];
		int current = -1;
		
		MAIN_EXIT:
		while(true)
		{
			// 메인 메뉴 입력
			//int menu = inputMainMenu();
			
			switch(inputMainMenu())
			{
			case 1:
			{
				// 로또 번호 관리
				manageLotto(lottos, current);
			}
				break;
			case 2:
								
				FileInputStream fis = new FileInputStream("res/lotto/lottos.txt");
				
				current = -1;
				
				int count = fis.read();
				
				for(int n=0; n<count; n++) // 읽을 로또가 몇개?
				{									
					
					int[] lotto = lottos[n];					
					
					for(int i=0; i<6; i++) // 로또 번호가 몇 개? ex : 3 9 13 16 21 34
						lotto[i] = fis.read();				
					
					current++;
				}
				
				fis.close();
				
				System.out.println("데이터 읽기가 완료되었습니다.");
				break;
			case 3:
				// 숫자로 저장할 때 
				// "32434567" -> 16 Byte
				// 32434567 -> 4 Byte
				FileOutputStream fos = new FileOutputStream("res/lotto/lottos.txt");
				
				fos.write(current+1);
				
				for(int n=0; n<current+1; n++){
					int[] lotto = lottos[n];			
					for(int i=0; i<6; i++)
						fos.write(lotto[i]);
				}
				
				fos.close();				
				
				// 문자로 저장할 때
				/*FileOutputStream fos = new FileOutputStream("res/lotto/lottos.txt");
				PrintStream fout = new PrintStream(fos);
												
				for(int i=0; i<current+1; i++){
					int[] lotto = lottos[i];			
					fout.printf("%d %d %d %d %d %d\r\n",
							i+1, 
							lotto[0], lotto[1], 
							lotto[2], lotto[3], 
							lotto[4], lotto[5]);
				}
				
				fout.close();
				fos.close();*/
				break;
			case 4:
				break MAIN_EXIT;
			}
		}		
		
	}

	private static void manageLotto(int[][] lottos, int current) {
		menu1:
			while(true)
			{
				// 로또 번호 관리
				// ->로또번호목록
				// ->로또번호과닐메뉴
				int smenu;
				System.out.println("로또 목록 -------------");
				// 목록 출력 코드를 작성		
				/*
				 1 : 4 5 10 22 25 30
				 2 : 4 5 10 22 25 30
				 3 : 4 5 10 22 25 30
				 4 : 4 5 10 22 25 30
				 */
				/*for(int i=0; i<current+1; i++)
					System.out.printf("%d : %d %d %d %d %d %d\n",
							i+1, 
							lottos[i][0], lottos[i][1], 
							lottos[i][2], lottos[i][3], 
							lottos[i][4], lottos[i][5]);*/
				//--↑이게 좋아?(1번)   ↓ 이게 좋아?(2번)--------------------------------------------				
				for(int i=0; i<current+1; i++){
					int[] lotto = lottos[i];					
					System.out.printf("%d : %d %d %d %d %d %d\n",
							i+1, 
							lotto[0], lotto[1],
							lotto[2], lotto[3],
							lotto[4], lotto[5]);
				}
				
				System.out.println(" ------------------------------");
				System.out.println("   1. 번호 생성 ");
				System.out.println("   2. 번호 입력 ");
				System.out.println("   3. 상위 메뉴 ");	
				smenu = scan.nextInt();
				
				switch(smenu)
				{
				case 1:						
					int[] lotto = new int[6];
							
					// 로또 번호 생성
					genLotto(lotto);
									
					//정렬하기
					sortLotto(lotto);	
					
					// lotto 에 있는 값을 lottos로 옮기는 작업
					current++;
					for(int i=0; i<6; i++)
						lottos[current][i] = lotto[i];
					break;
				case 2:
					break;
				case 3: // switch? while? 을 벗어나야 함
					break menu1;
				}	
			}
	}

	private static void sortLotto(int[] lotto) {
		int temp;
		
		for(int j=0; j<5; j++)
			for(int i=0; i<5-j; i++)
				if(lotto[i+0] > lotto[i+1])
				{
					temp = lotto[i+0]; 
					lotto[i+0] = lotto[i+1];
					lotto[i+1] = temp;
				}	
	}

}
