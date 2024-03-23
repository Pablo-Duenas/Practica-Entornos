package Supermercado;

import java.util.ArrayList;

public class Tienda {

	private String nombre;
	private ArrayList<Producto> productos;

	public Tienda(String nombre) {
		this.nombre = nombre;
		this.productos = new ArrayList<Producto>();
	}
	public void agregarProducto(Producto producto) {
		productos.add(producto);
		System.out.println("Se ha añadido el producto a la tienda");
	}
	
	public void eliminarProducto(Producto producto) {
		productos.remove(producto);
		System.out.println("Este producto se ha eliminado de la tienda");
	}
	

	public String getNombre() {
		return nombre;
	}

}
