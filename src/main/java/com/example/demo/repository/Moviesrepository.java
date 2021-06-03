package com.example.demo.repository;


import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.entity.Movies;

public interface Moviesrepository extends JpaRepository<Movies, Id> {
	public void deleteByName(String name);

	public Movies findByName(String name);
    }
