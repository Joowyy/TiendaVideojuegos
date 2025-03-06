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

		char opc;

		do {
			
			System.out.println("BIENVENIDO A JOWY's\n1. Mostrar tienda\n2. Añadir alquiler\n3. Ingresar saldo\n4. Retirar saldo\n5. Aplicar descuentos\n6. Ver cliente\n7. Ver videojuegos\n8. Ver alquileres");
			
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
				
				System.out.println("¿De cuanto será el descuento?");
				int porcentaje = sc.nextInt();
				
				if (porcentaje <= 0 || porcentaje >= 100) {
					
					System.out.println("Introduce un porcentaje válido bolo.");
					
				}
				
				tiendaJowy.aplicarDescuentoVIP(porcentaje);
				break;
				
			case '6':
				
				Cliente clienteSeleccionado5 = elegirCliente();
				break;
				
			case '7':
				
				Videojuego videojuegoSeleccionado6 = elegirVideojuego();
				break;
				
			case '8':
				
				tiendaJowy.mostrarTodoAlquileres();
				break;
				
			default:
				
				System.out.println("Introduce un caracter válido.\n");
				
			}
			
		} while (opc != 7);
		
	}
	
	public static Cliente elegirCliente () {
		
		ArrayList<Cliente> clientes = GestionCliente.getClientes();
		Scanner sc = new Scanner (System.in);
		
		for (Cliente c1 : clientes) {

				c1.mostrarCliente();
			
		}
//		
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
	
	public static Videojuego elegirVideojuego () {
		
		ArrayList<Videojuego> videojuegos = GestionVideojuego.getVideojuegos();
		Scanner sc = new Scanner (System.in);
		
		for (Videojuego j1 : videojuegos) {

				j1.mostrarVideojuego();
			
		}
		
		//System.out.println("Dime el codigo del juego: ");
		//String codUsuario = sc.nextLine();
		
//		for (Videojuego j2 : videojuegos) {
//			
//			if (j2.getCodJuego().equalsIgnoreCase(codUsuario)) {
//				
//				j2.mostrarVideojuego();
//				return j2;
//				
//			}
//			
//		}
		
		return null;
	}

}
