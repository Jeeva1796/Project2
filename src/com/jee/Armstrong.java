package com.jee;

public class Armstrong {
	
	public static void main(String[] args) {
		
		int a=407;
		int temp1=a;
		int temp=a;
		int b=0,count=0,sum=0,as=0;
		while(a>0)
		{
			b=a%10;
			count++;
			a=a/10;
		}
		//System.out.println(count);
	
	
	while(temp>0)
	{
		as=temp%10;
		int cube=1;
		for (int i = 0; i < count; i++) {
			
			cube=cube*as;
		}
		
		sum=sum+cube;
		temp=temp/10;
		
	}
	if(temp1==sum)
		System.out.println("armstrong number "+sum);
	else
		System.out.println("not armstrong "+temp1);

}
}
