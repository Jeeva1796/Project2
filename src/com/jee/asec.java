package com.jee;

public class asec {
	
	public static void main(String[] args)
	{
		
		
		System.out.println("Ascending Order");
		int [] a= {21,24,21,30,20};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int b:a)
		{
			System.out.println(b);
		}
		
		
		System.out.println("Descending Order");
		int [] b= {8,23,43,1,6};
		int temp2=0;
		for(int i =0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]<b[j])
				{
					temp2=b[i];
					b[i]=b[j];
					b[j]=temp2;
				}
			}
		}
		
       for(int c:b)
       {
    	   System.out.println(c);
       }
		
		
	}

}
