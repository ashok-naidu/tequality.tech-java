package com.tequality.java.example;

import java.io.IOException;
import java.net.*;
import java.net.http.*;
import java.net.http.HttpResponse.BodyHandlers;
public class WebClient {
	
	public static void main(String[] args) {
		
		HttpClient client = HttpClient.newHttpClient();
	    HttpRequest request = HttpRequest.newBuilder()
	          .uri(URI.create("http://www.google.com"))
	          .build();
	 
	    HttpResponse<String> response;
		try {
			response = client.send(request, BodyHandlers.ofString());
			System.out.println(response.body());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	
	}
	
	

}
