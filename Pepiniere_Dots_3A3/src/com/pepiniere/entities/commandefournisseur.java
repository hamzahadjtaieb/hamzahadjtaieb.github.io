/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pepiniere.entities;

import java.util.Date;
import java.util.List;

/**
 *
 * @author AMZA
 */
class commandefournisseur {
    
    private int id_CommandeFournisseur;
    
    private Date dateCommande;
    
    private fournisseur fournisseurs;
    
    private List<lignecommandefournisseur> lignecommandefournisseur;

    /**
     * @return the id_CommandeFournisseur
     */
    public int getId_CommandeFournisseur() {
        return id_CommandeFournisseur;
    }

    /**
     * @param id_CommandeFournisseur the id_CommandeFournisseur to set
     */
    public void setId_CommandeFournisseur(int id_CommandeFournisseur) {
        this.id_CommandeFournisseur = id_CommandeFournisseur;
    }

    /**
     * @return the dateCommande
     */
    public Date getDateCommande() {
        return dateCommande;
    }

    /**
     * @param dateCommande the dateCommande to set
     */
    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    /**
     * @return the fournisseurs
     */
    public fournisseur getFournisseurs() {
        return fournisseurs;
    }

    /**
     * @param fournisseurs the fournisseurs to set
     */
    public void setFournisseurs(fournisseur fournisseurs) {
        this.fournisseurs = fournisseurs;
    }

    /**
     * @return the lignecommandefournisseur
     */
    public List<lignecommandefournisseur> getLignecommandefournisseur() {
        return lignecommandefournisseur;
    }

    /**
     * @param lignecommandefournisseur the lignecommandefournisseur to set
     */
    public void setLignecommandefournisseur(List<lignecommandefournisseur> lignecommandefournisseur) {
        this.lignecommandefournisseur = lignecommandefournisseur;
    }
    
}
