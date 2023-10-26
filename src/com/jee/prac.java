package com.jee;

import java.util.Iterator;

public class prac {

	public static void main(String[] args) {
		
		//string reverse
//		String s="Jeeva";
//		String s1 ="";
//		for (int i = s.length()-1; i >=0; i--) {
//			char ct = s.charAt(i);
//			s1=s1+ct;
//		}
//		System.out.println(s1);
//	
		
		
	//words reverse = natluS ih
//		String a="hi Sultan";
//		String a1="";
//		String[]a2= a.split(" ");
//		
//		for (int i = a2.length-1 ; i >=0 ; i--) {
//			for (int j = a2[i].length()-1; j >=0; j--) {
//			 
//				char c=a2[i].charAt(j);
//				a1=a1+c;
//				
//			}
//			a1=a1+" ";
//		}
//		System.out.println(a1);
//		
		
		String b="hello jeeva";
		String b1="";
		String[] b3 = b.split(" ");
		 for (int i = 0; i < b3.length; i++) {
			 
			 for (int j = b3[i].length()-1 ; j >=0 ; j--) {
				 char ct = b3[i].charAt(j);
			     b1=b1+ct;
				 
			}
			b1=b1+" ";
		}
		System.out.println(b1);
		
		
		
		
		
	}
}
