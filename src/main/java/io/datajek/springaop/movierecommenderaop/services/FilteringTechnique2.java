package io.datajek.springaop.movierecommenderaop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.datajek.springaop.movierecommenderaop.aspects.MeasureTime;
import io.datajek.springaop.movierecommenderaop.repository.User;

@Service
public class FilteringTechnique2 {

	  @Autowired
	    private User user;
	 
// 	  @MeasureTime  //failing
	    public String collaborativeFiltering() {
	        String userDetails =  user.getUserDetails();
	        return userDetails;
	    }
}
