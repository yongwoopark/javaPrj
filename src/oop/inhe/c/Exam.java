package oop.inhe.c;

import java.util.Scanner;

/**
 * ���� : �� Ŭ������ ���� �и��̹Ƿ� ���� �����ؼ� ����ؼ��� �ȵ˴ϴ�.
 * �ݵ�� �� Ŭ������ Ȯ���ؼ� ���ļ� ����Ͻʽÿ�.
 * @author newlec
 *
 */

/*
 * ���� ���� ������ �д� �༮���� ������ Į�ڷ縦 ���� ���� �� �ۿ�
 * �׷��� �����Ǵ� Ű���尡 abstract�� 
 * �� Ű����� �� Ŭ������ �߻�(����, �Ϲ�)Ŭ�������� �����Ϸ�����
 * ���������ν� �����Ϸ��� Ȯ������ �ʰ� ���� ��쿡 ������ �߻������� ����
 * Ȯ���ϵ��� �Ѵ��̿�~ 
 */

public abstract class Exam {
	private int kor;
	private int eng;
	private int math;
	
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
	
	public float avg(){
		return total()/3.0f;		
	}
}
