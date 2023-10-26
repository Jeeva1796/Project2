package com.jee;

public class palindrom {

	public static void main(String[] args) {
		
		int b=0,c=0;
		int a=1234567910;int t=a;int count=0;
		while(a>0)
		{
			b=a%10;
			c=(c*10)+b;
			a=a/10;count++;
			
		}
		if(c==t)
		{
			System.out.println("palindrom "+t+" count "+count);
		}
		else
		{
			System.out.println("not palindrome "+t+" count "+count);
		}
		
		//factorial
		int fact=1;
		for (int i = 1; i<=5; i++) {
			fact=fact*i;
			
		}
		
		System.out.println(fact);
		
		//sum of the digit
		int sum=10;int f=0;int h=123456789;
		while(h>0)
		{
			f=h%10;
			sum=sum+f;
			h=h/10;
			
		}
		System.out.println("sum of the digit:"+sum);
		
		
		
	}
	
	
}
