package com.jee;

public class reverseTheNumber {

	public static void main(String[] args) {
		
		///reverse the number;
		
		int a=32108,b,c=0;
		while(a>=1)
		{
			 b=a%10;
			 c=(c*10)+b;
			a=a/10;
			
		}
		System.out.println(c);
		
	}
	
}
