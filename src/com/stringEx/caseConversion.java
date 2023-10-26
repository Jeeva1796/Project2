package com.stringEx;

public class caseConversion {
	public static void main(String[] args) {
		
		String s= "helloLESNAR";
		String s1="";
		String s2="";
		
		char[] c =s.toCharArray();
		
		for(char d : c)
		{
			if(Character.isUpperCase(d))
			{
				s1=s1+Character.toLowerCase(d);
			}
			else
			{
				s2=s2+Character.toUpperCase(d);
			}
			
		}
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
