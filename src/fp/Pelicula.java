package fp;

import java.time.LocalDate;

public interface Pelicula extends Comparable<Pelicula>{
	
	public String getTitulo();
	public void setTitulo(String titulo);
	
	public Integer getDuracion();
	public void setDuracion(Integer duracion);
	
	public LocalDate getFechaEstreno();
	public void setFechaEstreno(LocalDate fechaEstreno);
	
	public String getLocalizacion();
	public void setLocalizacion(String localizacion);
	
	public String getDato();
	public void setDato(String dato);
	
	public String getDirector();
	public void setDirector(String director);
	
	public String getEscritor();
	public void setEscritor(String escritor);
	
	public String getActor();
	public void setActor(String actor);
	
	public Valoracion getValoracion();
	public void setValoracion(Valoracion valoracion);
	
//integer: getYear
//boolean: dirigido por alguien especifico
//enumerado:¿columna nueva? (valoracion: buena, muy buena, mala)

}
