package com.sujata.rating.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.rating.entity.Rating;
import com.sujata.rating.persistence.RatingDao;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingDao ratingDao;
	
	@Override
	public List<Rating> searchRatingByUserId(String userId) {
		
		return ratingDao.searchRatingByUserId(userId);
	}

}
