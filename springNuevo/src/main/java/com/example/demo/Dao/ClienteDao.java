package com.example.demo.Dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.Entity.Cliente;

@Component
public interface ClienteDao {
	Cliente create(Cliente c);
	Cliente update(Cliente c);
	void delete(Long id);
	Cliente read(Long id);
	List<Cliente>readAll();
}
