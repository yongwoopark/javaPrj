import java.util.Scanner;

public class OmokProgram {

	public static void main(String[] args) {
		for(int y=0; y<20; y++)
		{			
			for(int x=0; x<20; x++)
				if(x == 0 && y == 0)
					System.out.printf("%c", '��');
				else if(x == 19 && y == 0)
					System.out.printf("%c", '��');
				else if(x == 0 && y == 19)
					System.out.printf("%c", '��');
				else if(x == 19 && y == 19)
					System.out.printf("%c", '��');
			
				else if(x == 0)
					System.out.printf("%c", '��');
				else if(x == 19)
					System.out.printf("%c", '��');
				else if(y == 0)
					System.out.printf("%c", '��');
				else if(y == 19)
					System.out.printf("%c", '��');
			
				else
					System.out.printf("%c", '��');		
			
			System.out.println();
		}
		
		Scanner scan = new Scanner(System.in);
		// ����ڿ��� ���� ��ǥ �ϳ��� �Է� �޴´�.
		int omokX, omokY; // ����
		System.out.print("���� ��ǥ �Է�( x sp y ) : ");
		omokX = scan.nextInt();
		omokY = scan.nextInt();
		
		// ������ ���
		for(int y=0; y<20; y++)
		{			
			for(int x=0; x<20; x++)
				// Ư�� ��ġ ����			
				if (x == omokX && y == omokY)
					System.out.printf("%c", '��');
				else if(x == 0 && y == 0)
					System.out.printf("%c", '��');
				else if(x == 19 && y == 0)
					System.out.printf("%c", '��');
				else if(x == 0 && y == 19)
					System.out.printf("%c", '��');
				else if(x == 19 && y == 19)
					System.out.printf("%c", '��');				
				// �ܺ�
				else if(x == 0)
					System.out.printf("%c", '��');
				else if(x == 19)
					System.out.printf("%c", '��');
				else if(y == 0)
					System.out.printf("%c", '��');
				else if(y == 19)
					System.out.printf("%c", '��');
				// ������
				else
					System.out.printf("%c", '��');		
			
			System.out.println();
		}
	}

}
