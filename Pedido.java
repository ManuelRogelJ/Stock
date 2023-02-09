package Pedidos2ev;

public class Pedido {
		
		//Atributos
		Cliente cliente;
		Producto producto1;
		Producto producto2;
		double importeTotal;
		PasarelaDePago pago;
		String estado;

	    public Pedido() {
	        this.estado = "PAGADO";
	    }

	    public void pagar(String tipoPago) {
	        if (!this.estado.equals("PAGADO")) {
	            return;
	        }
	        this.importeTotal = this.producto1.getPrecio() * this.producto1.getCantidad();
	        if (this.producto2 != null) {
	            this.importeTotal += this.producto2.getPrecio() * this.producto2.getCantidad();
	        }
	        this.pago = new PasarelaDePago(this.importeTotal);
	        switch (tipoPago) {
	            case "EFECTIVO":
	                if (this.pago.efectivo()) {
	                    this.estado = "PREPARANDO";
	                    this.cliente.agregarPedido(this);
	                }
	                break;
	            case "TARJETA":
	                if (this.pago.tarjeta("1234567890")) { // numero de la tarjeta
	                    this.estado = "PREPARANDO";
	                    this.cliente.agregarPedido(this);
	                }
	                break;
	            case "CUENTA":
	                if (this.pago.cuenta("1234567890")) { // numero de la cuenta 
	                    this.estado = "PREPARANDO";
	                    this.cliente.agregarPedido(this);
	                }
	                break;
	            default:
	                break;
	        }
	    }

	    public void agregarCliente(Cliente cliente) {
	        this.cliente = cliente;
	    }

	    public void agregarProducto1(Producto producto) {
	        this.producto1 = producto;
	    }

	    public void agregarProducto2(Producto producto) {
	        if (this.producto1 == null) {
	            return;
	        }
	        this.producto2 = producto;
	    }
	    
	    public boolean isPagado() {
			return false;
		}

	    public String getCodigo() {
	    	return null;
	    }

	    public void eliminarProducto(Producto producto) {
	        if (producto.equals(this.producto1)) {
	            this.producto1 = null;
	        } else if (producto.equals(this.producto2)) {
	            this.producto2 = null;
	        }
	    }

	    @Override
		public String toString() {
	    	return getClass().getName() + "@" + Integer.toHexString(hashCode());
	    }

}


