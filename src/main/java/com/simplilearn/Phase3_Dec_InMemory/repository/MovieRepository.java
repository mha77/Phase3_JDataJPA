package com.simplilearn.Phase3_Dec_InMemory.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.Phase3_Dec_InMemory.entity.Movie;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Integer> {

	
	public Movie findByName(String name);
	
	/*@Query("hQL qury")
	public Movie findByDepartment111();*/
}
