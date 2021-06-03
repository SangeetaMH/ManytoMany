package com.example.demo.repository;


import java.util.Set;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Director;
import com.example.demo.entity.Movies;

@Repository
public interface Directorrepository extends JpaRepository<Director, Id>{

	Set<Director> findById(int id);
    Set<Director> findByName(String name);
//	@Query("select d from director d join d.movies m where m.name=:name")
//	Set<Director> findBymoviename(@Param("name")String name);
//	Director save(Director director, int id);
//	
//	Director save(Director director, int id);
//	Set<Director> save(Set<Director> exsitingD);
}
