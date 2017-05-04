package com.entity.pkg;

import java.util.ArrayList;

public class Movie {
	private int movieId;
	private String name;
	private String type;
	private int Rating;
	private double distrFee;
	private int numCopies;
	private String src;
	private ArrayList<String> actors;
	
	
	
	
	public ArrayList<String> getActor() {
		return actors;
	}

	public void setActor(ArrayList<String> actor) {
		this.actors = actor;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public Movie(int MovieId){
		
		this.movieId = MovieId;
		src = "images/poster_default.gif";
		
	}
	
	public Movie(){
		src = "images/poster_default.gif";
		
	}

	

	public int getMovieId() {
		return movieId;
	}


	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getRating() {
		return Rating;
	}


	public void setRating(int rating) {
		Rating = rating;
	}


	public double getDistrFee() {
		return distrFee;
	}


	public void setDistrFee(double distrFee) {
		this.distrFee = distrFee;
	}


	public int getNumCopies() {
		return numCopies;
	}


	public void setNumCopies(int numCopies) {
		this.numCopies = numCopies;
	}
	

}
