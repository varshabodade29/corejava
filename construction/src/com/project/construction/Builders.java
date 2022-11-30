package com.project.construction;

public class Builders {
String id;
String name;
String PAN;
String GST_no;
String bank_account_no;
String Insurance_no;

public void DisplayBuildersDetails() {
	System.out.println("Following are Builder Details");
	System.out.println("Name :"+name);
	System.out.println("ID number :"+id);
	System.out.println("PAN :"+PAN);
	System.out.println("GST_no :"+GST_no);
	System.out.println("bank_account_no :"+bank_account_no);
	System.out.println("Insurance no :"+Insurance_no);
	
}
public void BuilderHistory() {
	System.out.println("This was founded in 1955");
	System.out.println("Successfully completed more than thousands of projects");
}

}
