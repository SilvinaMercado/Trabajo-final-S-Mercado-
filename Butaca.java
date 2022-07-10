package cine.code;

public class Butaca {
	private String fila;
	private Integer numero;
	private Boolean reserva;
	Sala sala;
	public Butaca(String fila, Integer numero, Boolean reserva, Sala sala) {
		super();
		this.fila = fila;
		this.numero = numero;
		this.reserva = reserva;
		this.sala = sala;
	}
	public String getFila() {
		return fila;
	}
	public void setFila(String fila) {
		this.fila = fila;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Boolean getReserva() {
		return reserva;
	}
	public void setReserva(Boolean reserva) {
		this.reserva = reserva;
	}
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	
	

}
