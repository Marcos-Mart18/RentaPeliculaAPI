package com.example.demo.Dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.Entity.Pelicula;


@Component
public interface PeliculaDao {
	Pelicula create(Pelicula p);
	Pelicula update(Pelicula p);
	void delete(Long id);
	Pelicula read(Long id);
	List<Pelicula>readAll();
}
