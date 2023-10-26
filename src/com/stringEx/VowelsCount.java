package com.stringEx;

public class VowelsCount {
	public static void main(String[] args) {
		
	
		String s="jeeviou";
		String vowel="";
		String nvowel="";
		int countvow=0,nonvcount=0;
		
		char[] ch = s.toCharArray();
		
		for(char c: ch)
		{
			if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U'
				|| c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			{
				vowel=vowel+c;
				countvow++;
				
			}
			else
			{
				nvowel=nvowel+c;
				nonvcount++;
			}
		}
		
		System.out.println(countvow);
		System.out.println(vowel);
		System.out.println(nvowel);
		System.out.println(nonvcount);
	}
	

}
