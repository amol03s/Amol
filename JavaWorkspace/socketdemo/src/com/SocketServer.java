package com;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

	public static void main(String[] args){
		
		
		try {
			ServerSocket ss=new ServerSocket(3000);
			System.out.println("Waiting for client request");
			Socket s=ss.accept();
			DataInputStream dis=new DataInputStream(s.getInputStream());
			DataOutputStream dos=new DataOutputStream(s.getOutputStream());
			String msg=null;
			do {
				 msg=dis.readUTF();
				 System.out.println("Server" +msg);
			} while(msg.equals("end"));
           
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
