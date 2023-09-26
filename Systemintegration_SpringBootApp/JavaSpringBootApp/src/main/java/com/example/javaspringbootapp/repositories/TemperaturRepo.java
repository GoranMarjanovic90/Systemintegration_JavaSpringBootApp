package com.example.javaspringbootapp.repositories;

import com.example.javaspringbootapp.models.Temperatur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemperaturRepo extends JpaRepository<Temperatur, Long> {

}
