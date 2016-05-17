package netio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class EchoClientProgram {

public static void main(String[] args) {
		
		Socket sock;
		try {
			sock = new Socket("211.238.142.248", 10000);
			sock.setSoTimeout(15000);
			
			System.out.println("connected from " + sock.getRemoteSocketAddress());
			
			OutputStream nos = sock.getOutputStream();
			InputStream nis = sock.getInputStream();
			
			PrintStream nout = new PrintStream(nos, true);
			Scanner nscan = new Scanner(nis);
			
			Scanner scan = new Scanner(System.in);
			
			String msg;
			
			do{
				
				msg = scan.nextLine();				
				nout.println(msg);
				
				String echo = nscan.nextLine();
				System.out.println(echo);
			}
			while(!msg.equals("bye"));
			
			
			nout.close();
			scan.close();
			
			nis.close();
			nos.close();			
			sock.close();
			
			
					
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
						
		
	}


}
