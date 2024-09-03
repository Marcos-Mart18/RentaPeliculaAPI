package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.AccesoDao;
import com.example.demo.Entity.Acceso;
import com.example.demo.Service.AccesoService;
@Service
public class AccesoServiceImpl implements AccesoService{
	@Autowired
	private AccesoDao accesoDao;
	@Override
	public Acceso create(Acceso a) {
		// TODO Auto-generated method stub
		return accesoDao.create(a);
	}

	@Override
	public Acceso update(Acceso a) {
		// TODO Auto-generated method stub
		return accesoDao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		accesoDao.delete(id);
	}

	@Override
	public Acceso read(Long id) {
		// TODO Auto-generated method stub
		return accesoDao.read(id);
	}

	@Override
	public List<Acceso> readAll() {
		// TODO Auto-generated method stub
		return accesoDao.readAll();
	}

}
