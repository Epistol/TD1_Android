package com.example.mlebeau.td1;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Student {

    private String nom;
    private String prenom;
    private String societe;
    private Position position;

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

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Student(String nom, String prenom, String societe, Position position) {


        this.nom = nom;
        this.prenom = prenom;
        this.societe = societe;
        this.position = position;
    }


    @Override
    public String toString(){
        NumberFormat df = new DecimalFormat("####0.0000");
        return nom + " " + "(" + df.format(position.getLat()) + "/" +  df.format(position.getLng()) + ")";
    }

}
