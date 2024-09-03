package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Genero;
@Service
public interface GeneroService {
	Genero create(Genero g);
	Genero update(Genero g);
	void delete(Long id);
	Genero read(Long id);
	List<Genero>readAll();
}
