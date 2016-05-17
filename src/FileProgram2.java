import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class FileProgram2 {
	
	//3+4;
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("res/images/photo.bmp");		
		FileOutputStream fos = new FileOutputStream("res/images/photo-copy.bmp");
		// ���� ��� ���� �����ϱ� -=-=-=-=-=-=-=-=-=
		byte[] fileHeader = new byte[14];
		
		fis.read(fileHeader);
		
		// Big Endian �� -> Little Endian ���� �б�
		// [0][1][2][3] -> int totalSize;
		int totalSize = ((int)fileHeader[5] & 0b11111111) << 24 |
							((int)fileHeader[4] & 0xff) << 16 |
							((int)fileHeader[3] & 0xff) << 8 |
							((int)fileHeader[2] & 0xff) << 0;
		
		System.out.println("bmp file size: " + totalSize);
				
		/*����Ʈ ���� ���� ���� ��� 3*/
		// �絿�̸� �̿��� ���� ����
		/*byte[] buf = new byte[1024];
		
		int size;
		
		while((size=fis.read(buf)) != -1) 
				fos.write(buf, 0, size);*/
		
		/*����Ʈ ���� ���� ���� ��� 2*/
		//while(fis.read() != -1)
		//	fos.write(fis.read());
		
		// �Ϻ���~~~-> �����̰�~~~~ ���� ����� ������ �����..
		// Ȥ�� ���� �𸣰�  ���� �˰����� �����Ѱǰ� ??? ���..
		// ��.�� ����� Ȧ����° ����Ʈ�� ���� ���簡 ��...
		//                  ����ó�� ���ľ� ��. ��
		
		/*int n;
		while((n = fis.read()) != -1)
			fos.write(n);*/
		
		// �� �ڵ� ���� ¾��~~~ Ȯ~~~�����.....
		// �׷� ���1 vs ���2 � �ڵ尡 �� �ٶ���?�� �ڵ��ϱ�?
		
		/*����Ʈ ���� ���� ���� ��� 1*/
		/*--------------------------
		int n;
		
		while(true)
		{
			n = fis.read();
			
			if(n == -1)
				break;
			else			
				fos.write(n);
		}*/
		
		fis.close();
		fos.close();
	}
}
