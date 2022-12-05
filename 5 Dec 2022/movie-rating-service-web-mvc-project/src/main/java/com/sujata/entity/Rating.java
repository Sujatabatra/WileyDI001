package com.sujata.entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rating {

	int ratingId;
	String userId;
	int movieId;
	int rating;
	
}
