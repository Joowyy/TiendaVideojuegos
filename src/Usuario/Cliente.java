package Usuario;

import java.util.Scanner;

public abstract class Cliente {

//	=========================== ATRIBUTOS ===========================
	private Scanner sc = new Scanner (System.in);
	protected String DNI;
	protected String nombre;
	protected double saldoCuenta;
	
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
    public boolean disminuirSaldoCuenta() {
        boolean pagado = false;

        while (!pagado) {
            System.out.println("¿Cuánto dinero deseas retirar?");
            double saldoUsuario = sc.nextDouble();

            if (saldoUsuario <= 0) {
            	
                System.out.println("No puedes retirar un saldo negativo, bolo!");
                
            } else if (saldoUsuario > this.saldoCuenta) {
            	
                System.out.println("No puedes retirar más de lo que tienes!\n");
                
            } else {
            	
                this.saldoCuenta -= saldoUsuario;
                System.out.println("Dinero retirado correctamente!\n");
                pagado = true; // Salimos del bucle
                
            }
            
        }
        
        return pagado;
    }
	
	public void incrementarSaldoCuenta() {
		
		System.out.println("Cuanto dinero deseas introducir");
		double saldoUsuario = sc.nextDouble();

//		CORRECCION DE ERROR
		if (saldoUsuario <= 0) {

			System.out.println("No puedes agregar un saldo negativo bolo!");

		} else {

			this.saldoCuenta = this.saldoCuenta + saldoUsuario;
			System.out.println("Dinero ingresado correctamente!\n");

		}
		
	}
	
	public abstract void mostrarCliente();
	
}
