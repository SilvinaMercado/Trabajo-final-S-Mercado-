package cine.code;

public class Sala {
	private Integer idsala;
	private String formato;
	private Integer capacidad;
	private Integer bocupadas;
	public Sala(Integer idsala, String formato, Integer capacidad, Integer bocupadas) {
		super();
		this.idsala = idsala;
		this.formato = formato;
		this.capacidad = capacidad;
		this.bocupadas = bocupadas;
	}
	public Integer getIdsala() {
		return idsala;
	}
	public void setIdsala(Integer idsala) {
		this.idsala = idsala;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public Integer getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}
	public Integer getBocupadas() {
		return bocupadas;
	}
	public void setBocupadas(Integer bocupadas) {
		this.bocupadas = bocupadas;
	}
	
	

}
