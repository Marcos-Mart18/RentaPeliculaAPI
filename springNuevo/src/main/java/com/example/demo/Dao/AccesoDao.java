package com.example.demo.Dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.Entity.Acceso;
@Component
public interface AccesoDao {
	Acceso create(Acceso a);
	Acceso update(Acceso a);
	void delete(Long id);
	Acceso read(Long id);
	List<Acceso>readAll();
}
