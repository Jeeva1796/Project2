package com.jee;

public class ArrayPrac {
	public static void main(String[] args) {
		
		int [] a= {23,22,45,21,20,28,33,29};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
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
		
		System.out.println("maximu "+a[a.length-1]);
		System.out.println("minimum "+a[0]);
		System.out.println("second maximum "+a[a.length-2]);
		System.out.println("Second minimum "+a[1]);
		
	}

}
