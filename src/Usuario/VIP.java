package Usuario;

public class VIP extends Cliente {

//	=========================== ATRIBUTOS ===========================
	private String promociones;
	
//	=========================== CONSTRUCTORES ===========================
	public VIP () {
		
	}
	public VIP (String DNI, String nombre, double saldoCuenta, String promociones) {
		super(DNI, nombre, saldoCuenta);
		this.promociones = promociones;
	}
//	=========================== GETTERS & SETTERS ===========================
	public String getPromociones() {
		return promociones;
	}

	public void setPromociones(String promociones) {
		this.promociones = promociones;
	}
	
//	=========================== METODOS ===========================
	@Override
	public void mostrarCliente () {
		
		System.out.println("\nDNI -> " + DNI);
		System.out.println("Nombre -> " + nombre);
		System.out.println("Saldo -> " + saldoCuenta);
		System.out.println("Promocion -> " + promociones + "\n");
		
	}
	
	@Override
	public String toString () {
		
		return nombre;
		
	}
	
}
