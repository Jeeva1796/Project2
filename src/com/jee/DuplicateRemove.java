package com.jee;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateRemove {
	
	public static void main(String[] args) {
		
		String s="cell";
		String s1="";
		
		char[] c=s.toCharArray();
		for (char d : c) 
		{
		 if(!s1.contains(String.valueOf(d)))
		 {
			 s1=s1+d;
		 }
			
		}
		
		System.out.println(s1);
	}

}
