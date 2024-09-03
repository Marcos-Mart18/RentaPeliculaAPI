package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Renta;

@Repository
public interface RentaRepository extends JpaRepository<Renta, Long> {

}
