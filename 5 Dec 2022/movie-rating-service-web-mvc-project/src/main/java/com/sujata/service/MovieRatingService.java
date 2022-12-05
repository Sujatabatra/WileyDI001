package com.sujata.service;

import java.util.List;

import com.sujata.entity.MovieRating;

public interface MovieRatingService {

	List<MovieRating> getMovieRatingByUserId(String userId);
}
