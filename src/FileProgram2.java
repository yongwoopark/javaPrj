import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class FileProgram2 {
	
	//3+4;
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("res/images/photo.bmp");		
		FileOutputStream fos = new FileOutputStream("res/images/photo-copy.bmp");
		// 파일 헤더 정보 추출하기 -=-=-=-=-=-=-=-=-=
		byte[] fileHeader = new byte[14];
		
		fis.read(fileHeader);
		
		// Big Endian 을 -> Little Endian 으로 읽기
		// [0][1][2][3] -> int totalSize;
		int totalSize = ((int)fileHeader[5] & 0b11111111) << 24 |
							((int)fileHeader[4] & 0xff) << 16 |
							((int)fileHeader[3] & 0xff) << 8 |
							((int)fileHeader[2] & 0xff) << 0;
		
		System.out.println("bmp file size: " + totalSize);
				
		/*바이트 단위 파일 복사 방법 3*/
		// 양동이를 이용한 파일 복사
		/*byte[] buf = new byte[1024];
		
		int size;
		
		while((size=fis.read(buf)) != -1) 
				fos.write(buf, 0, size);*/
		
		/*바이트 단위 파일 복사 방법 2*/
		//while(fis.read() != -1)
		//	fos.write(fis.read());
		
		// 완벽해~~~-> 오마이갓~~~~ 파일 사이즈가 반으로 쭐었어..
		// 혹시 나도 모르게  압축 알고리즘을 개발한건가 ??? 우앗..
		// ㅜ.ㅜ 사실은 홀수번째 바이트가 빠진 복사가 됨...
		//                  다음처럼 고쳐야 함. ↓
		
		/*int n;
		while((n = fis.read()) != -1)
			fos.write(n);*/
		
		// 이 코드 뭔가 쩐다~~~ 확~~~쭐었어.....
		// 그럼 방법1 vs 방법2 어떤 코드가 더 바람직?한 코드일까?
		
		/*바이트 단위 파일 복사 방법 1*/
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
