package movies.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MoviesController {
	
	List<String> movies;
	
	public MoviesController(){
		this.movies = new ArrayList<String>();
		
		int count = 10;
		
		for(int i = 0; i < count; i++){
			movies.add("Movie #" + (i + 1));
		}
	}
	
	//GET /api/movies -> return all movies
	//@RequestMapping("/books") - by default the method is GET I need manually to set it to POST or other
	@RequestMapping(value="/movies", method=RequestMethod.GET)
	public List<String> getAllMovies(){
		return this.movies;
	}
	
	//POST /api/movies -> create a new movie
	//@RequestMapping("/books") - by default the method is GET I need manually to set it to POST or other
	@RequestMapping(value="/movies", method=RequestMethod.POST)
	public String addMovie(String newMovie){
		this.movies.add(newMovie);
		return newMovie;
	}
	
	
	//GET /api/movies/MOVIE_ID -> return detailed info about a movie
	
	 
	
	//PUT /api/movies/MOVIE_ID -> vote for a movie (stars from 1 to 5 I can make it shinier with a librarie)


}
