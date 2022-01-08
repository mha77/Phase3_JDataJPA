package com.simplilearn.Phase3_Dec_InMemory.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.Phase3_Dec_InMemory.entity.Movie;
import com.simplilearn.Phase3_Dec_InMemory.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	MovieRepository movieRepository;
	
	public List<Movie> getAllMovies() {
		List<Movie> movies = new ArrayList<>();
		movieRepository.findAll().forEach(movie -> movies.add(movie));
		return movies;
	}
	
	public void saveMovie(Movie movie) {
		movieRepository.save(movie);
	}
	
	public void delete(int id) {
		movieRepository.deleteById(id);
	}
}
