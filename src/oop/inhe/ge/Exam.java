package oop.inhe.ge;

import java.util.Scanner;

/**
 * ���� : �� Ŭ������ ���� �и��̹Ƿ� ���� �����ؼ� ����ؼ��� �ȵ˴ϴ�.
 * �ݵ�� �� Ŭ������ Ȯ���ؼ� ���ļ� ����Ͻʽÿ�.
 * @author newlec
 *
 */

/*
 * ���� 1 : Generic�� �̿��� ���� ���� �ڵ��� ��ŭ��
 */

public abstract class Exam {
	private int kor;
	private int eng;
	private int math;
	private AvgListener avgListener;
		
	public void setAvgListener(AvgListener avgListener) {
		this.avgListener = avgListener;
	}
	
	public float avg(){
		return avgListener.avg();		
	}

	public Exam() {
		this(0,0,0);
	}
	
	public Exam(int kor, int eng,int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	public int total() {
		
		return kor + eng + math; 
	}
	

}
