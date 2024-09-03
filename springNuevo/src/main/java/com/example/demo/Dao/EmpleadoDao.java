package com.example.demo.Dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.Entity.Empleado;
@Component
public interface EmpleadoDao {
	Empleado create(Empleado e);
	Empleado update(Empleado e);
	void delete(Long id);
	Empleado read(Long id);
	List<Empleado>readAll();
}
