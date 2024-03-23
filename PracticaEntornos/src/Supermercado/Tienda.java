package Supermercado;

import java.util.ArrayList;

public class Tienda {

	private String nombre;
	private ArrayList<Producto> productos;
	
	public Tienda(String nombre) {
		this.nombre = nombre;
		this.productos = new ArrayList<Producto>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	
	
	
	
}
