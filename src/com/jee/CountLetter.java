package com.jee;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountLetter {
	
	public static void main(String[] args) {
		
		String s = "jeeva";
		char [] c=s.toCharArray();
		Map<Character,Integer> mi = new LinkedHashMap<Character,Integer>();
		
		for(char c1:c)
		{
			if(mi.containsKey(c1))
			{
				Integer count = mi.get(c1);
				mi.put(c1, count+1);
			}
			else
			{
				mi.put(c1, 1);
			}
			
		}
		System.out.println(mi);
		
		Set<Entry<Character,Integer>> entry =mi.entrySet();
		for(Entry<Character,Integer> entry1 : entry)
		{
			if(entry1.getValue()>1)
			{
				System.out.println(entry1.getKey()+""+entry1.getValue());
			}
			else
			{
				System.out.println(entry1.getKey()+""+entry1.getValue());
			}
		}
		
	}

}
