package com.sujata.movie.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.movie.entity.Movie;
import com.sujata.movie.service.MovieService;

@RestController
public class MovieResource {

	@Autowired
	private MovieService movieService;
	
	@GetMapping(path="/movies/{mid}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Movie searchMovieById(@PathVariable("mid") int id) {
		return movieService.searchMovieById(id);
	}
}
