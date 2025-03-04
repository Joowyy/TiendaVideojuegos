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
			
			System.out.println("BIENVENIDO A JOWY's\n1. Mostrar tienda\n2.Ver cliente\n3. Ingresar saldo\n4. Retirar saldo");
			
			switch (opc = sc.nextLine().charAt(0)) {
			
			case '1':
				
				tiendaJowy.mostrarTienda();
				break;
				
			case '2':
				
				Alquiler clienteSeleccionado = elegirCliente(tiendaJowy);
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
		
		for (Alquiler a : tiendaJowy.getAlquileres()) {
			
			a.mostrarAlquiler();
			return a;
			
		}
		
		System.out.println("");
		
		return null;
	}

}
