package com.project.car;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Datecomparision {
	public static void main(String[]args) throws ParseException {
		String Release_Date="10/20/2022";
		String Pointer_Date="06/01/2022";
		
		SimpleDateFormat sdf= new SimpleDateFormat("MM/dd/yyyy");
		Date RDate= sdf.parse(Release_Date);
		Date PDate=sdf.parse(Pointer_Date);
		
		if(RDate.compareTo(PDate)>=0) {
			System.out.println("This is a recent movie");
		}
		else {
			System.out.println("This is an old movie");
		}
				}

}
