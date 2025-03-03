package Contabilidad;

import java.util.ArrayList;

import Alquiler.Alquiler;

public class Tienda {

//	=========================== ATRIBUTOS ===========================
	private String nombreTienda;
	private ArrayList<Alquiler> alquileres = new ArrayList<Alquiler>();
	
//	=========================== CONSTRUCTORES ===========================
	public Tienda () {
		
	}
	public Tienda (String nombreTienda, ArrayList<Alquiler> alquileres) {
		this.nombreTienda = nombreTienda;
		this.alquileres = alquileres;
	}
	
//	=========================== GETTERS & SETTERS ===========================
	public String getNombreTienda() {
		return nombreTienda;
	}
	public void setNombreTienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}
	
	public ArrayList<Alquiler> getAlquileres() {
		return alquileres;
	}
	public void setAlquileres(ArrayList<Alquiler> alquileres) {
		this.alquileres = alquileres;
	}
	
//	=========================== METODOS ===========================
	public boolean añadirAlquiler () {
		
		return true;
	}
	
	public Tienda crearTienda () {
		Tienda tiendaCreada = new Tienda();
		
		return tiendaCreada;
	}
	
}
