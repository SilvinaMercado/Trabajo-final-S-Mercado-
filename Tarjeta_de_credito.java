package cine.code;

public class Tarjeta_de_credito {
	private String banco;
	private Integer numero;
	Usuario cliente;
	private Double credito;
	private String vencimiento;
	public Tarjeta_de_credito(String banco, Integer numero, Usuario cliente, Double credito, String vencimiento) {
		super();
		this.banco = banco;
		this.numero = numero;
		this.cliente = cliente;
		this.credito = credito;
		this.vencimiento = vencimiento;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Usuario getCliente() {
		return cliente;
	}
	public void setCliente(Usuario cliente) {
		this.cliente = cliente;
	}
	public Double getCredito() {
		return credito;
	}
	public void setCredito(Double credito) {
		this.credito = credito;
	}
	public String getVencimiento() {
		return vencimiento;
	}
	public void setVencimiento(String vencimiento) {
		this.vencimiento = vencimiento;
	}
	

}
