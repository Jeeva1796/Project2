package com.jee;

public class Sample {

	public static void main(String[] args) {
		
		String s="hello Jeevaaaaa";
		String s1="";
		
		char t = 0;
		char t1 = 0;
		for (int i = 0; i < s.length(); i++) {
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
				count++;
				if(count>=2)
				{
				t1=s.charAt(j);
				System.out.print(t1);
				}
				}
				
			}
			
			
	      }
		
	}
	
}
