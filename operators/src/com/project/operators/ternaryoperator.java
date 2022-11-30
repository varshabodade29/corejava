package com.project.operators;

public class ternaryoperator {
	public static void main(String[]args) {
		boolean result=(10>20)? true:false;
		String name="Bangalore";
		String result1=(name.equals("Bangalore")?"Capital city of Karnataka":"invalid output");
		System.out.println("The value of result is :"+result);
		System.out.println("the value of result1 is :"+ result1);
	}
	
}
