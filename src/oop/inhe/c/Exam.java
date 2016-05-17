package oop.inhe.c;

import java.util.Scanner;

/**
 * 주의 : 이 클래스는 공통 분모이므로 직접 생성해서 사용해서는 안됩니다.
 * 반드시 이 클래스를 확장해서 고쳐서 사용하십시오.
 * @author newlec
 *
 */

/*
 * 위와 같은 설명을 읽는 녀석들이 없으니 칼자루를 내가 가질 수 밖에
 * 그래서 제공되는 키워드가 abstract다 
 * 이 키워드는 이 클래스는 추상(공통, 일반)클래스임을 컴파일러에게
 * 밝혀줌으로써 컴파일러가 확장하지 않고 쓰는 경우에 오류를 발생시켜줄 것을
 * 확신하도록 한다이요~ 
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
