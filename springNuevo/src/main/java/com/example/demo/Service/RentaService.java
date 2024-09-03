package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Renta;
@Service
public interface RentaService {
	Renta create(Renta r);
	Renta update(Renta r);
	void delete(Long id);
	Renta read(Long id);
	List<Renta>readAll();
}
