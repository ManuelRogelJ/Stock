package Pedidos2ev;

import java.util.Date;

public class Cliente {

	// Atributos
	String Nombre;
	String Apellido;
	Date FechaDeAlta;
	int Telefono;
	String Direccion;
	String Historial;
	String prod1;
	String prod2;
	String prod3;
	String prod4;
	String prod5;

	int Cantidad;
	double precio;

	private Object Cliente;

	public Cliente() {
		this.FechaDeAlta = new Date();
	}

	// Constructor
	Cliente(String NombreAux, String ApellidoAux, Date FechaDeAltaAux, int TelefonoAux, String DireccionAux,
			String HistorialAux) {
		this.Nombre = NombreAux;
		this.Apellido = ApellidoAux;
		this.FechaDeAlta = FechaDeAltaAux;
		this.Telefono = TelefonoAux;
		this.Direccion = DireccionAux;
		this.Historial = HistorialAux;

	}

	// Métodos Getters and Setters
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public Date getFechaDeAlta() {
		return FechaDeAlta;
	}

	public void setFechaDeAlta(Date fechaDeAlta) {
		FechaDeAlta = fechaDeAlta;
	}

	public int getTelefono() {
		return Telefono;
	}

	public void setTelefono(int telefono) {
		this.Telefono = telefono;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getHistorial() {
		return Historial;
	}

	public void setHistorial(String historial) {
		Historial = historial;
	}

	public String getProd1() {
		return prod1;
	}

	public void setProd1(String prod1) {
		this.prod1 = prod1;
	}

	public String getProd2() {
		return prod2;
	}

	public void setProd2(String prod2) {
		this.prod2 = prod2;
	}

	public String getProd3() {
		return prod3;
	}

	public void setProd3(String prod3) {
		this.prod3 = prod3;
	}

	public String getProd4() {
		return prod4;
	}

	public void setProd4(String prod4) {
		this.prod4 = prod4;
	}

	public String getProd5() {
		return prod5;
	}

	public void setProd5(String prod5) {
		this.prod5 = prod5;
	}

	public void setCliente(Object cliente) {
		Cliente = cliente;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public void agregarPedido(Pedido pedido) {
		if (pedido.isPagado()) {
			this.Historial += pedido.getCodigo() + ",";
		}

	}

	public String getCliente() {
		return getCliente();
	}

	public void setCliente(String Cliente) {
		this.Cliente = Cliente;

}
}

