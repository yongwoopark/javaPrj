import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileProgram {

	public static void main(String[] args) throws IOException {
		
		/*char[] str = new char[]{'H', 'e', 'l','l','o', 0, 'o','k', 0};
		
		System.out.println("Hello sdfs fsdfsdfd".substring(2));
		
		// ���ڿ� ��ġ��
		// -> +, concat(str)
		System.out.println("Good" + " bye~~");
		System.out.println("Good".concat(" bye~~"));
		// ���ڿ� ������
		// -> split() // lotto : 12 23 45
		String[] strs = "lotto : 12 23 45".split(" : ");
		System.out.println(strs[0]);
		System.out.println(strs[1]);
		// ���ڿ� ¥����
		"Hello".substring(2);
		// ���ڿ� ���ϱ�
		System.out.println("hello" == "hello");
		System.out.println("hello".equals("hello"));
		// ���ڿ� ã��
		"Hello".indexOf("el");
		int idx = "Hello how are you".indexOf("o");
		System.out.println(idx);
		idx = "Hello how are you".indexOf("o", idx+1);
		System.out.println(idx);
		idx = "Hello how are you".indexOf("o", idx+1);
		System.out.println(idx);
		
		String filename = "file1.txt";
		idx = filename.lastIndexOf(".");
		System.out.println(filename.substring(idx+1));	
		
		String path = "E:\\2016-02-22\\lotto.txt";*/
		
		// ���ڿ� ��ȯ->����->���ڿ�
		// "23"+"33" => ""
		// "23" -> 23
		/*int kor = Integer.parseInt("23");
		System.out.println(kor + 2);
		
		//String s = String.valueOf(kor);
		String s = "" + kor;
		System.out.println(s + "2");
				*/
		//"Hello". // -> new char[]{'H', 'e', 'l','l','o', 0}; // ���ڿ� ����(), ���ڿ� �ڸ���(), ���ڿ� ��ġ��(), ���ڿ�......
		
		FileOutputStream fos = new FileOutputStream("E:\\2016-02-22\\hello.txt");
		PrintStream fout = new PrintStream(fos);
		
		fout.printf("lotto : %d %d %d", 12, 14, 23);
				
		fout.close();
		fos.close();
		
		System.out.println("�Է� �޾� �����?"); //===========================
		
		FileInputStream fis = new FileInputStream("E:\\2016-02-22\\hello.txt");
		Scanner fscan = new Scanner(fis);
		
		fscan.next();
		fscan.next();
		int n1 = fscan.nextInt();
		int n2 = fscan.nextInt();
		int n3 = fscan.nextInt();
		
		System.out.printf("n1 : %d, n2 : %d, n3 : %d\n", n1, n2, n3);
		
		
		fscan.close();
		fis.close();
		
	}

}
