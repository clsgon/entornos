/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectoprueba;

import java.util.ArrayList;

/**
 *
 * @author luis
 */
public class ProyectoPrueba {

    public static void main(String[] args) {
		ArrayList<Camara> lista_camaras=ParseoXML.parsear();
		for (Camara camara : lista_camaras) {
			System.out.println(camara);
		}
	}
}
