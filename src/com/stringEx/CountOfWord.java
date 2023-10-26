package com.stringEx;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountOfWord {

	public static void main(String[] args) {
		
		String a="welcome to wwe wwe to java to";
		//String  b ="";
		//int c=1;
	//	char[] c = a.toCharArray();
		String[] s = a.split(" ");
     	Map<String,Integer> mi = new LinkedHashMap<>();
     	
     	for (String st : s) {
			if(mi.containsKey(st))
			{
				Integer cnt = mi.get(st);
				mi.put(st, cnt+1);
			}
     		
			else
			{
				mi.put(st, 1);
			}
		}
     	
     	System.out.println(mi);
			
     	
     	
     	
     	
     	
//	   for (int i = 0; i < a.length()-1; i++) 
//	   {
//		   for (int j = 1; j < a.length(); j++)
//		   {
//			 if(a.charAt(i)==a.charAt(j))
//		      {
//			   c++;
//			  }
//			 else
//			   {
//				   mi.put(a.charAt(i), c);
//			   }
//		   }
//		   if(c>2)
//		   {
//		   mi.put(a.charAt(i), c);
//		   }
//		   
//	   }
//	  
//	   
//	   System.out.println(mi);
//		
		
		
		
	}
	
}
