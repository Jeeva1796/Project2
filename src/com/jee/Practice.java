package com.jee;

public class Practice {

public static void main(String[] args) {
	
	String s = "maveric systems";
	String[] s1 = s.split(" ");
	
	
	for(int i=0;i<s1.length;i++)
	{
		char fisrtLt = s1[i].charAt(0);
		
		
		String rp = s.replace(s1[i].charAt(0),'M');
		
		
		
	}
	
}

}

