/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pepiniere.services;

import com.pepiniere.entities.Categorie;
import com.pepiniere.entities.Produit;
import com.pepiniere.util.ConnectionDb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author AMZA
 */
public class ProduitService implements ProduitServiceInterface {
    
    
    
    @Override
    public void addProduit(Produit p) throws SQLException {
        
        
        ConnectionDb db = ConnectionDb.getInstance();
        Connection cn = db.getCnx();
        
        //String query = "INSERT INTO `produit` (`id_Produit` , `Rating`, `comment` , `added_date` , `id_application`) VALUES (?,?,?,?,?)";
        
        
        String req = "INSERT INTO `produit`( `code_produit`,`nom_produit`, `type_produit`,`description_produit`,`prix_produit`,`photo_produit`,`id_Categorie`) VALUES ('"+p.getCode_produit()+"','"+p.getNom_produit()+"','"+p.getType_produit()+"','"+p.getDescription_produit()+"','"+p.getPrix_produit()+"','"+p.getPhoto_produit()+"','"+p.getId_Categorie()+"')";
            
        System.out.println(req);
        //st.execute();
        
        /*PreparedStatement st = cn.prepareStatement(query);
        System.out.println(st);
        st.setInt(1, f.getUser().getId());
        st.setFloat(2, f.getRating());
        st.setString(3, f.getComment());
        java.sql.Date date = new java.sql.Date(f.getAdded_date().getTime());
        st.setDate(4, date);
        st.setInt(5, f.getApplication().getId());
        System.out.println(st);
        st.execute();
        System.out.println(st);*/

    }
    
    @Override
    public ObservableList<Produit> listerProduit(int id) throws SQLException {

        ConnectionDb db = ConnectionDb.getInstance();
        Connection cn = db.getCnx();
        
        //String query = "SELECT * FROM `feedback`,`fos_user`,`application`,`opportunity` WHERE ((feedback.id_user=fos_user.id) AND (feedback.id_application=application.id_application) AND (application.id_opportunity=opportunity.id_opp) AND (feedback.id_user = " + id + "))";
        
        String query ="SELECT P.nom_produit,P.id_Categorie,P.code_produit,C.description,C.code,C.nom_Categorie,P.id_Produit,P.type_produit, P.description_produit,P.prix_produit, P.photo_produit,P.vendu_par,P.quantite FROM produit AS P INNER JOIN categorie AS C ON C.id_Categorie = P.id_Categorie";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(query);
        
        List<Produit> lf = new ArrayList<Produit>();
        while (rs.next()) {
            Produit f = new Produit();
            Categorie c = new Categorie();
            /*fos_user u = new fos_user();
            u.setId(rs.getInt("fos_user.id"));
            u.setUsername(rs.getString("fos_user.username"));
            f.setUser(u);*/
            c.setDescription(rs.getString("description"));
            c.setNom_categorie(rs.getString("nom_Categorie"));
            c.setId_Categorie(rs.getInt("id_Categorie"));
            c.setCode(rs.getString("code"));
            f.setId_Categorie(rs.getInt("id_Categorie"));
            f.setId_Produit(rs.getInt("id_Produit"));
            f.setNom_produit(rs.getString("nom_produit"));
            f.setPhoto_produit(rs.getString("photo_produit"));
            f.setPrix_produit(rs.getFloat("prix_produit"));
            f.setDescription_produit(rs.getString("description_produit"));
            f.setQuantite(rs.getInt("quantite"));
            f.setVendu_par(rs.getInt("vendu_par"));
            f.setCategorie(c);

            /*Application a = new Application();
            
            a.getOpportunity().setJob_title(rs.getString("opportunity.job_title"));
            a.setId(rs.getInt("application.id_application"));
            f.setApplication(a);*/

            lf.add(f);
        }
        ObservableList lf_final = FXCollections.observableArrayList(lf);
        return lf_final;
    }
    
    
    @Override
    public void removeProduit(int id) throws SQLException {

        ConnectionDb db = ConnectionDb.getInstance();
        Connection cn = db.getCnx();
        String query = "DELETE FROM `produit` WHERE `id_Produit` = " + id;
        PreparedStatement st = cn.prepareStatement(query);
        st.execute();

    }
    
    @Override
    public void updateProduit(Produit p) throws SQLException {

        ConnectionDb db = ConnectionDb.getInstance();
        Connection cn = db.getCnx();
        String query = "UPDATE `produit` SET `nom_Produit`=?,`description_Produit`=?,`type_Produit`=? WHERE `id_Produit` =? ";
        PreparedStatement st = cn.prepareStatement(query);
       // st.execute();
       
       
        st.setFloat(1, p.getPrix_produit());
        st.setString(2, p.getDescription_produit());
        java.sql.Date d1 = new java.sql.Date((new java.util.Date()).getTime());
        st.setDate(3, d1);
        st.setInt(4, p.getId_Produit());
        st.execute();

    }
    
    @Override
    public int countProduit(int id_Produit) {
        int toretrun = 0;
        PreparedStatement ps = null;
        try {
            ConnectionDb db = ConnectionDb.getInstance();
            Connection cn = db.getCnx();
            String query = "SELECT count(*) FROM produit WHERE `id_Produit` = " + id_Produit;
            ps = cn.prepareStatement(query);
            System.out.println(ps);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                toretrun = rs.getInt(1);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return toretrun;
    }
    
}
