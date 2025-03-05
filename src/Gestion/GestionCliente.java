package Gestion;

import java.util.ArrayList;

import Usuario.Cliente;

public class GestionCliente {

	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public static ArrayList<Cliente> getClientes () {
		return clientes;
	}
	
}
