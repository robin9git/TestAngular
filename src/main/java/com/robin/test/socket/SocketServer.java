package com.robin.test.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

	public static void server(){
		System.out.println(123);
		try {
//			System.out.println(1234);
			ServerSocket ss = new ServerSocket(9900);
//			System.out.println(1234);
			Socket so = ss.accept();
			String line;
//			System.out.println(1234);
			BufferedReader br = new BufferedReader(new InputStreamReader(so.getInputStream()));
//			System.out.println(1234);
			PrintWriter pw = new PrintWriter(so.getOutputStream());
//			System.out.println(1234);
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			line = sin.readLine();
			System.out.println("line:"+line);
//			System.out.println("客户端："+br.readLine());
//			System.out.println("ttt");
			System.out.println(!line.equals("bye"));
			while(!line.equals("bye")){
//				System.out.println("ttt123");
				pw.println(line);
				pw.flush();
				System.out.println("服务器："+line);
				System.out.println("客户端:"+br.readLine());
				line = sin.readLine();
			}
			pw.close();
			br.close();
			so.close();
			ss.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		server();
		
	}
	
	

}
