package com.example.mlebeau.td1;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Student {
    private long id;


    private String nom;
    private String prenom;
    private String societe;
    private String position;

    public Student(String nomEtudiant, String prenomEtudiant, String societe, String adresse) {
        this.nom = nomEtudiant;
        this.prenom = prenomEtudiant;
        this.societe = societe;
        this.position = adresse;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSociete() {
        return societe;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
/*
    @Override
    public String toString(){
        NumberFormat df = new DecimalFormat("####0.0000");
        return nom + " " + "(" + df.format(position.getLat()) + "/" +  df.format(position.getLng()) + ")";
    }*/

}
