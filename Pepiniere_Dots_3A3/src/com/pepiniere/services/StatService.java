/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pepiniere.services;

import com.pepiniere.util.ConnectionDb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AMZA
 */
public class StatService {
    
    
    private static StatService statService;
    Statement st;
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    Connection cnx;
    public StatService(){
        cnx = ConnectionDb.getInstance().getCnx();
       
        
    }
    
    
    
    
    
    
    
    public ResultSet getStats() throws SQLException {
        PreparedStatement stat = con.prepareStatement("select concat(MONTH(created_at)) as created from produit");
        return stat.executeQuery();
    }

    public ResultSet getGender() throws SQLException {
        PreparedStatement stat = cnx.prepareStatement("select gender as sex from user");
        return stat.executeQuery();
    }

    public ResultSet getLike() throws SQLException {
        PreparedStatement stat = cnx.prepareStatement("select concat(MONTH(date)) as created1 from user_like");
        return stat.executeQuery();
    }

    public ResultSet getBlock() throws SQLException {
        PreparedStatement stat = cnx.prepareStatement("select concat(MONTH(date)) as created2 from user_block");
        return stat.executeQuery();
    }

    public ResultSet getSignal() throws SQLException {
        PreparedStatement stat = cnx.prepareStatement("select concat(MONTH(date)) as created3 from user_signal");
        return stat.executeQuery();
    }
    
}
