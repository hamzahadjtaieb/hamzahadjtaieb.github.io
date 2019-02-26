/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pepiniere.entities;

import java.util.List;

/**
 *
 * @author AMZA
 */
public class fournisseur {
    
    private int id_Fournisseur;
    
    private String nom;
    
    private String prenom;
    
    private int num_tel;
    
    private String email;
    
    private String adresse;
    
    private List<commandefournisseur> commandefournisseur;
    
    
    
    
    public fournisseur(){
        super();
     }

    /**
     * @return the id_Fournisseur
     */
    public int getId_Fournisseur() {
        return id_Fournisseur;
    }

    /**
     * @param id_Fournisseur the id_Fournisseur to set
     */
    public void setId_Fournisseur(int id_Fournisseur) {
        this.id_Fournisseur = id_Fournisseur;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the num_tel
     */
    public int getNum_tel() {
        return num_tel;
    }

    /**
     * @param num_tel the num_tel to set
     */
    public void setNum_tel(int num_tel) {
        this.num_tel = num_tel;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * @return the commandefournisseur
     */
    public List<commandefournisseur> getCommandefournisseur() {
        return commandefournisseur;
    }

    /**
     * @param commandefournisseur the commandefournisseur to set
     */
    public void setCommandefournisseur(List<commandefournisseur> commandefournisseur) {
        this.commandefournisseur = commandefournisseur;
    }
    
    
    
}
