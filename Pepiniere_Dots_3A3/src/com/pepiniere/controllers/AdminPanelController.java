/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pepiniere.controllers;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author AMZA
 */
public class AdminPanelController implements Initializable {

    @FXML
    private JFXButton idconnect;

    /**
     * Initializes the controller class.
     */
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
    
    @FXML
    private void idconnectAdmin(ActionEvent event) throws IOException {
        
        FXMLLoader detail = new FXMLLoader(getClass().getResource("/com/pepiniere/gui/GestionPrAdmin.fxml"));
        Parent root2 = (Parent) detail.load();
        Stage stage1 = new Stage();
        stage1.setScene(new Scene(root2));
        stage1.show();
        
        
        
    }
    
}
