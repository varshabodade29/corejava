package com.project.construction;

public class tester {

	public static void main(String[] args) {
		Builders ABC_Builders= new Builders();//parent class object
		ABC_Builders.DisplayBuildersDetails();
		ABC_Builders.BuilderHistory();
		System.out.println("*******************");
		housing housing1=new housing();
		//housing1.id="gfhfghngf";
		housing1.Housingdetails();
		System.out.println("*******************");
		flyovers flyover1=new flyovers();
		flyover1.flyoverdetails();
		
		//Vendors electricvendor = new Vendors()l
		
	}
}

