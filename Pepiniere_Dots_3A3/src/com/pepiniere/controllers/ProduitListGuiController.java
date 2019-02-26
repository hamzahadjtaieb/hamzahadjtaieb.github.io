/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pepiniere.controllers;

import com.jfoenix.controls.JFXButton;
import com.pepiniere.entities.Produit;
import com.pepiniere.services.ProduitService;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.Comparator;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author AMZA
 */
public class ProduitListGuiController implements Initializable {

    @FXML
    private Text count;
    @FXML
    private TextField rechercheF;
    @FXML
    private ListView<Produit> List;
    @FXML
    private ImageView Profile_pic;
    
    @FXML
    private Label username;
    @FXML
    private ImageView pic1;
    
    ObservableList<Produit> data;
    @FXML
    private Button arbre;
    @FXML
    private Button fleur;
    @FXML
    private Button plante;
    @FXML
    private Button tous;
    @FXML
    private JFXButton trieAZ;
    @FXML
    private JFXButton prixAsc;
    @FXML
    private JFXButton prixDesc;
    @FXML
    private Button AdminButton;
    
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ProduitService S =new ProduitService();
        try {
            
            data=S.listerProduit(1);
             List.setItems(data);
             data.forEach(System.out::println);
         List.setCellFactory(ProduitListView -> new ProduitCellGuiController());  
        //List.setCellFactory(ProduitListView -> new ProduitCellController());
       // initFilter();
        int i = S.countProduit(1);
        count.setText(String.valueOf(i));
        
        
        rechercheF.textProperty().addListener(new ChangeListener<String>(){
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, 
                String newValue) {
                ObservableList<Produit> tmp = FXCollections.observableArrayList();
                
                for (Produit produit : data) {
                    if ( (produit.getNom_produit().toLowerCase().contains(newValue.toLowerCase() ) ) || (produit.getCategorie().getNom_categorie().toLowerCase().contains(newValue.toLowerCase())) )  {
                        tmp.add(produit);

                    }
                }
                
                List.setItems(null);
                tmp.forEach(System.out::println);
                
                //Cellule right Here
               // List.setCellFactory(ProduitListView -> new ProduitCellController());

                count.setText(String.valueOf(tmp.stream().count()));
                List.refresh();
                                List.setItems(tmp);
                                                List.refresh();


                
            }});
        
        
      
        
        
        
        } catch (SQLException ex) {
        }
        
        
        // TODO
    }    

    
  @FXML
    private void trieAZ(ActionEvent event) throws IOException {
        
List.setItems(data.sorted(Comparator.comparing(p -> p.getNom_produit())));
    }
    
    
      @FXML
    private void prixAsc(ActionEvent event) throws IOException {
        
List.setItems(data.sorted(Comparator.comparing(p -> p.getPrix_produit())));	
    }
    
      @FXML
    private void prixDesc(ActionEvent event) throws IOException {
List.setItems(data.sorted(Comparator.comparing(p -> -p.getPrix_produit())));	
    }
    
    
    
    @FXML
    private void arbreAction(ActionEvent event) {
         ObservableList<Produit> tmp = FXCollections.observableArrayList();
      for (Produit produit : data) {
                    if(produit.getCategorie().getNom_categorie().toLowerCase().contains("arbre".toLowerCase())){
                        tmp.add(produit);

                    }
                }
                
                List.setItems(null);
                tmp.forEach(System.out::println);
                
                //Cellule right Here
               // List.setCellFactory(ProduitListView -> new ProduitCellController());

                count.setText(String.valueOf(tmp.stream().count()));
                List.refresh();
                                List.setItems(tmp);
                                                List.refresh();


    }

    @FXML
    private void fleurAction(ActionEvent event) {
          ObservableList<Produit> tmp = FXCollections.observableArrayList();
      for (Produit produit : data) {
                    if(produit.getCategorie().getNom_categorie().toLowerCase().contains("fleur".toLowerCase())){
                        tmp.add(produit);

                    }
                }
                
                List.setItems(null);
                tmp.forEach(System.out::println);
                
                //Cellule right Here
               // List.setCellFactory(ProduitListView -> new ProduitCellController());

                count.setText(String.valueOf(tmp.stream().count()));
                List.refresh();
                                List.setItems(tmp);
                                                List.refresh();


    }

    @FXML
    private void planteAction(ActionEvent event) {
          ObservableList<Produit> tmp = FXCollections.observableArrayList();
      for (Produit produit : data) {
                    if(produit.getCategorie().getNom_categorie().toLowerCase().contains("plante".toLowerCase())){
                        tmp.add(produit);

                    }
                }
                
                List.setItems(null);
                tmp.forEach(System.out::println);
                
                //Cellule right Here
               // List.setCellFactory(ProduitListView -> new ProduitCellController());

                count.setText(String.valueOf(tmp.stream().count()));
                List.refresh();
                                List.setItems(tmp);
                                                List.refresh();


        
    }

    @FXML
    private void tousAction(ActionEvent event) {
        
                List.refresh();
                                List.setItems(data);
                                                List.refresh();


    }

    static Stage stg;
    @FXML
    private void goAdmin(ActionEvent event) throws IOException {
        
            FXMLLoader detail = new FXMLLoader(getClass().getResource("/com/pepiniere/gui/AdminPanel.fxml"));
            Parent root2 = (Parent) detail.load();
            Stage stage1 = new Stage();
            stage1.setScene(new Scene(root2));
            stage1.show();
    }

    
    
    

    
}
