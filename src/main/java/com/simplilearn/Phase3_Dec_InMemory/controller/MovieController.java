package com.simplilearn.Phase3_Dec_InMemory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.Phase3_Dec_InMemory.entity.Movie;
import com.simplilearn.Phase3_Dec_InMemory.service.MovieService;

@RestController
public class MovieController {

	@Autowired
	MovieService movieService;

	@GetMapping("/movies")
	public List<Movie> getAllMovies() {
		return movieService.getAllMovies();
	}
	
	@DeleteMapping("/movies/{id}")
	private void deleteMovie(@PathVariable("id") int id) {
		movieService.delete(id);
	}
	
	@PostMapping("/movies")
	private int saveMovie(@RequestBody Movie movie) {
		movieService.saveMovie(movie);
		return movie.getId();
	}

}
