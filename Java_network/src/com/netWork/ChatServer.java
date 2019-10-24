package com.netWork;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(3333);
		Socket socket = serverSocket.accept();
		
		DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
		//tạo outputStream để đẩy dữ liệu từ data về client
		DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			//doc du lieu tu client truyen len
			String str = dataInputStream.readUTF();
			if(str.equals("q")) {
				System.out.println("Kết thúc chat server");
				break;
			}
			System.out.println("Client say: "+str);
			
			//truyền dữ liệu từ server về
			String str2 =  sc.nextLine();
			dataOutputStream.writeUTF(str2); //đẩy dữ liệu về client
			dataOutputStream.flush(); //đẩy dữ liệu
		}
		dataOutputStream.close();
		dataInputStream.close();
		socket.close();
		serverSocket.close();
	}

}
