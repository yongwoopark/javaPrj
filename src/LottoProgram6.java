// �Լ� ���� �и��ϴ� �ζ� ���α׷�

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class LottoProgram6 {
	public static void main(String[] args){
		// ���� �޴� �Է�
		int menu = inputMainMenu();
		
		int[][] lottos = new int[10][6];
		
		switch(menu)
		{
		case 1:
			// �ζ� �ڵ�����
			genLottoAuto(lottos);			
			break;
		case 2:
			// �ζ� ��������
			genLottoManual(lottos);			
			// ���� ��ȣ �Է�			
			break;
		}		
	}
	private static int inputMainMenu() {
		return 0;
	}
	private static void genLottoManual(int[][] lottos) {
	}
	private static void genLottoAuto(int[][] lottos) {
		// ������ ���� �Է�
		int count = inputLottoCount();		
		// �ζ� ��� ���
		printLottos(lottos);		
		// ....
	}
	private static void printLottos(int[][] lottos) {		
	}
	private static int inputLottoCount() {
		return 0;
	}
}
