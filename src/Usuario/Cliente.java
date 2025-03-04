package Usuario;

public abstract class Cliente {

//	=========================== ATRIBUTOS ===========================
	private String DNI;
	private String nombre;
	private double saldoCuenta;
	
//	=========================== CONSTRUCTORES ===========================
	public Cliente () {
		
	}
	public Cliente (String DNI, String nombre, double saldoCuenta) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.saldoCuenta = saldoCuenta;
	}
	
//	=========================== GETTERS & SETTERS ===========================
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getSaldoCuenta() {
		return saldoCuenta;
	}
	public void setSaldoCuenta(double saldoCuenta) {
		this.saldoCuenta = saldoCuenta;
	}
	
//	=========================== METODOS ===========================
	public void disminuirSaldoCuenta() {
		
		
		
	}
	
	public void incrementarSaldoCuenta() {
		
	}
	
	public abstract void mostrarCliente();
	
}
