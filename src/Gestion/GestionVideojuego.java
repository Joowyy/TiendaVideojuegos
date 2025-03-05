package Gestion;

import java.util.ArrayList;

import Alquiler.Videojuego;

public class GestionVideojuego {

	private static ArrayList<Videojuego> videojuegos = new ArrayList<Videojuego>();
	
	public static ArrayList<Videojuego> getVideojuegos () {
		return videojuegos;
	}
	
}
