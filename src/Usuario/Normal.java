package Usuario;

public class Normal extends Cliente {

//	=========================== ATRIBUTOS ===========================
	private String email;
	
//	=========================== CONSTRUCTORES ===========================
	public Normal () {
		
	}
	public Normal (String DNI, String nombre, double saldoCuenta, String email) {
		super(DNI, nombre, saldoCuenta);
		this.email = email;
	}
	
//	=========================== GETTERS & SETTERS ===========================
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	//	=========================== METODOS ===========================
	@Override
	public void mostrarCliente () {
		
	}
	
	@Override
	public String toString () {
		
		return nombre;
		
	}
	
}
