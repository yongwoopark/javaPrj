
public class AlPhaProgram {
	public static void main(String[] args){
		
		int cnt = 'Z'-'A'+1;
		/*for(int i=0; i<cnt; i++)
			System.out.printf("%c", 'A'+i);*/
		
		/*
		 Z~A ������ ����Ͻÿ�.
		 �׽�Ʈ ���� : ���� ���ڸ� ������(��� ���� �߽��� �ΰ� �ùٷ� ����� �� �� �ִ���)
		 �־��� �ڵ� : �ʰ��ﰣ �¿��
		 */
		/*for(int i=0; i<cnt; i++)
			System.out.printf("%c", 'Z'-i);*/		
		
		/*
		 �� �� ������ ���ĺ��� ����Ͻÿ�. 
		 �� A~Z �Ŀ� �ٽ� A~Z�� ��� �ǵ��� �Ͻÿ�.
		 �׽�Ʈ ���� : �ݺ� ��ȯ ���ڸ� ������(���� ����).
		 �־��� �ڵ� : ���� ����.   
		 */
		/*cnt *= 2;		
		for(int i=0; i<cnt; i++)
			System.out.printf("%c", 'A'+(i%26));*/
		
		/*
		 A~ZZ~A ������ ���ĺ��� ����Ͻÿ�.
		 ��Ʈ : ���׿����� ? : �� ����� ��.		 
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
