package com.stringEx;

public class DuplicatesWords {
  public static void main(String[] args) {
	
	String s = "java is java most is valuble";
	String s1="";
	String[] sp = s.split(" ");
	
	for (String st : sp)
	{
		
		if(!s1.contains(st))
		{
			s1=s1+st+" ";
		}
	}
	System.out.println(s1);
	
}
}
