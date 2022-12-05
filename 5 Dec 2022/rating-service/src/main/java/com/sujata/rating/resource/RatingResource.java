package com.sujata.rating.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.rating.entity.RatingList;
import com.sujata.rating.service.RatingService;

@RestController
public class RatingResource {

	@Autowired
	private RatingService ratingService;
	
	
	@GetMapping(path = "/ratings/{uId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public RatingList searchRatingByUserIdResource(@PathVariable("uId") String userId) {	
		return new RatingList(ratingService.searchRatingByUserId(userId));
	}
	
}
