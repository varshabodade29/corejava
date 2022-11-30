package com.project.decision;

public class Switchdemo {
public static void main(String[]args) {
String traffic_signal="Red";

switch(traffic_signal) {
case"Red":
	System.out.println("Please stop the vehicle");
	break;
case "Yellow":
	System.out.println("Get ready for move");
	break;
case "Green":
	System.out.println("You can move");
}
}
}
