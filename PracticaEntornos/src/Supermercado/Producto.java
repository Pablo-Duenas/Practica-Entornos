package Supermercado;

/**
 * clase de un producto de una tienda
 * 
 * @author pablo
 * @version 1.0
 * @since 23-03-2024
 * 
 */
public class Producto {

	private String nombre;
	private double precio;
	private boolean enStock;

	/**
	 * constructor del producto
	 * 
	 * @param nombre  nombre del producto
	 * @param precio  precio del producto
	 * @param enStock si el producto esta o no en stock
	 */
	public Producto(String nombre, double precio, boolean enStock) {
		this.nombre = nombre;
		this.precio = precio;
		this.enStock = enStock;
	}

	/**
	 * Metodo para saber si esta o no en stock
	 * 
	 * @return devuelve true si el producto esta en stock y false si no lo esta
	 */
	public boolean estaEnStock() {
		if (enStock) {
			System.out.println("Este producto esta en Stock");
			return true;
		} else {
			System.out.println("Este producto no esta en Stock");
			return false;
		}
	}

	/**
	 * Metodo para cambiar el precio del producto
	 * 
	 * @param nuevoPrecio es el valor del nuevo precio del producto
	 * @return devuelve el nuevo precio del producto
	 */
	public double cambiarPrecio(double nuevoPrecio) {
		precio = nuevoPrecio;

		return nuevoPrecio;

	}

	/**
	 * Metodo toString
	 * 
	 * @return devuelve el nombre, precio y si esta o no en stock de un producto
	 */
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", enStock=" + enStock + "]";
	}

	/**
	 * Metodo del nombre
	 * 
	 * @return devuelve el nombre del producto
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo del precio
	 * 
	 * @return devuelve el precio del producto
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Metodo de Stock
	 * 
	 * @return devuelve true o false si esta en stock o no
	 */
	public boolean isEnStock() {
		return enStock;
	}

}
