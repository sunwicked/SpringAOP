package io.datajek.springaop.movierecommenderaop.repository;

import org.springframework.stereotype.Repository;

import io.datajek.springaop.movierecommenderaop.aspects.MeasureTime;

@Repository
public class Movie {
	
	@MeasureTime
    public String getMovieDetails() {
        //interacts with the Movie repository
        return "movie details";     
    }

}
