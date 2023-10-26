package com.stringEx;

public class FirstLetterCaps {
	
	public static void main(String[] args) {
		
		String s="welcome to monday night raw";
		String [] s1=s.split(" ");
		String s2="";
		
		for(String w : s1)
		{
			Character c =Character.toUpperCase(w.charAt(0));
			s2=s2+c;
			
			for(int i=1;i<w.length();i++)
			{
				char ct = w.charAt(i);
				s2=s2+ct;
			}
			s2=s2+" ";
			
		}
		System.out.println(s2.trim());
		
	}
	

}
