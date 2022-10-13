/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pruebadepuracion;

/**
 *
 * @author luis
 */
public class PruebaDepuracion {

    public static void main(String[] args) {
        int a=9;
        int b=8;
        int c=resultadoOperacionRara(a, b);
                
        System.out.println("Hello World!");
    }
    private static int resultadoOperacionRara(int a, int b) {
        int numero_raro=(int) Math.abs(10*Math.sin(a+b));
        return numero_raro;
    }
}
