package com.example.demo.Dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.Entity.Rol;

@Component
public interface RolDao {
	Rol create(Rol r);
	Rol update(Rol r);
	void delete(Long id);
	Rol read(Long id);
	List<Rol>readAll();
}
