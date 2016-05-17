
public class StarProgram {

	public static void main(String[] args) {
		
		for(int y=1; y<=20; y++)
		{
			for(int x=1; x<=20; x++)
				if(x == 3 && y == 3)
					System.out.print("¡Ù");
				else
					System.out.print("¡Û");
			
			System.out.println();
		}		
		
		
		/*for(int i=0, n=1; i<20; i++)
			if(i+1 == 2+(n-1)*3)   // 2, 5, 8, 11, 14, 17, 20  an=a1+(n-1)d
			{
				System.out.print("¡Ù");
				n++;
			}
			else
				System.out.print("¡Û");*/
		
	}
}
