package com.alura.frases.repository;

import com.alura.frases.models.Frases;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraseRepositorie extends JpaRepository<Frases, Long> {
}
