package cine.code;

public class Reserva {
	private Float precio;
	private String fecha;
	Usuario cliente;
	Butaca butaca;
	Pelicula pelicula;
	Descuento descuento;
	Tarjeta_de_credito pago;
	public Reserva(Float precio, String fecha, Usuario cliente, Butaca butaca, Pelicula pelicula, Descuento descuento,
			Tarjeta_de_credito pago) {
		super();
		this.precio = precio;
		this.fecha = fecha;
		this.cliente = cliente;
		this.butaca = butaca;
		this.pelicula = pelicula;
		this.descuento = descuento;
		this.pago = pago;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Usuario getCliente() {
		return cliente;
	}
	public void setCliente(Usuario cliente) {
		this.cliente = cliente;
	}
	public Butaca getButaca() {
		return butaca;
	}
	public void setButaca(Butaca butaca) {
		this.butaca = butaca;
	}
	public Pelicula getPelicula() {
		return pelicula;
	}
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	public Descuento getDescuento() {
		return descuento;
	}
	public void setDescuento(Descuento descuento) {
		this.descuento = descuento;
	}
	public Tarjeta_de_credito getPago() {
		return pago;
	}
	public void setPago(Tarjeta_de_credito pago) {
		this.pago = pago;
	}
	
	

}
