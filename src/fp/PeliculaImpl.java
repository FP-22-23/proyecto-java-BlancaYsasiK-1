package fp;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import utiles.Checkers;

public class PeliculaImpl implements Pelicula{ 
	
	private String titulo;
	private LocalDate fechaEstreno;
	private String localizacion;
	private String dato;
	private String director;
	private String escritor;
	private String actor;
	
	public Integer getAnyo() {
		return fechaEstreno.getYear();
	}

	public PeliculaImpl(String titulo, LocalDate fechaEstreno, String localizacion, String dato, 
			 String director, String escritor, String actor) {
		Checkers.check("titulo no puede ser null", titulo != null);
		Checkers.check("titulo no puede ser null", actor != null);

	
	this.titulo = titulo;
	this.fechaEstreno = fechaEstreno;
	this.localizacion = localizacion;
	this.dato = dato;
	this.director = director;
	this.escritor = escritor;
	this.actor = actor;
}
	public PeliculaImpl(String titulo, LocalDate fechaEstreno, String director, String escritor, String actor) {
		Checkers.check("titulo no puede ser null", titulo != null);

		
		this.titulo = titulo;
		this.fechaEstreno = fechaEstreno;
		this.localizacion = null;
		this.dato = null;
		this.director = director;
		this.escritor = escritor;
		this.actor = actor;
	}
	
public PeliculaImpl(String s) {
		
		String[] trozos = s.split(",");
		
	this.titulo = trozos[0].trim();
	this.fechaEstreno = LocalDate.parse(trozos[1].trim(), DateTimeFormatter.ofPattern("d/M/y")); //le paso de q manera quiero q me lea las fechas
	this.localizacion = trozos[2].trim();
	this.dato = trozos[3].trim();
	this.director = trozos[4].trim();
	this.escritor = trozos[5].trim();
	this.actor = trozos[6].trim();

	}
	
public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		Checkers.check("titulo no puede ser null", titulo != null);
		this.titulo = titulo;
	}
	public LocalDate getFechaEstreno() {
		return fechaEstreno;
	}
	public void setFechaEstreno(LocalDate fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}
	public String getLocalizacion() {
		return localizacion;
	}
	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}
	public String getDato() {
		return dato;
	}
	public void setDato(String dato) {
		this.dato = dato;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getEscritor() {
		return escritor;
	}
	public void setEscritor(String escritor) {
		this.escritor = escritor;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		Checkers.check("titulo no puede ser null", actor != null);
		this.actor = actor;
	}

	
	public String toString() {
		return "pelicula [titulo= " + titulo + ", fechaEstreno= " + fechaEstreno + ", localizacion= " + localizacion 
				+ ", dato= " + dato + ", director= " + director + ", actor= " + actor + "]";
	}


	public int hashCode() {
		return Objects.hash(director, fechaEstreno, titulo);
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PeliculaImpl other = (PeliculaImpl) obj;
		return Objects.equals(director, other.director) && Objects.equals(fechaEstreno, other.fechaEstreno)
				&& Objects.equals(titulo, other.titulo);
	}
public int compareTo(PeliculaImpl p) {//se ordenan por artista y titulo.
	
	int res = getTitulo().compareTo(p.getTitulo());
	if(res == 0) {
		res = getDirector().compareTo(p.getDirector());
	}
	return res;
	}

@Override
public int compareTo(Pelicula o) {
	// TODO Auto-generated method stub
	return 0;
}
}


