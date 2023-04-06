package fp;

import java.util.ArrayList; 
import java.util.List;


public class Filmoteca {

	private List<Pelicula> peliculas;
	
	public Filmoteca() {
		this.peliculas = new ArrayList<Pelicula>();
	}
	public Filmoteca(List<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}
	
	public List<Pelicula> getPelicula(){
			return new ArrayList<Pelicula>(this.peliculas);
	}
	
	public void anadirPelicula(Pelicula p) {
	    this.peliculas.add(p);
	}
	
}
