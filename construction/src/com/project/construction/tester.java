package com.project.construction;

public class tester {

	public static void main(String[] args) {
		Builders ABC_Builders= new Builders();//parent class object
		ABC_Builders.name="ABC Builders";
		ABC_Builders.Insurance_no="47646756575";
		ABC_Builders.bank_account_no="dsfhsjdfhkjdhhdkgj";
		ABC_Builders.GST_no="3253453454w";
		ABC_Builders.DisplayBuildersDetails();
		ABC_Builders.BuilderHistory();
		System.out.println("*******************");
		
		housing housing1=new housing();//child class object
		housing1.name="Safal Parisar";
		housing1.id="gfhfghngf";
		housing1.End_date="21/05/2020";
		housing1.location="Pune";
		housing1.Housingdetails();
		housing1.DisplayBuildersDetails();
		housing1.PAN="pppppp";
		System.out.println("*******************");
		
		flyovers flyover1=new flyovers();
		flyover1.length="4 kms";
		flyover1.height="3 meters";
		flyover1.flyoverdetails();
		flyover1.BuilderHistory();
		System.out.println("length of flyover is :"+flyover1.length);
		System.out.println("height of flyover is :"+flyover1.height);
		System.out.println("*******************");
		
		IshaanArchitects Ishaan=new IshaanArchitects();
		Ishaan.id="SSSSSSSSSSSSSSSSSS";
		Ishaan.name="Ishaan";
		Ishaan.Insurance_no= "47646756575";
		Ishaan.experience="15 yrs";
		Ishaan.IshaanArchInfo();
		System.out.println("*******************");
		
		Vendors electricvendor = new Vendors();
		electricvendor.vendor_type="Electric";
		electricvendor.vendor_location="Navi Mumbai";
		electricvendor.vendor_name="EEEEEEEEEEEEEEE";
		System.out.println("Type of vendor :"+ electricvendor.vendor_type);
		electricvendor.vendorinfo();
		System.out.println("working for housing project in "+ housing1.location);
		
	}
}

