package com.project.decision;

public class ifdemo {
	public static void main(String[] args) {
		int age = 20;
		int weight = 45;
		if (weight > 50) {
			System.out.println("you can donate blood");
		} else {
			System.out.println("not eligible");
		}

		if (age > 18) {
			System.out.println("you can vote");

		} else {
			System.out.println("not eligible");
		}

	}
}
