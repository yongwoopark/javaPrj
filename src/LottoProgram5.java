// �Լ� ���� �и��ϴ� �ζ� ���α׷�

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
		System.out.println("�ζ� ���� �޴�");
		System.out.println("   1. ��ȣ ��� ");						
		System.out.println("   2. ��ȣ �б� ");
		System.out.println("   3. ��ȣ ���� ");
		System.out.println("   4. ���� ");
		menu = scan.nextInt();		
		
		return menu;
	}
	
	//�ζ� ��ȣ ����
	public static void genLotto(int[] lotto)
	{	
		Random rand = new Random();
		
		for(int i=0; i<6; i++)
			lotto[i] = rand.nextInt(45)+1;
	}
	
	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		// �÷��� �ϱ� ���� ������� �Բ� ����� ���� ����
		int[][] lottos = new int[10][6];
		int current = -1;
		
		MAIN_EXIT:
		while(true)
		{
			// ���� �޴� �Է�
			//int menu = inputMainMenu();
			
			switch(inputMainMenu())
			{
			case 1:
			{
				// �ζ� ��ȣ ����
				manageLotto(lottos, current);
			}
				break;
			case 2:
								
				FileInputStream fis = new FileInputStream("res/lotto/lottos.txt");
				
				current = -1;
				
				int count = fis.read();
				
				for(int n=0; n<count; n++) // ���� �ζǰ� �?
				{									
					
					int[] lotto = lottos[n];					
					
					for(int i=0; i<6; i++) // �ζ� ��ȣ�� �� ��? ex : 3 9 13 16 21 34
						lotto[i] = fis.read();				
					
					current++;
				}
				
				fis.close();
				
				System.out.println("������ �бⰡ �Ϸ�Ǿ����ϴ�.");
				break;
			case 3:
				// ���ڷ� ������ �� 
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
				
				// ���ڷ� ������ ��
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
				// �ζ� ��ȣ ����
				// ->�ζǹ�ȣ���
				// ->�ζǹ�ȣ���Ҹ޴�
				int smenu;
				System.out.println("�ζ� ��� -------------");
				// ��� ��� �ڵ带 �ۼ�		
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
				//--���̰� ����?(1��)   �� �̰� ����?(2��)--------------------------------------------				
				for(int i=0; i<current+1; i++){
					int[] lotto = lottos[i];					
					System.out.printf("%d : %d %d %d %d %d %d\n",
							i+1, 
							lotto[0], lotto[1],
							lotto[2], lotto[3],
							lotto[4], lotto[5]);
				}
				
				System.out.println(" ------------------------------");
				System.out.println("   1. ��ȣ ���� ");
				System.out.println("   2. ��ȣ �Է� ");
				System.out.println("   3. ���� �޴� ");	
				smenu = scan.nextInt();
				
				switch(smenu)
				{
				case 1:						
					int[] lotto = new int[6];
							
					// �ζ� ��ȣ ����
					genLotto(lotto);
									
					//�����ϱ�
					sortLotto(lotto);	
					
					// lotto �� �ִ� ���� lottos�� �ű�� �۾�
					current++;
					for(int i=0; i<6; i++)
						lottos[current][i] = lotto[i];
					break;
				case 2:
					break;
				case 3: // switch? while? �� ����� ��
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
