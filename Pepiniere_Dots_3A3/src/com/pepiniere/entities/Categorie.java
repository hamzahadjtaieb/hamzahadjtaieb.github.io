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
public class Categorie {
    
    private int id_Categorie;
    
    private String nom_categorie;
    
    private String description;
    
    private String code;
    
   
    //une catagorie peut avoir plusieurs articles : creons une liste darticle pour 1 catagorie
    //@oneToMany(mappedBy = "categorie")
    private List <Produit> produit;
    
  
    //cstor
    public Categorie(){
    }

    
    
    

    /**
     * @return the id_Categorie
     */
    public int getId_Categorie() {
        return id_Categorie;
    }

    /**
     * @param id_Categorie the id_Categorie to set
     */
    public void setId_Categorie(int id_Categorie) {
        this.id_Categorie = id_Categorie;
    }

    /**
     * @return the nom_categorie
     */
    public String getNom_categorie() {
        return nom_categorie;
    }

    /**
     * @param nom_categorie the nom_categorie to set
     */
    public void setNom_categorie(String nom_categorie) {
        this.nom_categorie = nom_categorie;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the produit
     */
    public List<Produit> getProduit() {
        return produit;
    }

    /**
     * @param produit the produit to set
     */
    public void setProduit(List<Produit> produit) {
        this.produit = produit;
    }
    
    
    
    
    
    
    
    
}
