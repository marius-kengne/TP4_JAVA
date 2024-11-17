package com.example.tp4.JavaBean;

public class Formulaire {

    private String nom;
    private String email;
    private String sexe;
    private String codePostal;

    // Constructeur sans argument (requis pour un JavaBean)
    public Formulaire() {}


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    @Override
    public String toString() {
        return "Formulaire{" +
                "nom='" + nom + '\'' +
                ", prenom='" + email + '\'' +
                ", sexe='" + sexe + '\'' +
                ", codePostal='" + codePostal + '\'' +
                '}';
    }
}
