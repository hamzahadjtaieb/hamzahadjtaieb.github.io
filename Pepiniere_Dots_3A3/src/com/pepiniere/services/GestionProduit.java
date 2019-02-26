/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pepiniere.services;

import com.pepiniere.entities.Produit;
import com.pepiniere.entities.Categorie;
import com.pepiniere.entities.fos_user;
import com.pepiniere.util.ConnectionDb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author AMZA
 */
public class GestionProduit {
    
    private static GestionProduit gestionproduit;
    Connection cnx;
    
    public GestionProduit() throws SQLException {
       cnx = ConnectionDb.getInstance().getCnx();
       
        
    }
    
    public static GestionProduit getInstance() throws SQLException {
        if (gestionproduit == null) {
            return gestionproduit = new GestionProduit();
        }
        return gestionproduit;
    }
    
    private Statement ste ; private ResultSet rs; private PreparedStatement pst ;
    
    
    
    
    public void ajouter_produit(Produit p) throws SQLException
    {
         try {
             
             System.out.println("connexion établie");
             Statement stm = cnx.createStatement();
             System.out.println(p);
             String req = "INSERT INTO `produit`(`nom_produit`, `type_produit`,`description_produit`,`prix_produit`,`photo_produit`,`quantite`,`vendu_par`,`id_Categorie`) VALUES ('"+p.getNom_produit()+"','"+p.getType_produit()+"','"+p.getDescription_produit()+"','"+p.getPrix_produit()+"','"+p.getPhoto_produit()+"','"+p.getQuantite()+"','"+p.getVendu_par()+"','"+p.getId_Categorie()+"')";
            /// String req;
             //req = "INSERT INTO `produit` (`code_produit`, `nom_produit`, `type_produit`, `description_produit`, `prix_produit`, `photo_produit`, `id_Categorie`) VALUES ( '23', 'sdfsd', 'sdfsd', 'faf', '2', 'rwartest', '2')";
             System.out.println(req);
             stm.executeUpdate(req);
         } catch (SQLException ex) {
             Logger.getLogger(GestionProduit.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    
    
    public void supprimer_produit(Produit p) throws SQLException
    {
       String req = "delete from produit where id='"+p.getId_Produit()+"'";
       ste=cnx.createStatement();
       ste.executeUpdate(req);
        
    }
    
    public void supprimer_produit_byid(int id_opp) {

        
       // Produit p = new Produit();
        PreparedStatement ps = null;
        try {
            String query = "delete from produit where id_Produit=?";
            //String req = "update produit SET nom='"+p.getNom_produit()+"',Type='"+p.getType_produit()+"',Description='"+p.getDescription_produit()+"',prix='"+p.getPrix_produit()+"',photo='"+p.getPhoto_produit()+"' where id='"+p.getId_Produit()+"' ";
       
            ps = cnx.prepareStatement(query);
            ps.setInt(1, id_opp);
            System.out.println(ps);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
    
    
    
    public void modifier_produit(Produit p) throws SQLException
    {
       String req = "update produit SET nom_produit='"+p.getNom_produit()+"',type_produit='"+p.getType_produit()+"',description_produit='"+p.getDescription_produit()+"',prix_produit='"+p.getPrix_produit()+"',photo_produit='"+p.getPhoto_produit()+"',quantite='"+p.getQuantite()+"',vendu_par='"+p.getVendu_par()+"',id_Produit='"+p.getId_Produit()+"' where id_Produit='"+p.getId_Produit()+"' ";
       ste=cnx.createStatement();
       ste.executeUpdate(req);
        
    }
    
   
    public List<Produit> afficher_MenuList(Produit p) throws SQLException
    {
        
        List<Produit> listeprod = new ArrayList<>();
        //ResultSet rs;
        String req="select * from produit where id_produit='"+p.getId_Produit()+"' ";
        ste=cnx.createStatement();
        //rs=ste.executeQuery(req);
        ste.executeQuery(req);
        
        return listeprod;
        
    }
    
    
    
    
    public ObservableList<Produit> afficher_produitBycategorie(int id_Categorie) throws SQLException
    {
        String req="select * from produit where id_categorie='"+id_Categorie+"' ";
        ste=cnx.createStatement();
        rs=ste.executeQuery(req);
        //ObservableList<String> listecat = new FXCollections.observableArrayList
        ObservableList<Produit> listeproduit = FXCollections.observableArrayList();
       
        while(rs.next())
            
        {
             Produit p = new Produit();
            p.setId_Produit(rs.getInt("id"));
            p.setNom_produit(rs.getString("nom"));
            listeproduit.add(p);
          
        }
        return listeproduit ;
        
    }
    
    public int getidbyname(String nom) throws SQLException
    {
        int a =0;
        String req="select id from categorie where nom='"+nom+"' ";
        ste=cnx.createStatement();
        rs=ste.executeQuery(req);
        while(rs.next()){
        
           a = rs.getInt("id");
        }
        return a ;
        
        
    }

    public List<Produit> getAll(Produit produit) throws SQLException {
       
        String query = "select * from produit";
        ResultSet rs = cnx.createStatement().executeQuery(query);
        List<Produit> mmbrs = new ArrayList<>();
        while (rs.next()) {

            Produit mbr = new Produit();
            
            mbr.setNom_produit(rs.getString("nom_produit"));

            mbr.setId_Produit(rs.getInt("id_Produit"));
            mbr.setType_produit(rs.getString("type_produit"));
            mbr.setPrix_produit(rs.getFloat("prix_produit"));
            mbr.setPhoto_produit(rs.getString("photo_produit"));
            
            mbr.setQuantite(rs.getInt("quantite"));
            mbr.setVendu_par(rs.getInt("vendu_par"));
            
            /*mbr.setLastname(rs.getString("lastname"));
            mbr.setEmail(rs.getString("Email"));
            mbr.setPassword(rs.getString("password"));
            mbr.setBirthDate(rs.getDate("birth_date"));
            mbr.setGender(rs.getBoolean("gender"));
            mbr.setHeight(rs.getFloat("height"));
            mbr.setBodyType((Enumerations.BodyType.values()[rs.getInt("body_type")]));
            mbr.setChildrenNumber(rs.getInt("children_number"));
            mbr.setReligion((Enumerations.Religion.values()[rs.getInt("relegion")]));
            mbr.setReligionImportance((Enumerations.Importance.values()[rs.getInt("relegion_importance")]));
            mbr.setSmoker(rs.getBoolean("smoker"));
            mbr.setDrinker(rs.getBoolean("drinker"));
            mbr.setMinAge(rs.getInt("min_age"));
            mbr.setMaxAge(rs.getInt("max_age"));
            mbr.setPhone(rs.getInt("phone"));
            mbr.setLastLogin(rs.getTimestamp("last_login"));
            mbr.setLocked(rs.getShort("locked"));
            mbr.setIp(rs.getString("ip"));
            mbr.setPort(rs.getInt("port"));
            mbr.setAbout(rs.getString("about"));
            mbr.setMaritalStatus(Enumerations.MaritalStatus.values()[rs.getInt("civil_status")]);
            mbr.setConnected(rs.getBoolean("connected"));
            mbr.setCreatedAt(rs.getTimestamp("created_at"));
            mbr.setAddress(AddressService.getInstance().get(new Address(rs.getInt("address_id"))));*/
            
            mmbrs.add(mbr);
        }
        return mmbrs;
        
        }
    
    
    
    
    public int CountProduit(int id_Produit) {
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
    
    
    public ObservableList<Produit> listerFeedback(int id) throws SQLException {

        ConnectionDb db = ConnectionDb.getInstance();
        Connection cn = db.getCnx();
        //String query = "SELECT * FROM `feedback`,`fos_user`,`application`,`opportunity` WHERE ((feedback.id_user=fos_user.id) AND (feedback.id_application=application.id_application) AND (application.id_opportunity=opportunity.id_opp) AND (feedback.id_user = " + id + "))";
        String query = "SELECT * FROM `produit` WHERE ((produit.nom_produit=nom_produit))"; // AND (feedback.id_application=application.id_application) AND (application.id_opportunity=opportunity.id_opp) AND (feedback.id_user = " + id + "))";
        
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(query);
        List<Produit> lf = new ArrayList<Produit>();
        while (rs.next()) {
            Produit f = new Produit();

            /*fos_user u = new fos_user();
            u.setId(rs.getInt("fos_user.id"));
            u.setUsername(rs.getString("fos_user.username"));
            f.setUser(u);*/
            f.setNom_produit(rs.getString("nom_produit"));
            /*f.setRating(rs.getFloat("Rating"));
            f.setComment(rs.getString("comment"));
            f.setAdded_date(rs.getDate("added_date"));*/

            /*categorie a = new categorie();
            
            a.getOpportunity().setJob_title(rs.getString("opportunity.job_title"));
            a.setId(rs.getInt("application.id_application"));
            f.setApplication(a);*/

            lf.add(f);
        }
        ObservableList lf_final = FXCollections.observableArrayList(lf);
        return lf_final;
    }

    public int CountFeedbacks(int id) {
    
    
        int toretrun = 0;
        PreparedStatement ps = null;
        try {
            ConnectionDb db = ConnectionDb.getInstance();
            Connection cn = db.getCnx();
            String query = "SELECT count(*) FROM `produit` WHERE `id_Produit` = " + id;
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

    
    
    
    
    
    
    
