package com.tequality.java.example;

import java.util.ArrayList;

public class ForLoop2 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		 
		al.add(10); al.add(20); al.add(30); al.add(40);
		 
		for(int x : al)
		 
		{
		 
		System.out.println(x);
		 
		}
		
	}

}
