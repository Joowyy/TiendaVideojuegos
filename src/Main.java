import java.util.ArrayList;
import java.util.Scanner;

import Alquiler.Alquiler;
import Contabilidad.Tienda;
import Gestion.GestionCliente;
import Usuario.Cliente;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		Tienda tiendaJowy = Tienda.crearTienda();

		char opc;

		do {
			
			System.out.println("BIENVENIDO A JOWY's\n1. Mostrar tienda\n2. Añadir alquiler\n3. Ingresar saldo\n4. Retirar saldo\n5. Ver cliente");
			
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
				
				Cliente clienteSeleccionado = elegirCliente(tiendaJowy);
				break;
				
			default:
				
				System.out.println("Introduce un caracter válido.\n");
				
			}
			
		} while (opc != 7);
		
	}
	
	public static Cliente elegirCliente (Tienda tiendaJowy) {
		
		ArrayList<Cliente> clientes = GestionCliente.getClientes();
		Scanner sc = new Scanner (System.in);
		
		for (Alquiler a1 : tiendaJowy.getAlquileres()) {
			
			a1.mostrarAlquiler();
			
		}
		
		System.out.println("Dime el nombre de cliente que deseas ver");
		String nombreCliente = sc.nextLine();
		
		for (Cliente c2 : clientes) {
			
			if (c2.getNombre().equals(nombreCliente)) {
				
				c2.mostrarCliente();
				return c2;
				
			}
			
		}
		
		return null;
	}

}
