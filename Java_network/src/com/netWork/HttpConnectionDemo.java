package com.netWork;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpConnectionDemo {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://learn.trungtamjava.com/khoa-hoc-java-co-ban");
		
		HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
		
		for (int i = 0; i < httpURLConnection.getHeaderFields().size(); i++) {
			System.out.println(httpURLConnection.getHeaderFieldKey(i)+ " = "+ httpURLConnection.getHeaderField(i));
		}
	}

}
