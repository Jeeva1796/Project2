package org.prac;

public class ascend {

	public static void main(String[] args) {
		
		int[] a= {1,3,2,5,4};
		int[] b= new int[a.length];
		int temp=0;
		 for (int i = 0; i < a.length; i++) {
			
			 for (int j = i+1; j < a.length; j++) {
				
				 if(a[i]<a[j])
				 {
					 temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
				 }
				
			}
		}
		for (int i : a) {
			System.out.println(i);
		}
		 
	}
}
