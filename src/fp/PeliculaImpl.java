package fp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import utiles.Checkers;

public class PeliculaImpl implements Pelicula{ 
	
	private String titulo;
	private Integer duracion;
	private LocalDate fechaEstreno;
	private String localizacion;
	private String dato;
	private String director;
	private String escritor;
	private String actor;
	private Valoracion valoracion;
	private Boolean ValPos;  // indica si la pelicula tiene una valoracion

	
	public Integer getAnyo() {
		return fechaEstreno.getYear();
	}

	public PeliculaImpl(String titulo, Integer duracion, LocalDate fechaEstreno, String localizacion, String dato, 
			 String director, String escritor, String actor, Valoracion valoracion, Boolean ValPos) {//si el titulo o el actor están vacios me salta un error
		Checkers.check("titulo no puede ser null", titulo != null);
		Checkers.check("titulo no puede ser null", actor != null);

	
	this.titulo = titulo;
	this.duracion = duracion;
	this.fechaEstreno = fechaEstreno;
	this.localizacion = localizacion;
	this.dato = dato;
	this.director = director;
	this.escritor = escritor;
	this.actor = actor;
	this.valoracion = valoracion;
	this.ValPos = ValPos;
}
	public PeliculaImpl(String titulo, Integer duracion, LocalDate fechaEstreno, String director, String escritor, String actor, Valoracion valoracion, Boolean ValPos) {
		Checkers.check("titulo no puede ser null", titulo != null);

		
		this.titulo = titulo;
		this.duracion = duracion;
		this.fechaEstreno = fechaEstreno;
		this.localizacion = null;
		this.dato = null;
		this.director = director;
		this.escritor = escritor;
		this.actor = actor;
		this.valoracion = valoracion;
		this.ValPos = ValPos;

	}
	
public PeliculaImpl(String s) {
		
		String[] trozos = s.split(",");
		
	this.titulo = (trozos[0].trim());
	this.duracion = Integer.valueOf(trozos[1].trim());
	this.fechaEstreno = LocalDate.parse(trozos[2].trim(), DateTimeFormatter.ofPattern("d/M/y")); //le paso de q manera quiero q me lea las fechas
	this.localizacion = trozos[3].trim();
	this.dato = trozos[4].trim();
	this.director = (trozos[5].trim());
	this.escritor = trozos[6].trim();
	this.actor = trozos[7].trim();
	this.valoracion = Valoracion.valueOf(trozos[8].trim().toUpperCase());
	this.ValPos = parseaBooleano(trozos[9].trim());

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
	public Integer getDuracion() {
		return duracion;
	}
	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}
	
	public Valoracion getValoracion() {
		return valoracion;
	}
	public void setValoracion(Valoracion valoracion) {
		this.valoracion = valoracion;
	}
	
	public Boolean esValPos() {
		return ValPos;
	}
	
	@Override
	public String toString() {
		return "PeliculaImpl [titulo=" + getTitulo() + ", duracion=" + getDuracion() + ", fechaEstreno=" + getFechaEstreno()
				+ ", localizacion=" + getLocalizacion() + ", dato=" + getDato() + ", director=" + getDirector() + ", escritor="
				+ getEscritor() + ", actor=" + getActor() + ", valoracion=" + getValoracion() + ", ValPos=" + esValPos() + "]";
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
public int compareTo(PeliculaImpl p) {//se ordenan por director y titulo.
	
	int res = getTitulo().compareTo(p.getTitulo());
	if(res == 0) {
		res = getDirector().compareTo(p.getDirector());
	}
	return res;
	}


public int compareTo(Pelicula o) {
	return 0;
}

public void setDirector(String director) {
}

private static Boolean parseaBooleano(String cadena) {
	Boolean res = null;
	cadena = cadena.toUpperCase();
	if (cadena.equals("VERDADERO")) {
		res = true;
	}else {
		res = false;
	}
	return res;
}

}


