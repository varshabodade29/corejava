package com.project.decision;

public class Nested_If {
public static void main(String[]args) {
	boolean hvaccountnumber=true;
	boolean hvaadharcard=false;
	boolean hvminbalance=true;
	int salary=20000;
	
	if(hvaccountnumber) {
		if(hvaadharcard) {
			if(hvminbalance) {
				if(salary>20000) {
					System.out.println("You are eligible for credit card");
				}
				else {
					System.out.println("Your salary is less than 20000");
				}
			}
				else{
					System.out.println("You don't have minimum balance");
				}		
		}
		else {
			System.out.println("You Don't have Aadhar card");
		}
	}
	else {
		System.out.println("You don't have account number");
	}
}
}
