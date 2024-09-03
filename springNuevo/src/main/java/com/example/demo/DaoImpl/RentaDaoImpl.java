package com.example.demo.DaoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Dao.RentaDao;
import com.example.demo.Entity.Renta;
import com.example.demo.Repository.RentaRepository;

@Component
public class RentaDaoImpl implements RentaDao{
	@Autowired
	private RentaRepository rentaRepository;
	@Override
	public Renta create(Renta r) {
		// TODO Auto-generated method stub
		return rentaRepository.save(r);
	}

	@Override
	public Renta update(Renta r) {
		// TODO Auto-generated method stub
		return rentaRepository.save(r);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		rentaRepository.deleteById(id);
	}

	@Override
	public Renta read(Long id) {
		// TODO Auto-generated method stub
		return rentaRepository.findById(id).get();
	}

	@Override
	public List<Renta> readAll() {
		// TODO Auto-generated method stub
		return rentaRepository.findAll();
	}

}
