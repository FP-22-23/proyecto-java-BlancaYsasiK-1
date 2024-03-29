package test;

import java.time.LocalDate;     
import java.util.List;

import fp.Filmoteca;
import fp.FactoriaPelicula;
import fp.Pelicula;
import fp.PeliculaImpl;
import fp.Valoracion;

public class TestFilmoteca {

	public static void main(String[] args) {
		
		Filmoteca f = new Filmoteca();
		
		Pelicula p = new PeliculaImpl("180", 8, LocalDate.now(), "Epic Roasthouse (399 Embarcadero)", " ", "Jayendra", "Umarji Anuradha", "Siddart", Valoracion.BUENA, Boolean.TRUE);
	
		f.anadirPelicula(p);
		System.out.println(f.getPelicula());
	
	List<Pelicula> Peliculas = FactoriaPelicula.leerPeliculas("data/Peliculas.csv");
	
	Filmoteca f2 = new Filmoteca(Peliculas);
	
	System.out.println(f2.getPelicula());
	
	}
	
}
