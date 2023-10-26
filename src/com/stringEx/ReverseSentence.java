package com.stringEx;

public class ReverseSentence {
	
	public static void main(String[] args) {
		
		String a ="welcome to wwe";
		String b="";
		String[] s = a.split(" ");
		
		// word only reverse
//		for(int i =s.length-1;i>=0;i--)
//		{
//			System.out.println(s[i]);
//			b=b+s[i]+" ";
//			
//		}
//		System.out.println(b);
		
		//eww ot emoclew  sentence letter reverse
		for(int i=s.length-1;i>=0;i--)
		{
			 
			System.out.println(s[i]);
			for(int j=s[i].length()-1;j>=0;j--)
			{
				char ct = s[i].charAt(j);
				b=b+ct;
				
			}
						     
			b=b+" ";
		}
//		
//		System.out.println(b);
//		System.out.println(b.trim());
		
		
		
		
		
	}
	

}
