package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Renta;
import com.example.demo.Service.RentaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/rentas")
public class RentaController {
	@Autowired
	private RentaService rentaService;
	
	@GetMapping
	public ResponseEntity<List<Renta>>readAll(){
		try {
			List<Renta>rentas=rentaService.readAll();
			if (rentas.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(rentas,HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping
	public ResponseEntity<Renta>create(@Valid @RequestBody Renta ren){
		try {
			Renta r=rentaService.create(ren);
			return new ResponseEntity<>(r,HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Renta>getRentaId(@PathVariable("id") Long id){
		try {
			Renta r=rentaService.read(id);
			return new ResponseEntity<>(r,HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Renta>delRenta(@PathVariable("id") Long id){
		try {
			rentaService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Renta>updateRenta(@PathVariable("id") Long id, @Valid @RequestBody Renta ren){
		Renta r=rentaService.read(id);
		if (r.getId()>0) {
			return new ResponseEntity<>(rentaService.update(ren),HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
}
