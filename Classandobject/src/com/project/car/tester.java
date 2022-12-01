package com.project.car;

public class tester {
public static void main(String[]args) {
	Car car=new Car();//creation of object
	//initialise values to object properties
	car.brand="maruti suzuki";
	car.slno=100;
	car.color="silver";
	car.haveairbags=true;
	car.name="Swift";
	car.price=500000;
	car.servicecontactnumber=12345667l;
	//print data in console
	car.cantravel();
	car.forbusiness();
	System.out.println("Slno:"+car.slno);
	System.out.println("brand:"+car.brand);
	System.out.println("color:"+car.color);
	System.out.println("have air bags:"+car.haveairbags);
	System.out.println("name:"+car.name);
	System.out.println("price:"+car.price);
	System.out.println("service contact number:"+car.servicecontactnumber);
	System.out.println("*****************");
	
	Car car2=new Car();
	car2.brand="Tata";
	car2.slno=200;
	car2.color="white";
	car2.haveairbags=true;
	car2.name="Nexon";
	car2.price=700000;
	car2.servicecontactnumber=789654l;
	
	System.out.println("Slno:"+car2.slno);
	System.out.println("brand:"+car2.brand);
	System.out.println("color:"+car2.color);
	System.out.println("have air bags:"+car2.haveairbags);
	System.out.println("name:"+car2.name);
	System.out.println("price:"+car2.price);
	System.out.println("service contact number:"+car2.servicecontactnumber);
	
}

}
