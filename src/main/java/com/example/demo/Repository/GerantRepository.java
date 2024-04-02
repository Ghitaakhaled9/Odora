package com.example.demo.Repository;

import com.example.demo.entities.Gerant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GerantRepository extends JpaRepository<Gerant, Long> {
}
