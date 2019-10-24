package com.netWork;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.google.com.vn/?hl=vi");
			
			System.out.println(url.getProtocol()); //https
			System.out.println(url.getHost()); //www.google.com.vn
			System.out.println(url.getFile()); ///?hl=vi
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
