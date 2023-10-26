package com.jee;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountWord {
	public static void main(String[] args)
	{
		String s="King of Ring is King and he is HHH";
		String[] s1 = s.split(" ");
		
		Map<String,Integer> mi = new LinkedHashMap<String,Integer>(); 
		
		for(String s2:s1)
		{
		 if(mi.containsKey(s2))
		 {
			Integer count = mi.get(s2);
		    mi.put(s2, count+1);
		 }
		 
		else
		{
			mi.put(s2, 1);
		}
		 
		}
	
		System.out.println(s1.length);
		System.out.println(mi);
		
	  Set<Entry<String,Integer>>entry = mi.entrySet();
	  
	  
		for(Entry<String,Integer> entry1 : entry)
		{
			if(entry1.getValue()>0)
			{
				
				System.out.println(entry1.getKey()+" = "+entry1.getValue());
			}
			else
			{
				System.out.println(entry1.getKey()+" = "+entry1.getValue());
			}
			
		}
		
	}

}
