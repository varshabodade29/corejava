package com.project.assignment_1;

public class maxnumber {

	public static void main(String[] args) {
		int[][] numberset = new int[][] { { 21, 4, 6 }, { 78, 10, 54 }, { 123, 3, 95 } };
		int max = 0;
		int min=numberset[0][0];

		// consider max number is zero and is maximum and compare each element with max.
		// if max is less than element then assign element value to max
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (max < numberset[i][j]) {
					max = numberset[i][j];
				}
			}
		}
		System.out.println("Maximum nuber is:" + max);
		
		//find minimum number
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (min > numberset[i][j]) {
					min = numberset[i][j];
				}
			}
		}
		System.out.println("Minimum nuber is:" + min);

	}

}
