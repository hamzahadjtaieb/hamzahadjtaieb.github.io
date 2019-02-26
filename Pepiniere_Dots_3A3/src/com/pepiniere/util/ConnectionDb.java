package com.pepiniere.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConnectionDb {
    
    public Connection cnx;
    public static ConnectionDb instance;
    final String url = "jdbc:mysql://127.0.0.1/pepiniere";
    final String login = "root";
    final String password = "";
    private ConnectionDb(){
        
        try {
//            DriverManager.registerDriver(new java.sql.jdbc.Driver ());


            cnx = DriverManager.getConnection(url,login,password);
            System.out.println("connexion établie!!!!");
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDb.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public Connection getCnx(){
        return cnx;
    }
    
    public static ConnectionDb getInstance(){
        if (instance == null)
            instance = new ConnectionDb();
        return instance;
    }
    
}
