package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Pelicula;
@Service
public interface PeliculaService {
	Pelicula create(Pelicula p);
	Pelicula update(Pelicula p);
	void delete(Long id);
	Pelicula read(Long id);
	List<Pelicula>readAll();
}
