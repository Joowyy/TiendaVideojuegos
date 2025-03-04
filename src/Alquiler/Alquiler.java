package Alquiler;

import java.util.ArrayList;

import Usuario.Cliente;

public class Alquiler {

//	=========================== ATRIBUTOS ===========================
	private String codAlquiler;
	private Cliente cliente;
	private double precioAlquiler;
	private ArrayList<Videojuego> videojuegos = new ArrayList<Videojuego>();
	
//	=========================== CONSTRUCTORES ===========================
	public Alquiler () {
		
	}
	public Alquiler (String codAlquiler, Cliente cliente, double precioAlquiler, ArrayList<Videojuego> videojuegos) {
		this.codAlquiler = codAlquiler;
		this.cliente = cliente;
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
	
	public Cliente getcliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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

			System.out.println("Codigo alquiler -> " + codAlquiler);
			System.out.println("Precio alquiler -> " + precioAlquiler);
			System.out.println("Cliente alquiler -> " + cliente);
			System.out.println("Juegos en alquiler -> " + videojuegos);

	}
	
	@Override
	public String toString () {
		
		return "Alq-" + codAlquiler;
		
	}

}
