package com.entity.pkg;

public class Movie {
	private int movieId;
	private String name;
	private String actors;
	private String type;
	private int rating;
	private double distrFee;
	private int numCopies;
	private String src;
	
	
	public Movie(int MovieId){
		
		this.movieId = MovieId;
		
	}
	public Movie(String name1){
		movieId = 1111;
		actors = "Robert Downy jr";
		name = name1;
		type = "action,comedy";
		rating = 5;
		distrFee = 0;
		numCopies = 0;
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
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
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
	
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public String getActors() {
		return actors;
	}
	public void setActors(String actors) {
		this.actors = actors;
	}
	

}
