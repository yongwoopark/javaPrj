import java.util.Random;

public class LottoProgram2 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int[] lotto = new int[6];
		int bonus = 0;
		
		// 숙제 : 중복 검사 입력
		for(int i=0; i<6; i++)
				lotto[i] = rand.nextInt(45)+1;
		// 번호 출력
		for(int i=0; i<6; i++)
			System.out.printf("%d ", lotto[i]);
		
		System.out.println();
		
		//정렬하기
		int temp;
		
		for(int j=0; j<5; j++)
			for(int i=0; i<5-j; i++)
				if(lotto[i+0] > lotto[i+1])
				{
					temp = lotto[i+0]; 
					lotto[i+0] = lotto[i+1];
					lotto[i+1] = temp;
				}		
		
		// 번호 출력
		for(int i=0; i<6; i++)
				System.out.printf("%d ", lotto[i]);
		System.out.println();
	}

}
