package netio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServerProgram {

	public static void main(String[] args) throws IOException{
		ServerSocket svrSock = new ServerSocket(10000);
		
		System.out.println("listening...");
		Socket sock = svrSock.accept();
		System.out.println("connected from " + sock.getRemoteSocketAddress());
		
		OutputStream nos = sock.getOutputStream();
		InputStream nis = sock.getInputStream();
		
		PrintStream nout = new PrintStream(nos, true);
		Scanner nscan = new Scanner(nis);
				
		String msg;
		
		do{			
			msg = nscan.nextLine();
			System.out.println(msg);
			
			nout.println("echo : " + msg);			
		}while(!msg.equals("bye"));
		
		nout.close();
		nscan.close();
		
		nis.close();
		nos.close();
		sock.close();
						
	}	

}
