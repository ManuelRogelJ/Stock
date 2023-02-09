package Pedidos2ev;

import java.util.Date;

public class PasarelaDePago {

	// Atributos
	private double importe;
	private String codigoPago;
	private Date Date;

	public PasarelaDePago(double importe) {
		this.importe = importe;
	}

	// Métodos en otra clase
	public boolean efectivo() {
		if (this.importe > 0) {
			this.generarCodigoPago();
			this.importe = 0;
			return true;
		}
		return false;
	}

	public boolean tarjeta(String numeroTarjeta) {
		if (this.importe > 0 && validarTarjeta(numeroTarjeta)) {
			this.generarCodigoPago();
			this.importe = 0;
			return true;
		}
		return false;
	}

	public boolean cuenta(String cuenta) {
		if (this.importe > 0 && validarCuenta(cuenta)) {
			this.generarCodigoPago();
			this.importe = 0;
			return true;
		}
		else {
			return false;
	}
	}
	private void generarCodigoPago() {
		this.codigoPago = String.valueOf(new Date().getTime());
	}

	private boolean validarTarjeta(String numeroTarjeta) {
		return true;
		// Implementar la lógica de validación
	}

	private boolean validarCuenta(String cuenta) {
		return true;
		// Implementar la lógica de validación
	}

	// Métodos Getters and Setters
	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public String getCodigoPago() {
		return codigoPago;
	}

	public void setCodigoPago(String codigoPago) {
		this.codigoPago = codigoPago;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}

	}
