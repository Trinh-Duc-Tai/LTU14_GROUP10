package com.netWork;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
//dau tien client phai gui du lieu len server truoc, chay Chat Client trc
public class ChatClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("localhost",3333);
		
		DataInputStream dataInputStream = new DataInputStream(socket.getInputStream()); //để đọc dữ liệu từ server truyền về
		DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			//truyen du lieu len server
			String str = sc.nextLine();
			dataOutputStream.writeUTF(str);
			dataOutputStream.flush();
			if(str.equals("q")) {
				System.out.println("Kết thúc chat client");
				break;
			}
			//doc du lieu ve tu server
			String str2 = dataInputStream.readUTF();
			System.out.println("Server say: "+str2);
		}
		dataOutputStream.close();
		dataInputStream.close();
		socket.close();
	}

}
