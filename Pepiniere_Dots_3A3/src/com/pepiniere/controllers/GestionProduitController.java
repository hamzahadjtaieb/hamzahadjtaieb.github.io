/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pepiniere.controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import com.pepiniere.entities.Enumerations;
import com.pepiniere.entities.Client;
import com.pepiniere.entities.Produit;
import com.pepiniere.services.GestionProduit;
import com.pepiniere.services.Upload;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

//

/**
 * FXML Controller class
 *
 * @author AMZA
 */
public class GestionProduitController implements Initializable {

    

    @FXML
    private Button ajouterproduit;
    @FXML
    private TextField txtNom;
    @FXML
    private TextField txtdescription;
    @FXML
    private TextField txtprix;
    @FXML
    private ImageView imageproduit;

    //C:\Users\AMZA\Desktop\a.jpg
    //photo
    String path = "http://localhost/Pepiniere_Dots_3A3/src/images/";
    
    //private TextField txtType;
    
    //private TextField txtidcategorie;
    
    private Client client;
    @FXML
    private JFXButton idretour;
    @FXML
    private JFXTextField txtQuantite;
    @FXML
    private JFXTextField txtvendupar;
    
    @FXML
    private ChoiceBox<String> choiceType;
    
    
    
    
    

    /**
     * Initializes the controller class.
     *
     *
     * @param url
     * @param rb
     */
    
    /*public void setClient(Client client) {
        this.client = client;
        populateFields();
    }
    
    */

    /*public void setMember(Member member){
        this.member = member;
        populateFields();
    }*/
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        choiceType.getItems().add("Fleur");
        choiceType.getItems().add("Arbre");
        choiceType.getItems().add("Plante");
        
        //CategorieTypeBox.getItems().setAll(Enumerations.BodyType.values());
        //CategorieTypeBox.getSelectionModel().select(Enum<Enumerations.BodyType>);
    }
    
    @FXML
    private void ajouterProduit(ActionEvent event) throws SQLException {

        GestionProduit gp = new GestionProduit();
        
        

        String prix = txtprix.getText();
        float prixx = Integer.parseInt(prix);

        //String id_Categorie = txtidcategorie.getText();
        //int idd = Integer.parseInt(id_Categorie);

        Produit p = new Produit();

        p.setNom_produit(txtNom.getText());
        //p.setType_produit(txtType.getText());
        
        p.setType_produit(choiceType.getSelectionModel().selectedItemProperty().get());
        if(choiceType.getSelectionModel().selectedItemProperty().get().equals("Fleur")){
            p.setId_Categorie(1);
        }
        if(choiceType.getSelectionModel().selectedItemProperty().get().equals("Arbre")){
            p.setId_Categorie(2);
        }
        if(choiceType.getSelectionModel().selectedItemProperty().get().equals("Plante")){
            p.setId_Categorie(3);
        }
        
        
        
        p.setDescription_produit(txtdescription.getText());
        p.setPrix_produit(prixx);
        p.setPhoto_produit(path);
        p.setQuantite(Integer.valueOf(txtQuantite.getText()));
        p.setVendu_par(Integer.valueOf(txtvendupar.getText()));
        
        
        
        
        //p.setId_Categorie(idd);
        
        

        System.out.println(p.toString());
        gp.ajouter_produit(p);
        
    }


    @FXML
    private void uploadphoto(ActionEvent event) throws IOException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        Stage stage = new Stage();
        File file = fileChooser.showOpenDialog(stage);
        if (file != null) {
            Upload u = new Upload();
            u.upload(file);
            String Fileurl = "file:\\\\\\" + file.getPath();
            Fileurl = Fileurl.replace("\\", "/");
            imageproduit.setImage(new Image(Fileurl, 350, 272, true, true));
            path = file.getName();

        }

    }

    @FXML
    private void id_retour(ActionEvent event) throws IOException {
      
    }

    @FXML
    private void test(MouseEvent event) {
        System.out.println(choiceType.getSelectionModel().selectedItemProperty().get());
    }

}
