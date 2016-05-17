// 함수 모듈로 분리하는 로또 프로그램

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class LottoProgram6 {
	public static void main(String[] args){
		// 메인 메뉴 입력
		int menu = inputMainMenu();
		
		int[][] lottos = new int[10][6];
		
		switch(menu)
		{
		case 1:
			// 로또 자동생성
			genLottoAuto(lottos);			
			break;
		case 2:
			// 로또 수동생성
			genLottoManual(lottos);			
			// 수동 번호 입력			
			break;
		}		
	}
	private static int inputMainMenu() {
		return 0;
	}
	private static void genLottoManual(int[][] lottos) {
	}
	private static void genLottoAuto(int[][] lottos) {
		// 생성할 개수 입력
		int count = inputLottoCount();		
		// 로또 목록 출력
		printLottos(lottos);		
		// ....
	}
	private static void printLottos(int[][] lottos) {		
	}
	private static int inputLottoCount() {
		return 0;
	}
}
