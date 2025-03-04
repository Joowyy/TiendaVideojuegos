package Contabilidad;

import java.util.ArrayList;

import Alquiler.Alquiler;
import Alquiler.Videojuego;
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
		this.alquileres = alquileres;
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
		this.alquileres = alquileres;
	}
	
//	=========================== METODOS ===========================
	public boolean añadirAlquiler () {
		
		return true;
	}
	
	public void mostrarTienda () {
		
		System.out.println("\nNombre -> " + nombreTienda);
		System.out.println("Alquileres -> " + alquileres + "\n");
		
	}
	
	public static Tienda crearTienda () {
		
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		ArrayList<Videojuego> videojuegos = new ArrayList<Videojuego>();
		
//		CREAMOS LOS CLIENTES
		clientes.add(new Normal("4583KRN", "Francisco", 0.0, "francisco3242@example.com"));
		clientes.add(new Normal("2957KEQ", "Maria", 0.0, "mariasanchez5@example.com"));
		clientes.add(new Normal("0658RNY", "Juan", 0.0, "juandedios777@example.com"));
		clientes.add(new Normal("3984VCM", "Manolo", 0.0, "manolindiorese@example.com"));
		clientes.add(new Normal("0012LLQ", "Julia", 0.0, "julialachulaychunga@example.com"));
		clientes.add(new Normal("7829MMD", "Montoya", 0.0, "montoyabrilla@example.com"));
		clientes.add(new Normal("2264FEA", "William", 0.0, "williambarbosa@example.com"));
		clientes.add(new VIP("4932DKW", "Candela", 0.0, "VIP2025"));
		clientes.add(new VIP("8475MTN", "Daniel", 0.0, "10% en alquileres"));
		clientes.add(new VIP("9284LFE", "¿alguien?", 0.0, "VIPGOLD-2024"));
		
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
				alquileres.add(new Alquiler(String.valueOf(k), clientes.get(k), 29.99, videojuegos));
			}
			if (k == 1) {
				alquileres.add(new Alquiler(String.valueOf(k), clientes.get(k), 7.99, videojuegos));
			}
			if (k == 2) {
				alquileres.add(new Alquiler(String.valueOf(k), clientes.get(k), 9.26, videojuegos));
			}
			if (k == 3) {
				alquileres.add(new Alquiler(String.valueOf(k), clientes.get(k), 17.2, videojuegos));
			}
			if (k == 4) {
				alquileres.add(new Alquiler(String.valueOf(k), clientes.get(k), 52.99, videojuegos));
			}
			if (k == 5) {
				alquileres.add(new Alquiler(String.valueOf(k), clientes.get(k), 4.12, videojuegos));
			}
			if (k == 6) {
				alquileres.add(new Alquiler(String.valueOf(k), clientes.get(k), 12.67, videojuegos));
			}
			if (k == 7) {
				alquileres.add(new Alquiler(String.valueOf(k), clientes.get(k), 9.99, videojuegos));
			}
			if (k == 8) {
				alquileres.add(new Alquiler(String.valueOf(k), clientes.get(k), 31.19, videojuegos));
			}
			if (k == 9) {
				alquileres.add(new Alquiler(String.valueOf(k), clientes.get(k), 18.23, videojuegos));
			}
		}

//		CREAMOS LA TIENDA
		Tienda tiendaCreada = new Tienda("Jowy's RuneShop", alquileres);
		
		return tiendaCreada;
	}
	
}
