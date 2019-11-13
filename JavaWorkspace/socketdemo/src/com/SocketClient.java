package com;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SocketClient {

	public static void main(String[] args) {
		try {
			
			Socket s= new Socket("localhost",3000);
			DataInputStream cdis=new DataInputStream(s.getInputStream());
			DataOutputStream cdos=new DataOutputStream(s.getOutputStream());
			Scanner sc=new Scanner(System.in);
			String msge=null;
			do {
				System.out.println("client:");
				msge=sc.next();
				cdos.writeUTF(msge);
				
			}while (msge.equals("end"));
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
