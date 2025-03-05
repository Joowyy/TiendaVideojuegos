import java.util.Scanner;

import Alquiler.Alquiler;
import Contabilidad.Tienda;
import Usuario.Cliente;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		Tienda tiendaJowy = Tienda.crearTienda();

		char opc;

		do {
			
			System.out.println("BIENVENIDO A JOWY's\n1. Mostrar tienda\n2. Añadir alquiler\n3. Ingresar saldo\n4. Retirar saldo");
			
			switch (opc = sc.nextLine().charAt(0)) {
			
			case '1':
				
				tiendaJowy.mostrarTienda();
				break;
				
			case '2':
				
				tiendaJowy.añadirAlquiler();
				break;
				
			case '3':
				
				
				break;
				
			case '4':
				
				break;
				
			case '5':
				
				break;
				
			default:
				
				System.out.println("Introduce un caracter válido.\n");
				
			}
			
		} while (opc != 7);
		
	}
	
	public static Alquiler elegirCliente (Tienda tiendaJowy) {
		
		Scanner sc = new Scanner (System.in);
		
		for (Alquiler a1 : tiendaJowy.getAlquileres()) {
			
			a1.mostrarAlquiler();
			
		}
		
		System.out.println("Dime el nombre de cliente que deseas ver");
		String nombreCliente = sc.nextLine();
		
		for (Alquiler a2 : tiendaJowy.getAlquileres()) {
			
			if (a2.getcliente().equals(nombreCliente)) {
				
				
				
			}
			
		}
		
		return null;
	}

}
