package com.jee;

public class StringWORD {

	public static void main(String[] args)
	{
		String s ="welcome to java";
		String s1="";
		String[] sp = s.split(" ");
		
		
		for(int i=0;i<sp.length;i++)
		{
			for(int j=sp[i].length()-1 ; j>=0;j--)
			{
				
				char c=sp[i].charAt(j);
				s1=s1+c;
			}
			s1=s1+" ";
		}
		System.out.println(s1.trim());
		
		
	}
}
