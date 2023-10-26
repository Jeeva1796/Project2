package com.stringEx;

public class LetterOnlyReverse {

	public static void main(String[] args) {
		
		String a ="welcome to java";
		String[] s = a.split(" ");
		String b ="";
		for (int i =0 ; i < s.length; i++) 
		{
			
			for (int j = s[i].length()-1; j >= 0; j--) 
			{
				
				char c = s[i].charAt(j);
			    b=b+c;
				
			}
			b=b+" ";
		 }
		String t = b.trim();
		System.out.println(b);
		System.out.println(t);
	}
}
