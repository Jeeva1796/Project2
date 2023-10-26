package com.jee;

public class MaxMin {

	public static void main(String[] args) {
		
		int [] a= {10,20,1,80,30,70,40,5};
		int max=0;
		int min =a[0];
		for(int i=0;i<a.length;i++ )
		{
			if(max<a[i])
			{
				max=a[i];
			}
		   if(min>a[i])
		   {
			   min=a[i];
		   }
		    
		}
		
		System.out.println(max);
		System.out.println(min);
		
	}
}
