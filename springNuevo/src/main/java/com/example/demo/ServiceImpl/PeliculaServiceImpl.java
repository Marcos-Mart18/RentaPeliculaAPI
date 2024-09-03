package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.PeliculaDao;
import com.example.demo.Entity.Pelicula;
import com.example.demo.Service.PeliculaService;

@Service
public class PeliculaServiceImpl implements PeliculaService{
	@Autowired
	private PeliculaDao peliculaDao;
	@Override
	public Pelicula create(Pelicula p) {
		// TODO Auto-generated method stub
		return peliculaDao.create(p);
	}

	@Override
	public Pelicula update(Pelicula p) {
		// TODO Auto-generated method stub
		return peliculaDao.update(p);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		peliculaDao.delete(id);
	}

	@Override
	public Pelicula read(Long id) {
		// TODO Auto-generated method stub
		return peliculaDao.read(id);
	}

	@Override
	public List<Pelicula> readAll() {
		// TODO Auto-generated method stub
		return peliculaDao.readAll();
	}

}
