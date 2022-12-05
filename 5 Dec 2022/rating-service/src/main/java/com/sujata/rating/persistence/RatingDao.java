package com.sujata.rating.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sujata.rating.entity.Rating;

@Repository
public interface RatingDao extends JpaRepository<Rating, Integer> {

	
	public List<Rating> searchRatingByUserId(String userId);
}
