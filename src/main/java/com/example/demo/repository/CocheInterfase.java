package com.example.demo.repository;

import com.example.demo.model.Coche;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CocheInterfase extends JpaRepository<Coche, Long> {
}
