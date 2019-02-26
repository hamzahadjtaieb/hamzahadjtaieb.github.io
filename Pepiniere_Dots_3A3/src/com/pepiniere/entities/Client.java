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
public class Client {
    
    private int id_Client;
    
    private String nom;
    
    private String prenom;
    
    private int num_tel;
    
    private String email;
    
    private String adresse;
    
    private String login;
    
    private String mot_depasse;
    
    private List<commandeclient> commandeclient;
    
    
    public Client(){
        super();
    }
    

    /**
     * @return the id_Client
     */
    public int getId_Client() {
        return id_Client;
    }

    /**
     * @param id_Client the id_Client to set
     */
    public void setId_Client(int id_Client) {
        this.id_Client = id_Client;
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
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the mot_depasse
     */
    public String getMot_depasse() {
        return mot_depasse;
    }

    /**
     * @param mot_depasse the mot_depasse to set
     */
    public void setMot_depasse(String mot_depasse) {
        this.mot_depasse = mot_depasse;
    }

    /**
     * @return the commandeclient
     */
    public List<commandeclient> getCommandeclient() {
        return commandeclient;
    }

    /**
     * @param commandeclient the commandeclient to set
     */
    public void setCommandeclient(List<commandeclient> commandeclient) {
        this.commandeclient = commandeclient;
    }
    
    
            
    
}
