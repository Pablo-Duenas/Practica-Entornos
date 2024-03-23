package Supermercado;

import java.util.ArrayList;

/**
 * 
 * @author pablo
 * @version 1.0
 * @since 23-03-2024
 */
public class Tienda {

	private String nombre;
	private ArrayList<Producto> productos;

	/**
	 * Constructor de la tienda
	 * 
	 * @param nombre para saber el nombre de la tienda
	 */
	public Tienda(String nombre) {
		this.nombre = nombre;
		this.productos = new ArrayList<Producto>();
	}

	/**
	 * Metodo para agregar un producto
	 * 
	 * @param producto El producto que quieres agregar
	 */
	public void agregarProducto(Producto producto) {
		productos.add(producto);
		System.out.println("Se ha añadido el producto a la tienda");
	}

	/**
	 * Metodo para eliminar un producto
	 * 
	 * @param producto El producto que quieres eliminar
	 */
	public void eliminarProducto(Producto producto) {
		productos.remove(producto);
		System.out.println("Este producto se ha eliminado de la tienda");
	}

	/**
	 * metodo que imprime toda la informacion de los productos que hay en la tienda
	 * 
	 */
	public void imprimir() {
		for (Producto producto : productos) {
			System.out.println(producto.toString());
		}
	}

	/**
	 * Metodo para saber el nombre de la tienda
	 * 
	 * @return El nombre de la tienda
	 */
	public String getNombre() {
		return nombre;
	}

}
