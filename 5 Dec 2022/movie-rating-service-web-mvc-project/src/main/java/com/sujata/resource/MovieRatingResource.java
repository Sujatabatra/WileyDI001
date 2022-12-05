package com.sujata.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.entity.MovieRatingList;
import com.sujata.service.MovieRatingService;

@RestController
public class MovieRatingResource {

	@Autowired
	private MovieRatingService movieRatingService;
	
	@GetMapping(path="/movie/ratings/{uId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public MovieRatingList getMovieRatingByUserIdResource(@PathVariable("uId") String userId) {
		return new MovieRatingList(movieRatingService.getMovieRatingByUserId(userId));
	}
}
