package cine.code;

public class Pelicula {
	private String titulo;
	private String genero;
	private Integer duracion;
	private String clasificacion;
	private String sinopsis;
	private String idioma;
	public Pelicula(String titulo, String genero, Integer duracion, String clasificacion, String sinopsis,
			String idioma) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
		this.clasificacion = clasificacion;
		this.sinopsis = sinopsis;
		this.idioma = idioma;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Integer getDuracion() {
		return duracion;
	}
	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}
	public String getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	
}
