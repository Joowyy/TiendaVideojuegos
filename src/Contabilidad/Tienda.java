package Contabilidad;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

import Alquiler.Alquiler;
import Alquiler.Videojuego;
import Gestion.GestionCliente;
import Gestion.GestionVideojuego;
import Usuario.Cliente;
import Usuario.Normal;
import Usuario.VIP;

public class Tienda {

	//	=========================== ATRIBUTOS ===========================
	private String nombreTienda;
	private static ArrayList<Alquiler> alquileres = new ArrayList<Alquiler>();

	//	=========================== CONSTRUCTORES ===========================
	public Tienda () {

	}
	public Tienda (String nombreTienda, ArrayList<Alquiler> alquileres) {
		this.nombreTienda = nombreTienda;
		Tienda.alquileres = alquileres;
	}

	//	=========================== GETTERS & SETTERS ===========================
	public String getNombreTienda() {
		return nombreTienda;
	}
	public void setNombreTienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}

	public ArrayList<Alquiler> getAlquileres() {
		return alquileres;
	}
	public void setAlquileres(ArrayList<Alquiler> alquileres) {
		Tienda.alquileres = alquileres;
	}

	//	=========================== METODOS ===========================
	public boolean añadirAlquiler () {

		Scanner sc = new Scanner(System.in);
		ArrayList<Videojuego> videojuegos = GestionVideojuego.getVideojuegos();
		ArrayList<Cliente> clientes = GestionCliente.getClientes();
		boolean alquilerAñadido = false;

		while (alquilerAñadido != true) {

			System.out.println("¿Desea alguilar algún juego? y/n");
			char respuesta = sc.nextLine().charAt(0);

			if (respuesta == 'y') {

				System.out.println("Estos son los videojuegos actualmente en stock -> ");

				for (Videojuego j1 : videojuegos) {

					if (j1.getStock() == true) {

						j1.mostrarVideojuego();

					}

				}

				System.out.println("¿Cuanto costará el alquier?");
				double alquilerCosto = sc.nextDouble();
				sc.nextLine();
				
				if (alquilerCosto <= 0) {
					
					System.out.println("Introduce un alquiler positivo bolo.\n");
					break;
					
				}
				
				System.out.println("Dime el codigo del juego que quieres alquilar -> ");
				String codUsuario = sc.nextLine();

				for (Cliente c1 : clientes) {

					c1.mostrarCliente();

				}

				System.out.println("\nDime el DNI del cliente que va a alquilar el juego");
				String dniUsuario = sc.nextLine();
				Videojuego juegoElegido = null;
				
				for (Videojuego j2 : videojuegos) {
					
					if (j2.getCodJuego().equals(codUsuario)) {

						juegoElegido = j2;
						j2.setStock(false);
						alquilerAñadido = true;
						break;

					}
					
				}
				
				for (Cliente c2 : clientes) {

					if (c2.getDNI().equalsIgnoreCase(dniUsuario)) {

						Alquiler alquilerNuevo = new Alquiler(String.valueOf(alquileres.size() + 1), c2, alquilerCosto, juegoElegido);
						alquileres.add(alquilerNuevo);

					}

				}

			} else if (respuesta == 'n') {

				System.out.println("De acuerdo volvemos atrás.\n");
				break;

			} else {

				System.out.println("Introduce un carácter válido.");

			}

		}

		return alquilerAñadido;

	}
	
	public boolean borrarAlquiler () {
		
		ArrayList<Cliente> clientes = GestionCliente.getClientes();
		boolean alquilerBorrado = false;
		Scanner sc = new Scanner (System.in);
		
		for (Cliente c1 : clientes) {
			
			c1.mostrarCliente();
			
		}
		
		do {

			System.out.println("Estos son los alquileres actuales");
			System.out.println("Dime el DNI del que deseas borrar ->");
			String dniUsuario = sc.nextLine();

			if (dniUsuario.length() != 8) {

				System.out.println("Introduce un DNI válido");

			} else {

				System.out.println("Alquiler eliminado correctamente!\n");
				alquileres.removeIf(Cliente -> Cliente.getCliente().getDNI().equals(dniUsuario));
				alquilerBorrado = true;

			}

		} while (!alquilerBorrado);
		
		return true;
	}
	
	public void aplicarDescuentoVIP (double porcentaje) {

		DecimalFormat df = new DecimalFormat ("#.##");
		ArrayList<Cliente> clientes = GestionCliente.getClientes();
		double nuevoPrecio = 0.0;
		Scanner sc = new Scanner (System.in);

		for (Cliente c1 : clientes) {

//			'tieneAlquiler' es un metodo boolean que devuelve si ese cliente tiene o no alquileres
			if (c1.getClass().getSimpleName().equals("VIP") && tieneAlquiler(c1, alquileres)) {

				c1.mostrarCliente();

			}

		}

		Cliente clienteElegido = null;
		System.out.println("¿A quien deseas aplicar la promocion? Digame el DNI ->");
		String dniUsuario = sc.nextLine();

//		CHECKEO DE ERRORES
		if (dniUsuario.length() != 8) {

			System.out.println("Introduce un DNI válido");
			return;

		}

		for (Cliente c2 : clientes) {
			
			if (c2.getDNI().equalsIgnoreCase(dniUsuario)) {
				
				clienteElegido = c2;
				break;

			}

		}
		
		boolean promoAplicada = false;
		for (Alquiler a1 : alquileres) {
			
//			Tiene un atributo Cliente que permite asignar uno.
			if (a1.getCliente().equals(clienteElegido)) {
				
				a1.setPrecioAlquiler(a1.getPrecioAlquiler() * (1 - (porcentaje / 100.0)));
				nuevoPrecio = a1.getPrecioAlquiler();
				System.out.println("El precio se quedará en -> " + df.format(nuevoPrecio) + "\n");
				promoAplicada = true;
				break;
				
			}
			
		}
		
		if (!promoAplicada) {
			
			System.out.println("El cliente no tiene alquileres\n");
			
		}

	}

//	Metodo para ver quien tiene algun alquiler
	public boolean tieneAlquiler(Cliente cliente, ArrayList<Alquiler> alquileres) {
	    
		for (Alquiler a : alquileres) {
	        
			if (a.getCliente().equals(cliente)) {
	        	
	        	return true;
	        
	        }
	    
		}
	    
		return false;
	}
	
	public void mostrarTienda () {

		System.out.println("\nNombre -> " + nombreTienda);
		System.out.println("Alquileres -> " + alquileres + "\n");

	}

	public void mostrarTodoAlquileres () {

		for (Alquiler a1 : alquileres) {

			a1.mostrarAlquiler();

		}

	}
	
	public void mostrarAlquilerCliente () {
		
		ArrayList<Cliente> clientes = GestionCliente.getClientes();
		Scanner sc = new Scanner (System.in);
		Cliente clienteElegido = null;
		
		for (Cliente c1 : clientes) {
			
			c1.mostrarCliente();

		}
		
		System.out.println("Dime el DNI del cliente a mostrar ->");
		String dniCliente = sc.nextLine();
		
		for (Cliente c2 : clientes) {
			
			if (c2.getDNI().equalsIgnoreCase(dniCliente)) {
				
				clienteElegido = c2;
				
			}

		}
		
		if (dniCliente.length() != 8) {
			
			System.out.println("Introduce un DNI válido bolo.");
			
		} else {
			
			for (Alquiler a1 : alquileres) {
				
				if (a1.getCliente().getDNI().equalsIgnoreCase(dniCliente)) {
				
					a1.mostrarAlquiler();
				
				}
				
			}
			
			if (!alquileres.contains(clienteElegido)) {
				
				System.out.println("El cliente no tiene nada alquilado.");
				
			}
			
			if (!clienteElegido.equals(dniCliente)) {
				
				System.out.println("Introduce un DNI válido bolo!\n");
				
			}
			
		}
		
	}

	public static Tienda crearTienda () {

		ArrayList<Cliente> clientes = GestionCliente.getClientes();
		ArrayList<Videojuego> videojuegos = GestionVideojuego.getVideojuegos();

//		CREAMOS LOS CLIENTES
		clientes.add(new Normal("3489348O", "Francisco", 0.0, "francisco3242@example.com"));
		clientes.add(new Normal("2394394H", "Maria", 0.0, "mariasanchez5@example.com"));
		clientes.add(new Normal("9348289W", "Juan", 0.0, "juandedios777@example.com"));
		clientes.add(new Normal("7492859E", "Manolo", 0.0, "manolindiorese@example.com"));
		clientes.add(new Normal("9280354H", "Julia", 0.0, "julialachulaychunga@example.com"));
		clientes.add(new Normal("0039583T", "Montoya", 0.0, "montoyabrilla@example.com"));
		clientes.add(new Normal("3848929E", "William", 0.0, "williambarbosa@example.com"));
		clientes.add(new Normal("2895895M", "Paco", 0.0, "julialachulaychunga@example.com"));
		clientes.add(new Normal("2848938W", "Javier", 0.0, "javiervelazquez@example.com"));
		clientes.add(new Normal("5748589Y", "Kirian", 0.0, "kiriangomez@example.com"));
		clientes.add(new VIP("9378452D", "Candela", 0.0, "VIP2025"));
		clientes.add(new VIP("6756757R", "Daniel", 0.0, "10% en alquileres"));
		clientes.add(new VIP("7777777V", "¿alguien?", 0.0, "VIPGOLD-2024"));
		clientes.add(new VIP("4857385E", "Mario", 0.0, "10% en alquileres"));
		clientes.add(new VIP("9378573J", "Miguel", 0.0, "VIPGOLD-2024"));

//		CREAMOS LOS VIDEJUEGOS
		for (int j = 0; j < 15; j++) {
			if (j == 0) {
				videojuegos.add(new Videojuego(String.valueOf(j), "The Legend of Zelda", false));
			} else if (j == 1) {
				videojuegos.add(new Videojuego(String.valueOf(j), "Super Mario Bros", false));
			} else if (j == 2) {
				videojuegos.add(new Videojuego(String.valueOf(j), "Halo Infinite", false));
			} else if (j == 3) {
				videojuegos.add(new Videojuego(String.valueOf(j), "Cyberpunk 2077", false));
			} else if (j == 4) {
				videojuegos.add(new Videojuego(String.valueOf(j), "Minecraft", false));
			} else if (j == 5) {
				videojuegos.add(new Videojuego(String.valueOf(j), "Elden Ring", false));
			} else if (j == 6) {
				videojuegos.add(new Videojuego(String.valueOf(j), "Resident Evil 4", false));
			} else if (j == 7) {
				videojuegos.add(new Videojuego(String.valueOf(j), "GTA V", false));
			} else if (j == 8) {
				videojuegos.add(new Videojuego(String.valueOf(j), "Red Dead Redemption 2", false));
			} else if (j == 9) {
				videojuegos.add(new Videojuego(String.valueOf(j), "The Witcher 3", false));
			} else if (j == 10) {
				videojuegos.add(new Videojuego(String.valueOf(j), "Dark Souls 3", true));
			} else if (j == 11) {
				videojuegos.add(new Videojuego(String.valueOf(j), "Final Fantasy VII Remake", true));
			} else if (j == 12) {
				videojuegos.add(new Videojuego(String.valueOf(j), "Assassin's Creed Valhalla", true));
			} else if (j == 13) {
				videojuegos.add(new Videojuego(String.valueOf(j), "Horizon Zero Dawn", true));
			} else if (j == 14) {
				videojuegos.add(new Videojuego(String.valueOf(j), "God of War", true));
			}
		}

		//		CREAMOS LOS ALQUILERES
		for (int k = 0; k < 10; k++) {
			if (k == 0) {
				alquileres.add(new Alquiler(String.valueOf(k), clientes.get(k), 29.99, videojuegos.get(k)));
			}
			if (k == 1) {
				alquileres.add(new Alquiler(String.valueOf(k), clientes.get(k), 7.99, videojuegos.get(k)));
			}
			if (k == 2) {
				alquileres.add(new Alquiler(String.valueOf(k), clientes.get(k), 9.26, videojuegos.get(k)));
			}
			if (k == 3) {
				alquileres.add(new Alquiler(String.valueOf(k), clientes.get(k), 17.2, videojuegos.get(k)));
			}
			if (k == 4) {
				alquileres.add(new Alquiler(String.valueOf(k), clientes.get(k), 52.99, videojuegos.get(k)));
			}
			if (k == 5) {
				alquileres.add(new Alquiler(String.valueOf(k), clientes.get(k), 4.12, videojuegos.get(k)));
			}
			if (k == 6) {
				alquileres.add(new Alquiler(String.valueOf(k), clientes.get(k), 12.67, videojuegos.get(k)));
			}
			if (k == 7) {
				alquileres.add(new Alquiler(String.valueOf(k), clientes.get(k + 1), 9.99, videojuegos.get(k)));
			}
			if (k == 8) {
				alquileres.add(new Alquiler(String.valueOf(k), clientes.get(k + 1), 31.19, videojuegos.get(k)));
			}
			if (k == 9) {
				alquileres.add(new Alquiler(String.valueOf(k), clientes.get(k + 3), 18.23, videojuegos.get(k)));
			}
		}

//		CREAMOS LA TIENDA
		Tienda tiendaCreada = new Tienda("Jowy's RuneShop", alquileres);

		return tiendaCreada;
	}

}
