/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pepiniere.services;

/**
 *
 * @author AMZA
 */
import com.pepiniere.entities.Produit;
import com.pepiniere.entities.Categorie;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class StatistiqueProduitService extends Application
{
    public static void main(String[] args) 
    {
        Application.launch(args);
    }
     
    @Override
    public void start(Stage stage) 
    {/*
        // Create the X-Axis
        categorie p = new categorie();
        p.getNom_categorie() xAxis = new p.getNom_categorie();
        // Set the Label for the Axis
        xAxis.setLabel("Categorie");
        // Add the Categories to the Axis
        xAxis.getCategories().addAll("Fleur", "Arbre", "Plante");
        
        // Create the Y-Axis
        NumberAxis yAxis = new NumberAxis();
        // Set the Label for the Axis
        yAxis.setLabel("Vendu");
        
        // Create the Chart
        StackedBarChart<String, Number> chart = new StackedBarChart<>(xAxis, yAxis);
        // Set the Title for the Chart
        chart.setTitle("Statistique de Vente");
        // Set the data for the chart
        ObservableList<XYChart.Series<String, Number>> chartData = FxChartUtil.getYearSeries();
        chart.setData(chartData);
        
        // Create the Stackpane
        StackPane root = new StackPane(chart);
        // Set the Style-properties of the Pane
        root.setStyle("-fx-padding: 10;" +
        "-fx-border-style: solid inside;" +
        "-fx-border-width: 2;" +
        "-fx-border-insets: 5;" +
        "-fx-border-radius: 5;" +
        "-fx-border-color: blue;");
        
        // Create the Scene
        Scene scene = new Scene(root);
        // Add the Stylesheet to the Scene
        scene.getStylesheets().add(getClass().getResource("stackbarchart.css").toExternalForm());
        // Add the Scene to the Stage
        stage.setScene(scene);
        // Set the Title of the Stage
        stage.setTitle("A Vertical Stacked Bar Chart Example");
        // Display the Stage
        stage.show();
        }*/
}
}