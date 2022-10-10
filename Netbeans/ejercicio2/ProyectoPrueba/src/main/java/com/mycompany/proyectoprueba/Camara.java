/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoprueba;

/**
 *
 * @author luis
 */
public class Camara {
private double latitud;
private double longitud;
private String url;
public Camara() {
	super();
}
public double getLatitud() {
	return latitud;
}
public void setLatitud(double latitud) {
	this.latitud = latitud;
}
public double getLongitud() {
	return longitud;
}
public void setLongitud(double longitud) {
	this.longitud = longitud;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Latitud:"+latitud+" Longitud:"+longitud+"URL: "+url;
}


}