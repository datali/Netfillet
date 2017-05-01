package com.service.pkg;

import java.util.ArrayList;

import com.entity.pkg.Movie;
import com.repository.pkg.MovieData;

public class MovieService {
	
	private int id;
	
	
public MovieService(){
		
		
	}
	
	public boolean MovieExists(){
		
		return ValidateUser.validateMovie(id);
	
	}
	
	public Movie createMovie(int id){
		
		Movie movie = new Movie(id);
		
		String name = MovieData.Name(id);
		System.out.println(name);
		movie.setName(name);
		
		String type = MovieData.Type(id);
		System.out.println(type);
		movie.setType(type);
		
		int rating = MovieData.Rating(id);
		System.out.println(rating);
		movie.setRating(rating);
		
		double distrFee = MovieData.DistFree(id);
		System.out.println(distrFee);
		movie.setDistrFee(distrFee);
		
		int numCopies = MovieData.NumCopies(id);
		System.out.println(numCopies);
		movie.setDistrFee(numCopies);
		
		
		return movie;
	}
	
	public ArrayList<Movie> getAllMovies(){
		ArrayList<Integer> movieIds = MovieData.AllMovies();
		ArrayList<Movie> movies = new ArrayList<Movie>();
		for (int movieId : movieIds) {
		    movies.add(createMovie(movieId));
		}
		
		return movies;
	}
	
	public void addMovie(String Name, String Type, int Rating, double DistrFree, int NumCopies){
		MovieData.AddMovie(Name, Type, Rating, DistrFree, NumCopies);
	}
	
	public void deleteMovie(int id){
		MovieData.DeleteMovie(id);
	}
	
	public void EditName(int MovieId, String Name){
		MovieData.EditName(MovieId, Name);
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	
}
