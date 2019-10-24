package com.netWork;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		try {
			System.out.println("Client kết nối");
			Socket socket = new Socket("localhost",6666); //6666 là cổng mở bên server
			
			DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
			
			dataOutputStream.writeUTF("Hello server nhé");
			dataOutputStream.flush(); //để đẩy dữ liệu lên server
			
			dataOutputStream.close();
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
