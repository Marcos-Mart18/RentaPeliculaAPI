package com.example.demo.Dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.Entity.Genero;

@Component
public interface GeneroDao {
	Genero create(Genero g);
	Genero update(Genero g);
	void delete(Long id);
	Genero read(Long id);
	List<Genero>readAll();
}
