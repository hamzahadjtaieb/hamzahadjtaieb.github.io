/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pepiniere.controllers;

//import com.itextpdf.text.Rectangle;
import com.jfoenix.controls.JFXButton;
import com.pepiniere.entities.Produit;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

/**
 *
 * @author AMZA
 */
public class ProduitCellGuiController extends ListCell<Produit> {

    @FXML
    private TextArea comment;
    @FXML
    private Text user;
    @FXML
    private Text application;
    @FXML
    private Button remove;
    @FXML
    private Button update;
    @FXML
    private Label contract_id;
    @FXML
    private Label date;
    @FXML
    private Label description;

    private FXMLLoader mLLoader;
    @FXML
    private AnchorPane gridPane;
    @FXML
    private Label Categorie;

    @FXML
    private Label nomproduit;
    @FXML
    private Button id_ajouterpanier;
    @FXML
    private Text prix;
    @FXML
    private Text vendupar;
    @FXML
    private Text nom;
    @FXML
    private Text quantite;
    @FXML
    private Text total;
    @FXML
    private JFXButton plus;
    @FXML
    private JFXButton moins;
    @FXML
    private Rectangle rectangle;
    @FXML
    private Text Status;
    
    
    
    

    @Override
    protected void updateItem(Produit p, boolean empty) {
       
        super.updateItem(p, empty);
      //  System.out.println("file:C://xampp/htdocs/Pepiniere_Dots_3A3/src/images/" + p.getPhoto_produit());
       
        

        if (empty || p == null) {

            setText(null);
            setGraphic(null);

        } else {
            if (mLLoader == null) {
                mLLoader = new FXMLLoader(getClass().getResource("/com/pepiniere/gui/ProduitCellGui.fxml"));
                mLLoader.setController(this);

                try {
                    mLLoader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

            // photo.setImage(new Image("file:C://xampp/htdocs/Pepiniere_Dots_3A3/src/images/"+p.getPhoto_produit()));
            nomproduit.setText(p.getNom_produit());
            
            prix.setText(String.valueOf(p.getPrix_produit() ) );
            
            description.setText(p.getDescription_produit());
            nom.setText(p.getNom_produit());
            
            System.out.println(p.getQuantite());
            
            quantite.setText(String.valueOf(p.getQuantite()));
            vendupar.setText(String.valueOf(p.getVendu_par()));
            
            
             Image imageURL = new Image("http://localhost/Pepiniere_Dots_3A3/src/images/" + p.getPhoto_produit());
              rectangle.setFill(new ImagePattern(imageURL));
            

            //System.out.println(p.getCategorie());
            Categorie.setText(p.getCategorie().getNom_categorie());
            
        };

        setText(null);
        setGraphic(gridPane);
    }

    @FXML
    private void Ajouter_Au_Panier(ActionEvent event) {

    }

    @FXML
    private void plusplus(ActionEvent event) {
    }

    @FXML
    private void moinsAction(ActionEvent event) {
    }
}
