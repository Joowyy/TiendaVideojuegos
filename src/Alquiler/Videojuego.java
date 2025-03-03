package Alquiler;

public class Videojuego {

//	=========================== ATRIBUTOS ===========================
	private String codJuego;
	private String nombre;
	private boolean stock;
	
//	=========================== CONSTRUCTORES ===========================
	public Videojuego () {
		
	}
	public Videojuego (String codJuego, String nombre, boolean stock) {
		this.codJuego = codJuego;
		this.nombre = nombre;
		this.stock = stock;
	}
	
//	=========================== GETTERS & SETTERS ===========================
	public String getCodJuego() {
		return codJuego;
	}
	public void setCodJuego(String codJuego) {
		this.codJuego = codJuego;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean getStock() {
		return stock;
	}
	public void setStock(boolean stock) {
		this.stock = stock;
	}
	
//	=========================== METODOS ===========================
	public void mostrarVidejuego () {
		
		System.out.println("Codigo juego -> " + codJuego);
		System.out.println("Nombre juego -> " + nombre);
		System.out.println("Stock del juego -> " + stock);
		
	}
	
}
