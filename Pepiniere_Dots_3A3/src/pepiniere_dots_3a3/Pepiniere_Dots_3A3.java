/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pepiniere_dots_3a3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author AMZA
 */
public class Pepiniere_Dots_3A3 extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

/*<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.geometry.*?>
<?import javafx.scene.image.*?>
<?import javafx.scene.text.*?>
<?import java.lang.*?>
<?import java.util.*?>
<?import javafx.scene.*?>
<?import javafx.scene.control.*?>
<?import javafx.scene.layout.*?>


<AnchorPane id="AnchorPane" prefHeight="610.0" prefWidth="1057.0" xmlns:fx="http://javafx.com/fxml/1" xmlns="http://javafx.com/javafx/8" fx:controller="com.pepiniere.controllers.ProduitListGuiController">
<children>
<Button fx:id="addF" layoutX="323.0" layoutY="527.0" mnemonicParsing="false" onAction="#ShowAddF" prefHeight="25.0" prefWidth="194.0" style="-fx-background-color: Green;" text="Add Feedback" textFill="WHITE" />
<Text layoutX="761.0" layoutY="547.0" strokeType="OUTSIDE" strokeWidth="0.0" text="Total Produit :" />
<Text fx:id="count" layoutX="875.0" layoutY="547.0" strokeType="OUTSIDE" strokeWidth="0.0" text="Count" />
<Text layoutX="729.0" layoutY="99.0" strokeType="OUTSIDE" strokeWidth="0.0" text="Recherche un Produit" />
<TextField fx:id="rechercheF" layoutX="729.0" layoutY="110.0" prefHeight="25.0" prefWidth="244.0" />
<ListView fx:id="List" layoutX="323.0" layoutY="167.0" prefHeight="348.0" prefWidth="777.0" />
<VBox alignment="TOP_CENTER" layoutX="-2.0" prefHeight="610.0" prefWidth="283.0" style="-fx-background-color: #05071F;">
<children>
<ImageView fx:id="Profile_pic" fitHeight="73.0" fitWidth="67.0" pickOnBounds="true" preserveRatio="true">
<image>
<Image url="@../../../../../SmartStart-master/src/images/jimmy-fallon.png" />
</image>
<VBox.margin>
<Insets bottom="10.0" top="50.0" />
</VBox.margin>
</ImageView>
<Label fx:id="username" text="User" textFill="#e7e5e5">
<VBox.margin>
<Insets bottom="20.0" />
</VBox.margin>
</Label>
<Button alignment="BASELINE_LEFT" graphicTextGap="22.0" mnemonicParsing="false" prefHeight="42.0" prefWidth="259.0" stylesheets="@./style.css" text="Overview" textFill="#e7e5e5">
<graphic>
<ImageView fx:id="pic1" fitHeight="23.0" fitWidth="27.0" pickOnBounds="true" preserveRatio="true">
<image>
<Image url="@../../../../../SmartStart-master/src/images/icons8_Home_32px.png" />
</image>
</ImageView>
</graphic>
<opaqueInsets>
<Insets />
</opaqueInsets>
<padding>
<Insets left="50.0" />
</padding>
<VBox.margin>
<Insets />
</VBox.margin>
</Button>
<Button alignment="BASELINE_LEFT" graphicTextGap="22.0" mnemonicParsing="false" prefHeight="42.0" prefWidth="259.0" stylesheets="@./style.css" text="Orders">
<graphic>
<ImageView fitHeight="23.0" fitWidth="27.0" pickOnBounds="true" preserveRatio="true">
<image>
<Image url="@../../../../../SmartStart-master/src/images/icons8_Person_32px.png" />
</image>
</ImageView>
</graphic>
<padding>
<Insets left="50.0" />
</padding>
</Button>
<Button alignment="BASELINE_LEFT" graphicTextGap="22.0" mnemonicParsing="false" prefHeight="42.0" prefWidth="259.0" stylesheets="@./style.css" text="Customers">
<graphic>
<ImageView fitHeight="23.0" fitWidth="27.0" pickOnBounds="true" preserveRatio="true">
<image>
<Image url="@../../../../../SmartStart-master/src/images/icons8_Open_Envelope_32px.png" />
</image>
</ImageView>
</graphic>
<padding>
<Insets left="50.0" />
</padding>
</Button>
<Button alignment="BASELINE_LEFT" graphicTextGap="22.0" mnemonicParsing="false" prefHeight="42.0" prefWidth="259.0" stylesheets="@./style.css" text="Menus">
<graphic>
<ImageView fitHeight="23.0" fitWidth="27.0" pickOnBounds="true" preserveRatio="true">
<image>
<Image url="@../../../../../SmartStart-master/src/images/icons8_Box_32px.png" />
</image>
</ImageView>
</graphic>
<padding>
<Insets left="50.0" />
</padding>
</Button>
<Button alignment="BASELINE_LEFT" graphicTextGap="22.0" mnemonicParsing="false" prefHeight="42.0" prefWidth="259.0" stylesheets="@./style.css" text="Packages">
<graphic>
<ImageView fitHeight="23.0" fitWidth="27.0" pickOnBounds="true" preserveRatio="true">
<image>
<Image url="@../../../../../SmartStart-master/src/images/icons8_Xbox_Menu_32px.png" />
</image>
</ImageView>
</graphic>
<padding>
<Insets left="50.0" />
</padding>
</Button>
<Button alignment="BASELINE_LEFT" graphicTextGap="22.0" mnemonicParsing="false" prefHeight="42.0" prefWidth="259.0" stylesheets="@./style.css" text="Settings">
<graphic>
<ImageView fitHeight="23.0" fitWidth="27.0" pickOnBounds="true" preserveRatio="true">
<image>
<Image url="@../../../../../SmartStart-master/src/images/icons8_Slider__32px.png" />
</image>
</ImageView>
</graphic>
<padding>
<Insets left="50.0" />
</padding>
</Button>
<Button alignment="BASELINE_LEFT" graphicTextGap="22.0" mnemonicParsing="false" prefHeight="42.0" prefWidth="259.0" stylesheets="@./style.css" text="Sign Out">
<graphic>
<ImageView fitHeight="23.0" fitWidth="27.0" pickOnBounds="true" preserveRatio="true">
<image>
<Image url="@../../../../../SmartStart-master/src/images/icons8_Sign_Out_32px.png" />
</image>
</ImageView>
</graphic>
<padding>
<Insets left="50.0" />
</padding>
</Button>
</children>
</VBox>
</children>
</AnchorPane>*/

