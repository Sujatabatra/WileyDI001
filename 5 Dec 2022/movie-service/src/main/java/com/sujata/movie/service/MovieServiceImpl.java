package com.sujata.movie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.movie.entity.Movie;
import com.sujata.movie.persistence.MovieDao;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieDao movieDao;
	
	@Override
	public Movie searchMovieById(int id) {
		return movieDao.findById(id).orElse(null);
	}

}
