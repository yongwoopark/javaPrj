
public class AlPhaProgram {
	public static void main(String[] args){
		
		int cnt = 'Z'-'A'+1;
		/*for(int i=0; i<cnt; i++)
			System.out.printf("%c", 'A'+i);*/
		
		/*
		 Z~A 순으로 출력하시오.
		 테스트 목적 : 역순 숫자를 만들어내기(출력 값에 중심을 두고 올바로 만들어 낼 수 있는지)
		 최악의 코드 : 초가삼간 태우기
		 */
		/*for(int i=0; i<cnt; i++)
			System.out.printf("%c", 'Z'-i);*/		
		
		/*
		 두 배 길이의 알파벳을 출력하시오. 
		 단 A~Z 후에 다시 A~Z가 출력 되도록 하시오.
		 테스트 목적 : 반복 순환 숫자를 만들어내기(위와 같음).
		 최악의 코드 : 위와 같음.   
		 */
		/*cnt *= 2;		
		for(int i=0; i<cnt; i++)
			System.out.printf("%c", 'A'+(i%26));*/
		
		/*
		 A~ZZ~A 순으로 알파벳을 출력하시오.
		 힌트 : 삼항연산자 ? : 를 사용할 것.		 
		 */
		/*cnt *= 2;		
		for(int i=0; i<cnt; i++)
			System.out.printf("%c", i<26 ? 'A'+(i%26) : 'Z'-(i%26));*/
		
		cnt *= 2;		
		for(int i=0; i<cnt; i++)
		{
			if(i==3)
				continue;
			
			System.out.printf("%c", i<26 ? 'A'+(i%26) : 'Z'-(i%26));
		}			
		
	}
}
