package Pedidos2ev.Version1;

public class Producto {

	// Atributos
	String nombre;
	double precio;
	int cantidad;
	String prod;

	public Producto() {
	}

	// Constructor
	/**
	 * Hacemos el constructor
	 * 
	 * @param nombre
	 * @param precio
	 * @param cantidad
	 */
	public Producto(String nombre, double precio, int cantidad) {
		this.nombre = nombre.toUpperCase();
		this.precio = precio;
		this.cantidad = cantidad;
	}

	// Métodos Getters and Setters
	/**
	 * 
	 * @return
	 */
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

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getProd() {
		return prod;
	}

	public void setProd(String prod) {
		this.prod = prod;
	}

}
