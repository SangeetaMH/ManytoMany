package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Movies;
import com.example.demo.service.Moviesservice;

@RestController
public class Moviecontroller{
@Autowired
	private Moviesservice ms;
     @PostMapping("/addmovies/{id}")
     private Movies Addmovies(@RequestBody Movies movie,@PathVariable int id)
     {
		return ms.saveMovies(movie,id);
    	 
     }
     @DeleteMapping("/{name}")
     
     private void deletemovies(@PathVariable String name)
     {
		 ms.delete(name);
    }
     

}
