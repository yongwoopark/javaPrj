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
	
	public static int div(int x, int y) throws �����γ������ܿ���, ������������ܿ���{
		
		if(y==0)
			throw new �����γ������ܿ���();
		
		if(!(0 <= x && x <=100))
			throw new ������������ܿ���();
		
		int result = x / y;
		
		return result;
	}
}
