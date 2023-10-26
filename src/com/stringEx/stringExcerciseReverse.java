package com.stringEx;

public class stringExcerciseReverse {

	public static void main(String[] args) {
		
		String a ="hello";
		
		String b="";
		for (int i = a.length()-1; i >=0; i--) {
			
			char c = a.charAt(i);
			
			System.out.println(c);
			
			b=b+c;
		}
		
		System.out.println(b);
	}
}
