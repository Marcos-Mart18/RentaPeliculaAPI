package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Acceso;
@Repository
public interface AccesoRepository extends JpaRepository<Acceso, Long> {

}
