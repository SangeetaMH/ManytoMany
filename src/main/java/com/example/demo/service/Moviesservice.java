package com.example.demo.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Director;
import com.example.demo.entity.Movies;
import com.example.demo.repository.Directorrepository;
import com.example.demo.repository.Moviesrepository;

@Service
@Transactional
public class Moviesservice {
	@Autowired
	private Moviesrepository mv;
	@Autowired
	private Directorrepository dr;

	
//	
	public Movies saveMovies(Movies movie,int id)
	{
	Set<Director> st=dr.findById(id);
	movie.setDirectors(st);
	   // movie.setDirectors(st);
	return mv.save(movie);
	
	}
	public void delete(String name)
	{
	   mv.deleteByName(name);
	}
	}
