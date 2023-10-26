package com.jee;

public class ASwap {
	public static void main(String[] args)
	{
		int a=12;
		int b=20,c=0;
		System.out.println("before swap "+a+" and "+b);
		c=b;//c=20
		b=a;//b=12
		a=c;//a=20
		System.out.println("After swap "+a+" and "+b);
		
		System.out.println("-------------------------------");
		
		int a1=20,b1=30;
		System.out.println("before swap "+a1+" and "+b1);
		a1=a1+b1;//a1=20+30=50
		b1=a1-b1;//b1=50-30=20
		a1=a1-b1;
		System.out.println("After swap "+a1+" and "+b1);
		
	}

}
