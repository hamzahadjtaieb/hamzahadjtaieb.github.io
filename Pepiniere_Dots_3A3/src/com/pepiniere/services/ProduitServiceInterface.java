/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pepiniere.services;

import com.pepiniere.entities.Produit;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author AMZA
 */
interface ProduitServiceInterface {
    
     public void addProduit(Produit p) throws SQLException;
    public List<Produit> listerProduit (int id) throws SQLException;
     public void removeProduit(int id) throws SQLException ;
      public void updateProduit(Produit f) throws SQLException ;
          public int countProduit(int id_Produit);
    
}
