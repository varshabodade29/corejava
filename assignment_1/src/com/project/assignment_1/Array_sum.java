package com.project.assignment_1;

public class Array_sum {
	public static void main(String[] args) {
		int[] number = new int[10];
		int total = 0;
		number[0] = 4564;
		number[1] = 8098;
		number[2] = 131;
		number[3] = 56;
		number[4] = 8140;
		number[5] = 345;
		number[6] = 34;
		number[7] = 540;
		for (int i = 0; i < 10; i++) {
			total = total + number[i];
		}
		System.out.println("Sum of array is :" + total);

	}

}
