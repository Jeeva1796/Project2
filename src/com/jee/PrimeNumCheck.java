package com.jee;

public class PrimeNumCheck {

	public static void main(String[] args)
	{
		int a=97;
		int count=0,b=0;;
		for(int i=1;i<=100;i++)
		{
		   b=a%i;
		   if(b==0)
		   {
			   count++;
		   }
			
		}
		if(count==2)
		{
			System.out.println("prime");
		}
		else
			System.out.println("Non Prime");
	}
	
}
