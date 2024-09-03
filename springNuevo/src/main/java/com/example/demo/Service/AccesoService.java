package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Acceso;
@Service
public interface AccesoService {
	Acceso create(Acceso a);
	Acceso update(Acceso a);
	void delete(Long id);
	Acceso read(Long id);
	List<Acceso>readAll();
}
