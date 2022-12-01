package com.project.car;

import java.util.Date;

public class movietester {
	public static void main(String[] args) {
		movie movie1 = new movie();
		movie1.name = "Kantara";
		movie1.production = "Hombale";
		movie1.actors = "Rishab Shetty, Sapthami Gowda";
		movie1.budget = 200000000l;
		movie1.business_collection = 3000000000l;
		movie1.isPAN_India = true;
		Date d1 = new Date();
		movie1.release_date = "10/20/2022";
		System.out.println("Name: " + movie1.name);
		System.out.println("Production house: " + movie1.production);
		System.out.println("Actors: " + movie1.actors);
		System.out.println("Budget: " + movie1.budget);
		System.out.println("Release Date: "+ movie1.release_date);
		System.out.println("Box office collection: " + movie1.business_collection);
		System.out.println("Is PAN India release: " + movie1.isPAN_India);
		movie1.panindialanguages();
		System.out.println("-------------------------------------");
		System.out.println("Audience Remark:");
		if (movie1.business_collection < movie1.budget) {
			movie1.movieflop();
		} else if (movie1.business_collection <= (2 * movie1.budget)) {
			movie1.movieavg();
		} else if (movie1.business_collection > (2 * movie1.budget)) {
			movie1.moviesuperhit();
		}
		System.out.println("Today is :" + d1);

		movie movie2 = new movie();
		movie2.name = "Brahmastra";
		movie2.actors = "Ranbeer Singh, Alia Bhatt";
		movie2.budget = 3000000000l;
		movie2.business_collection = 500000000l;
		movie2.release_date = "10/09/2022";
		movie2.isPAN_India = false;
		movie2.production = "Dharma";
		System.out.println("***************************************");

		System.out.println("Name: " + movie2.name);
		System.out.println("Production house: " + movie2.production);
		System.out.println("Actors: " + movie2.actors);
		System.out.println("Budget: " + movie2.budget);
		System.out.println("Box office collection: " + movie2.business_collection);
		System.out.println("Release Date : "+ movie2.release_date);
		System.out.println("Is PAN India release: " + movie2.isPAN_India);
		movie2.panindialanguages();
		System.out.println("-------------------------------------");
		System.out.println("Audience Remark:");
		if (movie2.business_collection < movie2.budget) {
			movie2.movieflop();
		} else if (movie2.business_collection <= (2 * movie2.budget)) {
			movie2.movieavg();
		} else if (movie2.business_collection > (2 * movie2.budget)) {
			movie2.moviesuperhit();
		}
		System.out.println("***************************************");

	}

}
