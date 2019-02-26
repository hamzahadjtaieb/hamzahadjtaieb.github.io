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
public class lignevente {
    
    private int id_LigneVente;
    
    private Produit produit;
    
    private vente vente;

    /**
     * @return the id_LigneVente
     */
    public int getId_LigneVente() {
        return id_LigneVente;
    }

    /**
     * @param id_LigneVente the id_LigneVente to set
     */
    public void setId_LigneVente(int id_LigneVente) {
        this.id_LigneVente = id_LigneVente;
    }

    /**
     * @return the produit
     */
    public Produit getProduit() {
        return produit;
    }

    /**
     * @param produit the produit to set
     */
    public void setProduit(Produit produit) {
        this.produit = produit;
    }
    
    
            
       
    
}
