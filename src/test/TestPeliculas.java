package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import fp.FactoriaPelicula;
import fp.Pelicula;
import fp.Peliculas;
import fp.Valoracion;

public class TestPeliculas {

	public static void main(String[] args) {
		
		List<Pelicula> Peliculas = FactoriaPelicula.leerPeliculas("data/Peliculas.csv");
		
		Peliculas peli = new Peliculas(Peliculas);
		
		Set<Pelicula> p = peli.getPeliculas();
		List<Pelicula> l = new ArrayList<>(p);
		
		
		
System.out.println("Se han leido " + Peliculas.size() + " peliculas");
System.out.println(Peliculas);
System.out.println(peli.getPelisMismaDuracion());
System.out.println(peli.calcularTituloPorDirector());
System.out.println(peli.existePeliculaDirectorValoracion("180", Valoracion.MALA));
	}

}
