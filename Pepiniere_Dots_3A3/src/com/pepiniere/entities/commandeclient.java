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
public class commandeclient {
    
    private int id_CommandeClient;
    
    private String code;
   
    private Date dateCommande;
    
    private Client client; 
    
    private List<lignecommandeclient> lignecommandeclient;

    /**
     * @return the id_CommandeClient
     */
    public int getId_CommandeClient() {
        return id_CommandeClient;
    }

    /**
     * @param id_CommandeClient the id_CommandeClient to set
     */
    public void setId_CommandeClient(int id_CommandeClient) {
        this.id_CommandeClient = id_CommandeClient;
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
     * @return the date_commande
     */
    public Date getDateCommande() {
        return dateCommande;
    }

    /**
     * @param dateCommande the date_commande to set
     */
    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    /**
     * @return the client
     */
    public Client getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * @return the lignecommandeclient
     */
    public List<lignecommandeclient> getLignecommandeclient() {
        return lignecommandeclient;
    }

    /**
     * @param lignecommandeclient the lignecommandeclient to set
     */
    public void setLignecommandeclient(List<lignecommandeclient> lignecommandeclient) {
        this.lignecommandeclient = lignecommandeclient;
    }
            
    
}
