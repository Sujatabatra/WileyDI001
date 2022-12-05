package com.sujata.rating.service;

import java.util.List;

import com.sujata.rating.entity.Rating;

public interface RatingService {

	List<Rating> searchRatingByUserId(String userId);
}
