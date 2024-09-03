package com.example.demo.Dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.Entity.Renta;

@Component
public interface RentaDao {
	Renta create(Renta r);
	Renta update(Renta r);
	void delete(Long id);
	Renta read(Long id);
	List<Renta>readAll();
}
