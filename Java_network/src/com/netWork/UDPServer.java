package com.netWork;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
// chạy bên UDP Client trước rồi mới chạy bên server
public class UDPServer {

	public static void main(String[] args) throws Exception {
		DatagramSocket datagramSocket = new DatagramSocket();
		
		InetAddress ip = InetAddress.getByName("localhost");
		
		String str = "xin chao";
		
		DatagramPacket datagramPacket = new DatagramPacket(str.getBytes(), str.length(),ip,3000); //truyền dữ liệu vào cổng 3000 của local host
		
		datagramSocket.send(datagramPacket);
		datagramSocket.close();
	}

}
