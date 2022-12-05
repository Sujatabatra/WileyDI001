package com.sujata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.entity.MovieRating;
import com.sujata.service.MovieRatingService;

@Controller
public class MovieRatingController {

	@Autowired
	private MovieRatingService movieRatingService;
	
	@RequestMapping("/")
	public ModelAndView getUserInputPage() {
		return new ModelAndView("InputUserId");
	}
	
	@RequestMapping("/checkRating")
	public ModelAndView checkRatingController(@RequestParam("userId") String userId) {
		ModelAndView modelAndView=new ModelAndView();
		
		List<MovieRating> movieRatings=movieRatingService.getMovieRatingByUserId(userId);
		
		modelAndView.addObject("movieRatings", movieRatings);
		modelAndView.addObject("userId", userId);
		modelAndView.setViewName("ShowRating");
		return modelAndView;
	}
}
