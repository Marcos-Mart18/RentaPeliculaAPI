package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.GeneroDao;
import com.example.demo.Entity.Genero;
import com.example.demo.Service.GeneroService;
@Service
public class GeneroServiceImpl implements GeneroService{
	@Autowired
	private GeneroDao generoDao;
	@Override
	public Genero create(Genero g) {
		// TODO Auto-generated method stub
		return generoDao.create(g);
	}

	@Override
	public Genero update(Genero g) {
		// TODO Auto-generated method stub
		return generoDao.update(g);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		generoDao.delete(id);
	}

	@Override
	public Genero read(Long id) {
		// TODO Auto-generated method stub
		return generoDao.read(id);
	}

	@Override
	public List<Genero> readAll() {
		// TODO Auto-generated method stub
		return generoDao.readAll();
	}

}
