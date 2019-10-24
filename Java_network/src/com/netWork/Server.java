package com.netWork;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//cái này mới 1 chiều đẩy dữ liệu từ client lên server thôi
public class Server {

	public static void main(String[] args) {
		try {
			System.out.println("Bắt đầu mở socket");
			ServerSocket serverSocket = new ServerSocket(6666);
			Socket socket = serverSocket.accept(); //socket đợi client kết nối đến server
			DataInputStream dataInputStream = new DataInputStream(socket.getInputStream()); //lấy dữ liệu từ client gửi lên
			
			String str = dataInputStream.readUTF();  //đọc dữ liệu từ client gửi lên
			System.out.println(str);
			dataInputStream.close(); //đóng kết nối
			socket.close(); //
			System.out.println("Kết thúc"); //vậy là tạo xong server socket
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
