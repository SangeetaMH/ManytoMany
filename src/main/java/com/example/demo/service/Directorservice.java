package com.example.demo.service;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Director;
import com.example.demo.entity.Movies;
import com.example.demo.repository.Directorrepository;
import com.example.demo.repository.Moviesrepository;


@Service
public class Directorservice {
 @Autowired
 private Directorrepository repo;
 @Autowired
 private Moviesrepository mv;
public Director saveDirector(Director director)
	{
		return repo.save(director);
	}
//
//public Set<Director> updateDirector(Set<Director> director,int id)
//{
//	Set<Director> exsitingD = repo.findById(id);
//      exsitingD .setAge(((Director) director).getAge());
//     exsitingD .setAwardcount(((Director) director).getAwardcount());
//     return repo.save(exsitingD);   
//}
//public Director updateDirector(Set<Director> director,int id)
//{
//	Set<Director> d=repo.findById(id);
//	return 
//
//}
public List<Director> getDirector() {
	System.out.println(repo.findAll());
	return repo.findAll();
	
}
}
////public Set<Director> getDetails(String name){
////	return repo.findBymoviename(name);
////}
//}

