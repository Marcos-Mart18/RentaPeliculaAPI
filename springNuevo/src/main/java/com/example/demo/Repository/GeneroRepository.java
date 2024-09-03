package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Genero;
@Repository
public interface GeneroRepository extends JpaRepository<Genero, Long> {

}
