package com.robin.test.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocket {

	public static void client(){
		
		try {
			Socket so = new Socket("127.0.0.1", 9900);
			BufferedReader br = new BufferedReader(new InputStreamReader(so.getInputStream()));
			PrintWriter pw = new PrintWriter(so.getOutputStream());
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			String line;
//			System.out.println("服务器："+br.readLine());
			line = sin.readLine();
			while(!line.equals("bye")){
				pw.println(line);
				pw.flush();
				System.out.println("客户端："+line);
				System.out.println("服务器："+br.readLine());
				line = sin.readLine();
			}
			pw.close();
			br.close();
			so.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		client();
	}

}
