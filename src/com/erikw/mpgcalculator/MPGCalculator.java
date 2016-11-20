/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erikw.mpgcalculator;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Erik.Walker
 */


public class MPGCalculator extends Application 
{
   @Override
   public void start(Stage stage) throws Exception 
   {
      Parent root = 
         FXMLLoader.load(getClass().getResource("MPGCalculator.fxml"));

      Scene scene = new Scene(root); // attach scene graph to scene
      stage.setTitle("MPG Calculator"); // displayed in window's title bar
      stage.setScene(scene); // attach scene to stage
      stage.show(); // display the stage
   }

   public static void main(String[] args) 
   {
      // create a MPGCalculator object and call its start method
      launch(args); 
   }
}
