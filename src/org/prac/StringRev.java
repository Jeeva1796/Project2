package org.prac;

public class StringRev {

	public static void main(String[] args) {
		
		String a="welcome home";
		String a1="";
		
		for(int i=a.length()-1; i>=0; i--)
		{
			char ct = a.charAt(i);
			a1=a1+ct;
		}
		System.out.println(a1);
		
	   String[] a2= a.split(" ");
	   String a3="";
	   for(int i=0 ;i<a2.length  ;i++)
	   {
		   for(int j=a2[i].length()-1; j>=0 ;j--)
		   {
			  char ct= a2[i].charAt(j);
			  a3=a3+ct;
		   }
		   a3=a3+" ";
	   }   
		
	   System.out.println(a3);
	}
}
