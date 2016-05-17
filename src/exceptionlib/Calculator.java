package exceptionlib;

public class Calculator {
	
	public static int add(int x, int y){
		
		int result = x + y;
		
		return result;
	}
	
	public static int sub(int x, int y){
		int result = x - y;
		
		return result;
	}
	
	public static int multi(int x, int y){
		int result = x * y;
		
		return result;
	}
	
	public static int div(int x, int y) throws 영으로나눈예외오류, 범위를벗어난예외오류{
		
		if(y==0)
			throw new 영으로나눈예외오류();
		
		if(!(0 <= x && x <=100))
			throw new 범위를벗어난예외오류();
		
		int result = x / y;
		
		return result;
	}
}
