package com.sujata.rating.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Rating {

	@Id
	int ratingId;
	String userId;
	int movieId;
	int rating;
	
}
