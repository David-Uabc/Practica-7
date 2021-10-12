/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica7;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Ventana extends JFrame 
{
	private int altura, anchura;
	ComponentesDeVentana panel1;
	
	public Ventana()
	{
		setTitle("Robot Chef");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tamanioVentana();
		
		panel1 = new ComponentesDeVentana(anchura, altura);
		add(panel1);
	}
	
	private void tamanioVentana()
	{
		Toolkit caracteristicasPantalla = Toolkit.getDefaultToolkit(); 
		Dimension medidasPantalla = caracteristicasPantalla.getScreenSize(); //NOTA: se puede expresar en una línea.
		
		if( (medidasPantalla.width % 2) == 0) //Verificar que las medidas sean número par.
			anchura = medidasPantalla.width;
		
		else anchura = ++medidasPantalla.width;
		
		if( (medidasPantalla.height % 2) == 0)
			altura = medidasPantalla.height;
		
		else altura = ++medidasPantalla.height;
		
		anchura /=2;	
		altura /=2;

		this.setSize(anchura, altura);
	}
}