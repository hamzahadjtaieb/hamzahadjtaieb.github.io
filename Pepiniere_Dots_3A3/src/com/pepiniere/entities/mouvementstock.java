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
public class mouvementstock {
    
    private static int ENTREE = 1;
    
    private static int SORTIE = 2;
    
    
    private int id_Mvtstock;
    
    private Date date;
    
    private int quantite;
    
    private int typemvt;
    
    private Produit produit;

    /**
     * @param aENTREE the ENTREE to set
     */
    public static void setENTREE(int aENTREE) {
        ENTREE = aENTREE;
    }

    /**
     * @param aSORTIE the SORTIE to set
     */
    public static void setSORTIE(int aSORTIE) {
        SORTIE = aSORTIE;
    }

    /**
     * @return the id_Mvtstock
     */
    public int getId_Mvtstock() {
        return id_Mvtstock;
    }

    /**
     * @param id_Mvtstock the id_Mvtstock to set
     */
    public void setId_Mvtstock(int id_Mvtstock) {
        this.id_Mvtstock = id_Mvtstock;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
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
     * @return the typemvt
     */
    public int getTypemvt() {
        return typemvt;
    }

    /**
     * @param typemvt the typemvt to set
     */
    public void setTypemvt(int typemvt) {
        this.typemvt = typemvt;
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
