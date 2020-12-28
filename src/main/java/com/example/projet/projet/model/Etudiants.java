package com.example.projet.projet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Etudiants {
    @Id
    private String num_etudiant;
    private String prenom;
    private String nom;

    public Etudiants(String num_etudiant, String prenom, String nom) {
        this.num_etudiant = num_etudiant;
        this.prenom = prenom;
        this.nom = nom;

    }

    public Etudiants(){}


    public String getNum_etudiant() {
        return num_etudiant;
    }

    public void setNum_etudiant(String numEtudiant) {
        this.num_etudiant = numEtudiant;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
