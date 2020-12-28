package com.example.projet.projet;

import com.example.projet.projet.model.Etudiants;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiants, String> {
}
