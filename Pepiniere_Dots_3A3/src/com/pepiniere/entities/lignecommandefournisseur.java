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
public class lignecommandefournisseur {
    
    private int id_LigneCmdFr;
    
    private Produit produit;
    
    private commandefournisseur commandefournisseur;

    /**
     * @return the id_LigneCmdFr
     */
    public int getId_LigneCmdFr() {
        return id_LigneCmdFr;
    }

    /**
     * @param id_LigneCmdFr the id_LigneCmdFr to set
     */
    public void setId_LigneCmdFr(int id_LigneCmdFr) {
        this.id_LigneCmdFr = id_LigneCmdFr;
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
     * @return the commandefournisseur
     */
    public commandefournisseur getCommandefournisseur() {
        return commandefournisseur;
    }

    /**
     * @param commandefournisseur the commandefournisseur to set
     */
    public void setCommandefournisseur(commandefournisseur commandefournisseur) {
        this.commandefournisseur = commandefournisseur;
    }
}
