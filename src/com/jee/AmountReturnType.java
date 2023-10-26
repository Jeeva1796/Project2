package com.jee;

public class AmountReturnType {
	 Integer needamount = 1000;
	
	public Integer collectAmount()
	{
		System.out.println("Son : Daady Amount "+needamount+" has been collected");
		return needamount;
	}
	
	Double d=20.00;
	
	public Double remaining()
	{
		System.out.println("son : Remaining amount is "+d);
		return d;
	}
// Retrun type methods for data type : Integer,Double,Long,Float,Character,Byte -->Wrapper classes
	public static void main(String[] args) {
		
		System.out.println("Father :Son please collect my amount");
		AmountReturnType mySon =new AmountReturnType();
		mySon.collectAmount();
		System.out.println("How much amount is Pending ?");
		mySon.remaining();
		int a=mySon.collectAmount();
		System.out.println("Father : I got my amount "+a);
		
	}
	

}
