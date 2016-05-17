package oop.inhe.ge;

import java.util.Scanner;

/**
 * 주의 : 이 클래스는 공통 분모이므로 직접 생성해서 사용해서는 안됩니다.
 * 반드시 이 클래스를 확장해서 고쳐서 사용하십시오.
 * @author newlec
 *
 */

/*
 * 문제 1 : Generic을 이용할 만한 곳이 코딱지 만큼이
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
