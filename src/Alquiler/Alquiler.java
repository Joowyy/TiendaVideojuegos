package Alquiler;

import java.util.ArrayList;

import Usuario.Cliente;

public class Alquiler {

//	=========================== ATRIBUTOS ===========================
	private String codAlquiler;
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private double precioAlquiler;
	private ArrayList<Videojuego> videojuegos = new ArrayList<Videojuego>();
	
//	=========================== CONSTRUCTORES ===========================
	public Alquiler () {
		
	}
	public Alquiler (String codAlquiler, ArrayList<Cliente> clientes, double precioAlquiler, ArrayList<Videojuego> videojuegos) {
		this.codAlquiler = codAlquiler;
		this.clientes = clientes;
		this.precioAlquiler = precioAlquiler;
		this.videojuegos = videojuegos;
	}
	
//	=========================== GETTERS & SETTERS ===========================
	public String getCodAlquiler() {
		return codAlquiler;
	}
	public void setCodAlquiler(String codAlquiler) {
		this.codAlquiler = codAlquiler;
	}
	
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public double getPrecioAlquiler() {
		return precioAlquiler;
	}
	public void setPrecioAlquiler(double precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}
	
	public ArrayList<Videojuego> getVideojuegos() {
		return videojuegos;
	}
	public void setVideojuegos(ArrayList<Videojuego> videojuegos) {
		this.videojuegos = videojuegos;
	}
	
//	=========================== METODOS ===========================
	public void mostrarAlquiler () {
		
		for (int i = 0; i < 10; i++) {
			codAlquiler = String.valueOf(i);
			System.out.println("Codigo alquiler -> " + codAlquiler);
			System.out.println("Precio alquiler -> " + precioAlquiler);
			System.out.println("Cliente alquiler -> " + clientes);
			System.out.println("Juegos en alquiler -> " + videojuegos);
		}

	}
	
	@Override
	public String toString () {
		
		return "Codigo alquiler -> " + codAlquiler + "\n\tPrecio alquiler -> " + precioAlquiler + "\n\tCliente alquiler -> " + clientes + "\n\tJuegos en alquiler -> " + videojuegos;
	
	}
	
}
