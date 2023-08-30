package io.datajek.springaop.movierecommenderaop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.datajek.springaop.movierecommenderaop.repository.Movie;

@Service
public class FilteringTechnique1 {
	  @Autowired
	    private Movie movie;
	 
	    public String contentBasedFiltering() {
	        String movieDetails = movie.getMovieDetails();
	        return movieDetails;
	    }

}
