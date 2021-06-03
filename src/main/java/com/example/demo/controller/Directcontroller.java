package com.example.demo.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Director;
import com.example.demo.entity.Movies;
import com.example.demo.service.Directorservice;
@RestController
public class Directcontroller {
	@Autowired
	private Directorservice service;
	@PostMapping("/adddirector")
	private Director addDirector(@RequestBody Director director)
	{
		return service.saveDirector(director);
	}
//	@PutMapping("/updatedirector/{id}")
//	private void Updatedirector(@RequestBody Set<Director> director,@PathVariable int id)
//	{
//		 service.updateDirector(director, id);
//		
//	}
////	
@GetMapping("/")
private List<Director> getDirector()
{
	return service.getDirector();
	
}
	
//@GetMapping("{name}")
//private Set<Director>getdetails(@PathVariable String name)
//{
//	return service.getDetails(name);
//}

	
	
	
	
	
	
	
	
	

	

}
