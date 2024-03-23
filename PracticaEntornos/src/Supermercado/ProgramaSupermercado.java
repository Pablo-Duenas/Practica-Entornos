package Supermercado;

import java.util.ArrayList;

/**
 * esta es la clase del supermercado
 * 
 * @author pablo
 * @version 1.0
 * @since 23-03-2024
 */
public class ProgramaSupermercado {

	public static void main(String[] args) {

		/**
		 * Estos son algunos de los objetos de los productos
		 */

		Producto producto1 = new Producto("Agua", 2, true);
		Producto producto2 = new Producto("pan", 0.65, true);
		Producto producto3 = new Producto("mandarina", 4, true);

		/**
		 * Este es el objeto de tienda
		 */

		Tienda tienda = new Tienda("supermercado");

		/**
		 * Aqui ponemos en practica el metodo de nuevo agregar un producto
		 */
		tienda.nuevoAgregarProducto(producto1);
		tienda.nuevoAgregarProducto(producto2);
		tienda.nuevoAgregarProducto(producto3);

		/**
		 * Este es el metodo imprimir
		 */
		System.out.println("Los productos que hay ahora en el supermercado son:");
		tienda.imprimir();
		/**
		 * Aqui ponemos en practica el metodo de eliminar un producto
		 */
		tienda.eliminarProducto(producto1);
		/**
		 * Este es el metodo imprimir
		 */
		System.out.println("Los productos que hay ahora en el supermercado son:");
		tienda.imprimir();
	}

}
