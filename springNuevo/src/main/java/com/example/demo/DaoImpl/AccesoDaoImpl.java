package com.example.demo.DaoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Dao.AccesoDao;
import com.example.demo.Entity.Acceso;
import com.example.demo.Repository.AccesoRepository;
@Component
public class AccesoDaoImpl implements AccesoDao{
	@Autowired
	private AccesoRepository accesoRepository;
	@Override
	public Acceso create(Acceso a) {
		// TODO Auto-generated method stub
		return accesoRepository.save(a);
	}

	@Override
	public Acceso update(Acceso a) {
		// TODO Auto-generated method stub
		return accesoRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		accesoRepository.deleteById(id);
	}

	@Override
	public Acceso read(Long id) {
		// TODO Auto-generated method stub
		return accesoRepository.findById(id).get();
	}

	@Override
	public List<Acceso> readAll() {
		// TODO Auto-generated method stub
		return accesoRepository.findAll();
	}

}
