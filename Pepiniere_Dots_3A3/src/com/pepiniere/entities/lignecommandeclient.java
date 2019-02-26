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
public class lignecommandeclient {
    
    private int id_LigneCommandeClient;
    
    private int quantite;
    
    private Produit produit;
    
    private commandeclient commandeclient;

    /**
     * @return the id_LigneCommandeClient
     */
    public int getId_LigneCommandeClient() {
        return id_LigneCommandeClient;
    }

    /**
     * @param id_LigneCommandeClient the id_LigneCommandeClient to set
     */
    public void setId_LigneCommandeClient(int id_LigneCommandeClient) {
        this.id_LigneCommandeClient = id_LigneCommandeClient;
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

    /**
     * @return the commandeclient
     */
    public commandeclient getCommandeclient() {
        return commandeclient;
    }

    /**
     * @param commandeclient the commandeclient to set
     */
    public void setCommandeclient(commandeclient commandeclient) {
        this.commandeclient = commandeclient;
    }
    
    
    
    
}
