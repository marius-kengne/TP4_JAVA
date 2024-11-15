package com.rsv.beans;

public class Reservation {
    private String type;
    private double prix;
    private String option;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type == null || type.trim().isEmpty()) {
            throw new IllegalArgumentException("Le type d'appartement ne peut pas être vide.");
        }
        this.type = type;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        if (prix <= 0) {
            throw new IllegalArgumentException("Le prix doit être supérieur à zéro.");
        }
        this.prix = prix;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        if (option == null || option.trim().isEmpty()) {
            throw new IllegalArgumentException("L'option ne peut pas être vide.");
        }
        this.option = option;
    }
}
