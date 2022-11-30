package com.project.decision;

public class IfelseifLadder {
	public static void main(String[] args) {

		boolean haveaadharcard = false;
		boolean havepancard = true;
		boolean havevoterid = false;

		if (haveaadharcard) {

			System.out.println("condition1 :citizen of India");

		} else if (havepancard) {
			System.out.println("condition2 :citizen of India");

		} else if (havevoterid) {
			System.out.println("condition3 :citizen of India");
		} else {
			System.out.println("input is invalid");
		}
	}
}
