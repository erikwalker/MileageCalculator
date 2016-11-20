/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erikw.mpgcalculator;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 *
 * @author Erik.Walker
 */

public class MPGCalculatorController 
{
   // GUI controls defined in FXML and used by the controller's code
   @FXML 
   private TextField milesTextField; 

   @FXML
   private TextField gallonsTextField;

   @FXML
   private TextField mpgTextField;

   // calculates and displays the tip and total amounts
   @FXML
   private void calculateButtonPressed(ActionEvent event) 
   {
      double miles = Double.parseDouble(milesTextField.getText());
      double gallons = Double.parseDouble(gallonsTextField.getText());

      mpgTextField.setText(String.format("%.2f", miles / gallons));
   }

   // called by FXMLLoader to initialize the controller
   public void initialize() 
   {
       
   }
}