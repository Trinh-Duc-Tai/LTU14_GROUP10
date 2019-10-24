package com.netWork;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {

	public static void main(String[] args) throws Exception {
		InetAddress inetAddress = InetAddress.getByName("localhost");
		DatagramSocket socket = new DatagramSocket(3000,inetAddress);
		
		byte[] buf = new byte[1024];
		
		DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);
		
		socket.receive(datagramPacket); //nhận dữ liệu từ server trả về
		
		String str = new String(datagramPacket.getData(),0,buf.length);
		System.out.println(str);
		
		socket.close();
	}

}
