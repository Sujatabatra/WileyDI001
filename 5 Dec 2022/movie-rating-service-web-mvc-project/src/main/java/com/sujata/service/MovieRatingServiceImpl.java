package com.sujata.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sujata.entity.Movie;
import com.sujata.entity.MovieRating;
import com.sujata.entity.Rating;
import com.sujata.entity.RatingList;

@Service
public class MovieRatingServiceImpl implements MovieRatingService {

	//RestTemplate is used to call Rest API
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public List<MovieRating> getMovieRatingByUserId(String userId) {
		
		List<MovieRating> movieRatingList=new ArrayList<MovieRating>();
		
		//calling rating service and storing list in ratingList Object
		RatingList ratingList=restTemplate.getForObject("http://localhost:8084/ratings/"+userId, RatingList.class);
		
		//Iterating over RatingList and picking every rating
		for(Rating rating:ratingList.getRatings()) {
			// from everyrating, picking movie ID and calling movie service
			Movie movie=restTemplate.getForObject("http://localhost:8082/movies/"+rating.getMovieId(), Movie.class);
			
			// creating movie rating object
			MovieRating movieRating=new MovieRating(rating.getUserId(), movie.getMovieName(), rating.getRating());
			
			//adding movie rating object in list
			movieRatingList.add(movieRating);
		}
		return movieRatingList;
	}

}
