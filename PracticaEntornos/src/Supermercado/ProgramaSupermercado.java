package Supermercado;

import java.util.ArrayList;

public class ProgramaSupermercado {

	public static void main(String[] args) {
		
		Producto producto1 = new Producto("Agua", 2, true);
		Producto producto2 = new Producto("pan", 0.65, true);
		Producto producto3 = new Producto("mandarina", 4, true);
		
		Tienda tienda = new Tienda("supermercado");
		
		
		
		tienda.nuevoAgregarProducto(producto1);
		tienda.nuevoAgregarProducto(producto2);
		tienda.nuevoAgregarProducto(producto3);
		
		System.out.println("Los productos que hay ahora en el supermercado son:");
		tienda.imprimir();
		
		tienda.eliminarProducto(producto1);
		
		System.out.println("Los productos que hay ahora en el supermercado son:");
		tienda.imprimir();
	}

}
