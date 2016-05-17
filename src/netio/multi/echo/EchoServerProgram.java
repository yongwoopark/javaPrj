package netio.multi.echo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServerProgram {

	public static void main(String[] args) throws IOException{
		boolean isRun = true;
		
		ServerSocket svrSock = new ServerSocket(10000);
		
		System.out.println("listening...");
		
		while(isRun){
			Socket sock = svrSock.accept(); // 사용자 접속
			System.out.println("connected from " + sock.getRemoteSocketAddress());
			// 사용자 처리 스레드
			new Thread(new Runnable() {				
				@Override
				public void run() {					
					try {
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
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}).start();		    
			
		}
						
	}	

}
