package cine.code;

public class Descuento {
	private String dia;
	private Float porcentaje;
	public Descuento(String dia, Float porcentaje) {
		super();
		this.dia = dia;
		this.porcentaje = porcentaje;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public Float getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(Float porcentaje) {
		this.porcentaje = porcentaje;
	}
	
	

}
