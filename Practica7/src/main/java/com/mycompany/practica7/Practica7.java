/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica7;

/**
 *
 * @author David-pc
 */
public class Practica7 
{
	public static void main(String[] args)
	{
		Ventana robotGUI = new Ventana();
		
		robotGUI.setLocationRelativeTo(null); //Centrar la ventana
		robotGUI.setResizable(false); //No dejar que se pueda reajustar xD
		robotGUI.setVisible(true);	 //Hacer visible la ventana.
	}
} 

