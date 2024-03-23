package Supermercado;

public class Producto {

	private String nombre;
	private double precio;
	private boolean enStock;

	public Producto(String nombre, double precio, boolean enStock) {
		this.nombre = nombre;
		this.precio = precio;
		this.enStock = enStock;
	}
	
	public boolean vender() {
		if (enStock) {
			enStock = false;
			System.out.println("Se ha vendido con exito");
			return true;
		}else {
			System.out.println("Ahora mismo no nos queda ese producto");
			return false;
		}	
	}
	public void reponer() {
		enStock = true;
		System.out.println("Se acaba de reponer");
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isEnStock() {
		return enStock;
	}

	public void setEnStock(boolean enStock) {
		this.enStock = enStock;
	}

}
