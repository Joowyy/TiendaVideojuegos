import java.util.ArrayList;
import java.util.Scanner;

import Alquiler.Videojuego;
import Contabilidad.Tienda;
import Gestion.GestionCliente;
import Gestion.GestionVideojuego;
import Usuario.Cliente;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		Tienda tiendaJowy = Tienda.crearTienda();
		ArrayList<Cliente> clientes = GestionCliente.getClientes();
		ArrayList<Videojuego> videojuegos = GestionVideojuego.getVideojuegos();

		char opc;

		do {
			
			System.out.println("BIENVENIDO A JOWY's\n1. Añadir alquiler\n2. Borrar alquiler\n3. Ingresar saldo\n4. Retirar saldo\n5. Aplicar descuentos\n6. Ver cliente\n7. Ver videojuegos\n8. Ver alquileres\n9. Mostrar alquiler de cliente\nX. Salir");
			
			switch (opc = sc.nextLine().charAt(0)) {
			
			case '1':
				
				tiendaJowy.añadirAlquiler();
				break;
				
			case '2':
				
				tiendaJowy.borrarAlquiler();
				break;
				
			case '3':
				
				
				break;
				
			case '4':
				
				
				break;
				
			case '5':
				
				System.out.println("¿De cuanto será el descuento?");
				double porcentaje = sc.nextInt();
				sc.nextLine();
				
				if (porcentaje <= 0 || porcentaje >= 100) {
					
					System.out.println("Introduce un porcentaje válido bolo.\n");
					continue;
					
				}
				
				tiendaJowy.aplicarDescuentoVIP(porcentaje);
				break;
				
			case '6':
				
				for (Cliente c1 : clientes) {
					
					c1.mostrarCliente();
					
				}
				break;
				
			case '7':
				
				for (Videojuego j1 : videojuegos) {
					
					j1.mostrarVideojuego();
					
				}
				
				break;
				
			case '8':
				
				tiendaJowy.mostrarTodoAlquileres();
				break;
				
			case '9':
				
				tiendaJowy.mostrarAlquilerCliente();
				break;
				
			case 'x':
				
				System.out.println("Saliendo del programa...");
				break;
				
			default:
				
				System.out.println("Introduce un caracter válido.\n");
				
			}
			
		} while (opc != 9);
		
	}
	
	public static Cliente elegirCliente () {
		
		ArrayList<Cliente> clientes = GestionCliente.getClientes();
		Scanner sc = new Scanner (System.in);
		
		for (Cliente c1 : clientes) {

				c1.mostrarCliente();
			
		}
		
//		System.out.println("Dime el DNI del cliente: ");
//		String dniCliente = sc.nextLine();
//		
//		for (Cliente c2 : clientes) {
//			
//			if (c2.getDNI().equalsIgnoreCase(dniCliente)) {
//				
//				c2.mostrarCliente();
//				return c2;
//				
//			}
//			
//		}
		
		return null;
	}
	
}
