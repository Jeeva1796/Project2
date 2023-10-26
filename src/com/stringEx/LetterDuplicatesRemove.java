package com.stringEx;

public class LetterDuplicatesRemove {
	
	public static void main(String[] args) {
		
		String a ="hello"; 
		String b="";
	    char[] c = a.toCharArray();
	   // String valueOf = String.valueOf(c);
		for (char d : c) 
		{
			if(!b.contains(String.valueOf(d)))
			{
				b=b+d;
			}
			else
			{
				System.out.println(d);
			}
		}
	    
		System.out.println(b);
		 
	
	
	
	
	}
	

}
