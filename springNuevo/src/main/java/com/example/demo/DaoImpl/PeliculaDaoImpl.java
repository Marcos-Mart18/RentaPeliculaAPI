package com.example.demo.DaoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Dao.PeliculaDao;
import com.example.demo.Entity.Pelicula;
import com.example.demo.Repository.PeliculaRepository;

@Component
public class PeliculaDaoImpl implements PeliculaDao{
	@Autowired
	private PeliculaRepository peliculaRepository;
	@Override
	public Pelicula create(Pelicula p) {
		// TODO Auto-generated method stub
		return peliculaRepository.save(p);
	}

	@Override
	public Pelicula update(Pelicula p) {
		// TODO Auto-generated method stub
		return peliculaRepository.save(p);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		peliculaRepository.deleteById(id);
	}

	@Override
	public Pelicula read(Long id) {
		// TODO Auto-generated method stub
		return peliculaRepository.findById(id).get();
	}

	@Override
	public List<Pelicula> readAll() {
		// TODO Auto-generated method stub
		return peliculaRepository.findAll();
	}

}
