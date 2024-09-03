package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Rol;
@Service
public interface RolService {
	Rol create(Rol r);
	Rol update(Rol r);
	void delete(Long id);
	Rol read(Long id);
	List<Rol>readAll();
}
