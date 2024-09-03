package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Cliente;
@Service
public interface ClienteService {
	Cliente create(Cliente c);
	Cliente update(Cliente c);
	void delete(Long id);
	Cliente read(Long id);
	List<Cliente>readAll();
}
