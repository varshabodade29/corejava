package com.project.car;

import java.util.Date;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;

public class movie {
	Date d1 = new Date();
	String name;
	String production;
	String actors;
	long budget;
	long business_collection;
	boolean isPAN_India;
	String release_date;

	//public class datecomparision{
	// String pointerdate="06/01/2022";
	// SimpleDateFormat sdf= new SimpleDateFormat("MM/dd/yyyy");

	// Date rdate=sdf.parse(release_date);
	// Date pdate=sdf.parse(pointerdate);

	//}

	public void movieflop() {
		System.out.println(name + " : Flop movie");
	}

	public void movieavg() {
		System.out.println(name + " : Average movie");
	}

	public void moviesuperhit() {
		System.out.println(name + " : Superhit movie");
	}

	public void panindialanguages() {
		if (isPAN_India) {
			System.out.println("language1: Kannada");
			System.out.println("language2: Tamil");
			System.out.println("language3: Telugu");
			System.out.println("language4: Malyalam");
			System.out.println("language5: Hindi");
		} else {
			System.out.println("Only in Hindi");
		}
		System.out.println("Today is :" + d1);

	}
}
