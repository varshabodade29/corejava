package com.project.assignment_1;
public class bill_distribution {
public static void main(String[] args) {
	float bill_amount=471.28f;
	float servicecharge;
	float totalpayableamount;
	float perheadamt;
	
	servicecharge=(bill_amount*15)/100;
	totalpayableamount=bill_amount+servicecharge;
	perheadamt=totalpayableamount/2;
	
	System.out.println("Bill Amount Rs.                      :"+bill_amount);
	System.out.println("Service charge Rs.                   :"+servicecharge);
	System.out.println("Bill Amount with service charge Rs.  :"+totalpayableamount);
	System.out.println("Each person needs to pay Rs.         :"+perheadamt);
	System.out.println("Each person needs to pay roundoff Rs.:"+Math.round(perheadamt));
	System.out.printf("Each person needs to pay Rs.         :"+"%.2f",perheadamt);
}
}
