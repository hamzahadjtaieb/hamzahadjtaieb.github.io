/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pepiniere.controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.pepiniere.entities.Produit;
import com.pepiniere.services.GestionProduit;
import java.net.URL;
import java.sql.SQLException;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author AMZA
 */
public class ModifierProduitController implements Initializable {

    @FXML
    private JFXTextField txtNom;
    @FXML
    private JFXButton idmodifier;
    @FXML
    private JFXTextField txtType;
    @FXML
    private JFXTextField txtprix;
    private JFXTextField txtdescription;
    @FXML
    private ImageView imageproduit;
    @FXML
    private JFXTextField txtquantiteM;
    @FXML
    private JFXTextField txtvenduparM;
    @FXML
    private JFXTextField txtidproduit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        txtidproduit.setText(String.valueOf(GestionPrAdminController.p.getId_Produit()));
        txtNom.setText(GestionPrAdminController.p.getNom_produit());
        //txtdescription.setText(GestionPrAdminController.p.getDescription_produit());
        txtType.setText(GestionPrAdminController.p.getType_produit());
        txtNom.setText(GestionPrAdminController.p.getNom_produit());
        txtquantiteM.setText(String.valueOf(GestionPrAdminController.p.getQuantite()));
        txtprix.setText(String.valueOf(GestionPrAdminController.p.getQuantite()));
        txtvenduparM.setText(String.valueOf(GestionPrAdminController.p.getVendu_par()));
        
        
        
        // TODO
    }    
    
    private void alert1(String Message) {
        Alert a1 = new Alert(Alert.AlertType.ERROR);
        a1.setTitle("Alert");
        a1.setHeaderText("Champ Vide");
        a1.setContentText(Message);
        a1.showAndWait();
    }

    //alert 1 lel suppression
    private boolean alert1Confirmation() {
        Alert a1 = new Alert(Alert.AlertType.CONFIRMATION);
        a1.setTitle("Modification Dialog");
        a1.setHeaderText("Confirmation de la Modification ");
        a1.setContentText("Modification SUCCESS");
        Optional<ButtonType> result = a1.showAndWait();
        if (result.get() == ButtonType.OK) {
            return true;
        } else {
            return false;
        }

    }


    @FXML
    private void modifier_produit(ActionEvent event) throws SQLException {
        
        if(txtNom.getText().isEmpty()){
            
            alert1("Le champ nom est vide");
            
        }else if(txtType.getText().isEmpty()){
            
            alert1("Le champ Type est vide");
            
        }else if (txtprix.getText().isEmpty()){
            
            alert1("Le champ Type est vide");
            
        }else if(txtprix.getText().isEmpty()){
            
            alert1("Le champ Type est vide");
            
        }else if(txtprix.getText().isEmpty()){
            
            alert1("Le champ Type est vide");
            
        }else if(txtquantiteM.getText().isEmpty()){
            
            alert1("Le champ Type est vide");
            
        }else if(txtvenduparM.getText().isEmpty()){
            
            alert1("Le champ Type est vide");
            
        }else{
        
        
        
        Produit p = new Produit();
        GestionProduit gp = new GestionProduit();
        
        p.setId_Produit(GestionPrAdminController.p.getId_Produit());
        p.setNom_produit(txtNom.getText());
        p.setType_produit(txtType.getText());
        p.setPrix_produit(Float.valueOf(txtprix.getText()));
        p.setQuantite(Integer.valueOf(txtquantiteM.getText()));
        p.setVendu_par(Integer.valueOf(txtvenduparM.getText()));
       
        gp.modifier_produit(p);
        
        alert1Confirmation();
         
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*TrayNotification tn = new TrayNotification("Succes","Modification effectué !", NotificationType.SUCCESS);
        tn.showAndDismiss(Duration.millis(3000));
        }
        
        else{
        TrayNotification tn = new TrayNotification("Echec","Veuillez remplir les champs !", NotificationType.ERROR);
        tn.showAndDismiss(Duration.millis(3000));
        }*/
        
        /*System.out.println("bij");
        
        Produit O1=new Produit(txtidproduit.getText(),txtquantiteM.getText(),txtNom.getText(),txtType.getText(),txtquantiteM.valueOf(fin.getValue()),Float.parseFloat(txtprix.getText()));
        System.out.println(O1);
        System.out.println("bij");
        GestionProduit S=new GestionProduit();
        System.out.println("bij");
        S.update_opportunity(O1,Integer.valueOf(id.getText()));
        System.out.println("bij");
        annuler();*/
          
        
        
    }

    @FXML
    private void uploadphoto(ActionEvent event) {
    }
    
}
