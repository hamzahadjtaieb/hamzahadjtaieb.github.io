/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pepiniere.entities;

/**
 *
 * @author AMZA
 */
public class Produit {
    
    private fos_user user;

    private int id_Produit;

    private String code_produit;

    private String nom_produit;

    private String type_produit;

    private String description_produit;

    private float prix_produit;

    private String photo_produit;
    
    private int id_Categorie;
    
    private int vendu_par;
    
    private int quantite;

    
    //@manytoone 
    //JoinCollumn(id_Produit)
    private Categorie categorie;
    
    
    
    
    public Produit(){
    }

    public Produit(String nom_produit, String description_produit, float prix_produit) {
        this.nom_produit = nom_produit;
        this.description_produit = description_produit;
        this.prix_produit = prix_produit;
    }

    public Produit(String nom_produit, String type_produit, String description_produit, float prix_produit, String photo_produit, int id_Categorie) {
        
        this.nom_produit = nom_produit;
        this.type_produit = type_produit;
        this.description_produit = description_produit;
        this.prix_produit = prix_produit;
        this.photo_produit = photo_produit;
        this.id_Categorie = id_Categorie;
    }

    public Produit(String hans, String muster) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    /**
     * @return the id_Produit
     */
    public int getId_Produit() {
        return id_Produit;
    }

    /**
     * @param id_Produit the id_Produit to set
     */
    public void setId_Produit(int id_Produit) {
        this.id_Produit = id_Produit;
    }

    /**
     * @return the code_produit
     */
    public String getCode_produit() {
        return code_produit;
    }

    /**
     * @param code_produit the code_produit to set
     */
    public void setCode_produit(String code_produit) {
        this.code_produit = code_produit;
    }

    /**
     * @return the nom_produit
     */
    public String getNom_produit() {
        return nom_produit;
    }

    /**
     * @param nom_produit the nom_produit to set
     */
    public void setNom_produit(String nom_produit) {
        this.nom_produit = nom_produit;
    }

    /**
     * @return the type_produit
     */
    public String getType_produit() {
        return type_produit;
    }

    /**
     * @param type_produit the type_produit to set
     */
    public void setType_produit(String type_produit) {
        this.type_produit = type_produit;
    }

    /**
     * @return the description_produit
     */
    public String getDescription_produit() {
        return description_produit;
    }

    /**
     * @param description_produit the description_produit to set
     */
    public void setDescription_produit(String description_produit) {
        this.description_produit = description_produit;
    }

    /**
     * @return the prix_produit
     */
    public float getPrix_produit() {
        return prix_produit;
    }

    /**
     * @param prix_produit the prix_produit to set
     */
    public void setPrix_produit(float prix_produit) {
        this.prix_produit = prix_produit;
    }

    /**
     * @return the photo_produit
     */
    public String getPhoto_produit() {
        return photo_produit;
    }

    /**
     * @param photo_produit the photo_produit to set
     */
    public void setPhoto_produit(String photo_produit) {
        this.photo_produit = photo_produit;
    }

    /**
     * @return the categorie
     */
    public Categorie getCategorie() {
        return categorie;
    }

    /**
     * @param categorie the categorie to set
     */
    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
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

    @Override
    public String toString() {
        return "produit{" + "id_Produit=" + getId_Produit() + ", code_produit=" + getCode_produit() + ", nom_produit=" + getNom_produit() + ", type_produit=" + getType_produit() + ", description_produit=" + getDescription_produit() + ", prix_produit=" + getPrix_produit() + ", photo_produit=" + getPhoto_produit() + ", id_Categorie=" + getId_Categorie() + ", categorie=" + getCategorie() + '}';
    }

    /**
     * @return the user
     */
    public fos_user getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(fos_user user) {
        this.user = user;
    }

    /**
     * @return the vendu_par
     */
    public int getVendu_par() {
        return vendu_par;
    }

    /**
     * @param vendu_par the vendu_par to set
     */
    public void setVendu_par(int vendu_par) {
        this.vendu_par = vendu_par;
    }

    /**
     * @return the quantite
     */
    public int getQuantite() {
        return quantite;
    }

    /**
     * @param quantite the quantite to set
     */
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

} 
