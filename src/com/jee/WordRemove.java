package com.jee;

public class WordRemove {
	public static void main(String[] args) {
		
		String s = "laptop is is work work";
		String s1="";
		
		String[] s2 = s.split(" ");
		for(String a : s2)
		{
			if(!s1.contains(a))
			{
				s1=s1+a;
				
			}
			s1=s1+" ";
		}
		
		System.out.println(s1);
		System.out.println(s1.trim());
	}

}
