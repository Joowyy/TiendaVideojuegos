package Alquiler;

import java.util.ArrayList;

import Usuario.Cliente;

public class Alquiler {

//	=========================== ATRIBUTOS ===========================
	private String codAlquiler;
	private Cliente cliente;
	private double precioAlquiler;
	private Videojuego videojuego;
	
//	=========================== CONSTRUCTORES ===========================
	public Alquiler () {
		
	}
	public Alquiler (String codAlquiler, Cliente cliente, double precioAlquiler, Videojuego videojuego) {
		this.codAlquiler = codAlquiler;
		this.cliente = cliente;
		this.precioAlquiler = precioAlquiler;
		this.videojuego = videojuego;
	}
	
//	=========================== GETTERS & SETTERS ===========================
	public String getCodAlquiler() {
		return codAlquiler;
	}
	public void setCodAlquiler(String codAlquiler) {
		this.codAlquiler = codAlquiler;
	}
	
	public Cliente getCliente() {
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
	
	public Videojuego getVideojuego() {
		return videojuego;
	}
	public void setVideojuegos(Videojuego videojuego) {
		this.videojuego = videojuego;
	}
	
//	=========================== METODOS ===========================
	public void mostrarAlquiler () {

			System.out.println("\nCodigo alquiler -> " + codAlquiler);
			System.out.println("Precio alquiler -> " + precioAlquiler);
			System.out.println("Cliente alquiler -> " + cliente);
			System.out.println("Juego en alquiler -> " + videojuego + "\n");

	}
	
	@Override
	public String toString () {
		
		return "Alq-" + codAlquiler;
		
	}

}
