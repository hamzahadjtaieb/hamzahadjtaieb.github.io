/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pepiniere.controllers;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import com.pepiniere.entities.Produit;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import com.pepiniere.services.GestionProduit;
import com.teknikindustries.bulksms.SMS;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.Chart;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import tray.animations.AnimationType;
import tray.notification.NotificationType;
import tray.notification.TrayNotification;

/**
 * FXML Controller class
 *
 * @author AMZA
 */
public class GestionPrAdminController implements Initializable {

    //Connection cnx = Basededonne.getInstance().getConnection();
    @FXML
    private JFXButton modifier_produit_admin;
    @FXML
    private JFXButton supprimer_produit_admin;
    @FXML
    private JFXButton AjouterProduitAdmin;

    String path = "";

    int idcurrentprod = 0;

    /*public static user current_user;
    CRUD_USER cr = new CRUD_USER();
     */
    @FXML
    private JFXTextField id_recherche;
    @FXML
    private JFXComboBox<?> showentries;

    @FXML
    private TableView<Produit> table;

    @FXML
    private TableColumn<GestionProduit, String> nom;
    @FXML
    private TextField txt_id;

    private ObservableList<Produit> data;
    @FXML
    private Button reload1;
    @FXML
    private TableColumn<GestionProduit, String> id;
    @FXML
    private TableColumn<GestionProduit, String> type;
    //private TableColumn<GestionProduit, String> quantite;
    @FXML
    private TableColumn<GestionProduit, String> photo;
    @FXML
    private AnchorPane content;
    @FXML
    private ScrollBar scroll;
    @FXML
    private TableColumn<?, ?> quantite1;
    @FXML
    private JFXButton statistique_produit_admin;
    @FXML
    private TableColumn<GestionProduit, ?> status;

    private TableColumn<GestionProduit, ?> venduepar;
    @FXML
    private JFXButton admin;
    @FXML
    private TableColumn<GestionProduit, ?> prixcolumn;
    @FXML
    private TableColumn<GestionProduit, ?> quantitecolumn;
    @FXML
    private TableColumn<GestionProduit, ?> vendueparcolumn;

    public static Produit p;
    @FXML
    private JFXButton extraire;

    private static GestionProduitController controller;
    @FXML
    private JFXButton PDF;
    @FXML
    private JFXButton sms;

    // private DrawerContentController drawerContentController ;
    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        /* try {
        reload();
        } catch (SQLException ex) {
        Logger.getLogger(GestionProduitController.class.getName()).log(Level.SEVERE, null, ex);
        }
        initFilter();*/
        txt_id.setVisible(false);
        data = FXCollections.observableArrayList();
        List<Produit> produit = null;
        try {
            produit = GestionProduit.getInstance().getAll(new Produit());
        } catch (SQLException ex) {
            Logger.getLogger(GestionProduitController.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Produit i : produit) {
            data.add(i);
        }

        nom.setCellValueFactory(new PropertyValueFactory<>("nom_produit"));
        id.setCellValueFactory(new PropertyValueFactory<>("id_Produit"));
        prixcolumn.setCellValueFactory(new PropertyValueFactory<>("prix_produit"));
        type.setCellValueFactory(new PropertyValueFactory<>("type_produit"));
        photo.setCellValueFactory(new PropertyValueFactory<>("photo_produit"));
        quantitecolumn.setCellValueFactory(new PropertyValueFactory<>("quantite"));
        vendueparcolumn.setCellValueFactory(new PropertyValueFactory<>("vendu_par"));
        //status.setCellValueFactory(new PropertyValueFactory<> ("status") );

        /* quantite.setCellValueFactory(new PropertyValueFactory<>("quantite"));
        /*adresse.setCellValueFactory(new PropertyValueFactory<>("address")); */
        table.setItems(null);
        table.setItems(data);
        //filter recherche
        //initFilter();
    }

    static GestionProduitController getInstance() {
        return controller;
    }

    public FXMLLoader setMainContent(String path) {
        return setContent(path, content);
    }

    public void clearMainContent() {
        clearContent(content);
    }

    private FXMLLoader setContent(String path, Pane container) {
        try {
            scroll.setValue(0);
            FXMLLoader loader = new FXMLLoader(getClass().getResource(path));
            Pane newLoadedPane = loader.load();
            VBox.setVgrow(scroll, Priority.ALWAYS);
            container.getChildren().clear();
            container.getChildren().add(newLoadedPane);
            newLoadedPane.prefWidthProperty().bind(container.widthProperty());
            newLoadedPane.prefHeightProperty().bind(container.heightProperty());
            return loader;
        } catch (IOException ex) {
            //  util.Logger.writeLog(ex, GlobalViewController.class.getCanonicalName(), null);
        }
        return null;
    }

    private void clearContent(Pane container) {
        container.getChildren().clear();
    }

    //  Application.launch(GestionProduitAdminController.class, args);
    static Stage stg;

    //filter recherche
    private void initFilter() {
    }

    @FXML
    private void ajouter_produit_ad(ActionEvent event) throws IOException {

        try {
            FXMLLoader detail = new FXMLLoader(getClass().getResource("/com/pepiniere/gui/GestionProduit.fxml"));
            Parent root2 = (Parent) detail.load();
            Stage stage1 = new Stage();
            stage1.setScene(new Scene(root2));
            stage1.show();

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }

    @FXML
    private void modifier_produit_button(ActionEvent event) throws SQLException {

        if (table.getSelectionModel().getSelectedItem() == null) {
            alert1("Veuillez saisir le produit a Modifier ");
        } else {
            p = table.getSelectionModel().getSelectedItem();
            if (alert2Confirmation() == true) {

                try {
                    FXMLLoader detail = new FXMLLoader(getClass().getResource("/com/pepiniere/gui/ModifierProduit.fxml"));
                    Parent root2 = (Parent) detail.load();
                    Stage stage1 = new Stage();
                    stage1.setScene(new Scene(root2));
                    stage1.show();

                } catch (IOException e) {
                    System.err.println(e.getMessage());
                }
            } else {
                return;
            }

        }

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
        a1.setTitle("CONFIRMATION DIALOG");
        a1.setHeaderText("SUPPRESSION CONFIRMATION");
        a1.setContentText("Etes vous sur de supprimer ce produit ?");
        Optional<ButtonType> result = a1.showAndWait();
        if (result.get() == ButtonType.OK) {
            return true;
        } else {
            return false;
        }

    }

    //alert2 lel modification
    private boolean alert2Confirmation() {
        Alert a1 = new Alert(Alert.AlertType.CONFIRMATION);
        a1.setTitle("Confirmation Dialog");
        a1.setHeaderText("Modification Confirmation");
        a1.setContentText("Etes vous sur de Modifier ce produit ?");
        Optional<ButtonType> result = a1.showAndWait();
        if (result.get() == ButtonType.OK) {
            return true;
        } else {
            return false;
        }

    }

    @FXML
    private void supprimer_produit_buttom(ActionEvent event) throws SQLException {

        if (table.getSelectionModel().getSelectedItem() == null) {
            alert1("Veuillez saisir le produit a supprimer ");
            return;
        } else {
            if (alert1Confirmation() == true) {
                int idCon = 0;
                ObservableList<Produit> AllCon = table.getItems();
                ObservableList<Produit> SingleCon = table.getSelectionModel().getSelectedItems();
                GestionProduit s = new GestionProduit();
                table.getSelectionModel().getSelectedItem();
                System.out.println("Value is in this row which" + table.getSelectionModel().getSelectedItem().getId_Produit());

                //mochkla houni ya mlaaakks
                s.supprimer_produit_byid(table.getSelectionModel().getSelectedItem().getId_Produit());
                SingleCon.forEach(AllCon::remove);
            } else {
                return;
            }

        }

    }

    @FXML
    private void recherche_avancee(ActionEvent event) throws IOException {
    }

    @FXML
    public void reload(ActionEvent t) throws SQLException {
        Parent tableViewContract;
        try {
            tableViewContract = FXMLLoader.load(getClass().getResource("/com/pepiniere/gui/GestionPrAdmin.fxml"));
            Scene tableViewContractScene = new Scene(tableViewContract);
            Stage window = (Stage) ((Node) t.getSource()).getScene().getWindow();
            window.setScene(tableViewContractScene);
        } catch (IOException ex) {

        }
    }

    private final List<Chart> charts = new ArrayList<>();

    @FXML
    private void updateproductlist(KeyEvent event) {

        table.setItems(data.filtered(t -> {

            return t.getNom_produit().contains(event.getText());// ||  t.getCategorie().getNom_categorie().contains(event.getText());// ||  Float.toString(t.getPrix_produit()).contains(event.getText());

        }));

    }


    @FXML
    private void showAdd(ActionEvent event) throws IOException {

        Parent tableViewOpportunity = FXMLLoader.load(getClass().getResource("/com/pepiniere/gui/FXML.fxml"));
        Scene tableViewOpportunityScene = new Scene(tableViewOpportunity);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(tableViewOpportunityScene);
    }

    @FXML
    private void extrairePDF(ActionEvent event) throws FileNotFoundException, DocumentException, IOException {

        try {
            FXMLLoader detail = new FXMLLoader(getClass().getResource("/com/pepiniere/gui/StatistiquesView.fxml"));
            Parent root2 = (Parent) detail.load();
            Stage stage1 = new Stage();
            stage1.setScene(new Scene(root2));
            stage1.show();

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        /* Produit f = new Produit();
            Document document = new Document();                        
                        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("ComplaintDetailsPDF.pdf"));
                        document.open();
                        
                      
                        document.add(new Paragraph("*******************************DETAILS COMPLAINT*******************************"));
                        
                       Paragraph p11=new Paragraph("*********NOM DU PRODUIT :*********");
                        document.add(p11);
                        Paragraph p1=new Paragraph(f.getNom_produit());
                        document.add(p1);
                        
                        Paragraph p22=new Paragraph("*********TYPE DU PRODUIT:*********");
                        document.add(p22);
                        Paragraph p2=new Paragraph(f.getType_produit());
                        document.add(p2);
                        
                        Paragraph p33=new Paragraph("*********DESCRIPTION DU PRODUIT :*********");
                        document.add(p33);
                        Paragraph p3=new Paragraph(f.getDescription_produit());
                        document.add(p3);
                        
                        Paragraph p44=new Paragraph("*********PRIX DU PRODUIT :*********");
                        document.add(p44);
                        Paragraph p4=new Paragraph(f.getPrix_produit());
                        document.add(p4);
                        
                        Paragraph p55=new Paragraph("********* QUANTITE:*********");
                        document.add(p55);
                        Paragraph p5=new Paragraph(f.getQuantite());
                        document.add(p5);
                        
                        Paragraph p66=new Paragraph("*********VENDU PAR :*********");
                        document.add(p66);
                        Paragraph p6=new Paragraph(f.getVendu_par());
                        document.add(p6);
                        
                     
                        document.close();
    } catch (DocumentException ex) {
    } catch (FileNotFoundException ex) {
    } catch (IOException ex) {
    } */

    }

    @FXML
    private void PDFonaction(ActionEvent event) {

        try {

            Document document = new Document();
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Produitstat.pdf"));
            document.open();
            document.add(new Paragraph("Produits"));
            Paragraph p1 = new Paragraph("hamzaaaaaaaa");

            document.add(p1);

            document.close();
        } catch (DocumentException ex) {
            Logger.getLogger(GestionPrAdminController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestionPrAdminController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GestionPrAdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
        TrayNotification tray = new TrayNotification();
        tray.setTitle("Succès");
        tray.setMessage("La prestation a été exportée en PDF");
        tray.setAnimationType(AnimationType.POPUP);
        tray.setNotificationType(NotificationType.SUCCESS);
        tray.showAndWait();
    }

    @FXML
    private void smsonaction(ActionEvent event) {

        SMS smstut = new SMS();
        smstut.SendSMS("hamzahadjtaieb","fattouma29","ya fraise" , "21650644357", "https://bulksms.vsms.net/eapi/submission/send_sms/2/2.0");
    }

    @FXML
    private void statistique(ActionEvent event) {
        
        
        
    }

}
