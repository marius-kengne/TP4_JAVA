package com.rsv.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Client {
    private String nom;
    private String prenom;
    private String telephone;
    private String email;
    private Reservation reservation;
    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$"
    );

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if (nom == null || nom.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom ne doit pas être vide.");
        }
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        if (prenom == null || prenom.trim().isEmpty()) {
            throw new IllegalArgumentException("Le prénom ne doit pas être vide.");
        }
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        if (telephone == null || !telephone.matches("^\\d{7}$")) {
            throw new IllegalArgumentException("Téléphone doit contenir au moins 7 chiffres.");
        }
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || !EMAIL_PATTERN.matcher(email).matches()) {
            throw new IllegalArgumentException("Email invalide.");
        }
        this.email = email;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

}
