package com.sujata.movie.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sujata.movie.entity.Movie;

@Repository
public interface MovieDao extends JpaRepository<Movie, Integer> {

}
