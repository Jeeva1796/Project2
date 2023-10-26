package com.stringEx;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountOfLetter {

	public static void main(String[] args) {
		
		String a="hkeeellllllooo";
		//String  b ="";
		//int c=1;
		char[] c = a.toCharArray();
     	Map<Character,Integer> mi = new LinkedHashMap<>();
     	
     	for (char d : c) {
		if(mi.containsKey(d))
		{
			Integer count = mi.get(d);
			mi.put(d, count+1);
		}
		else
		{
			mi.put(d, 1);
		}
		}
     	System.out.println(mi);
     	
     	
     	Set<Entry<Character, Integer>> es = mi.entrySet();
     	
     	for (Entry<Character, Integer> entry : es) {
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey());
			}
		}
     	
     	
     	
     	
     	
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
