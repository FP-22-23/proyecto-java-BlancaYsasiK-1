package fp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FactoriaPelicula {

	public static List<Pelicula> leerPeliculas
	(String nombreFichero){
		List<Pelicula> res = new ArrayList<Pelicula>();
		try {
			List<String> lineas = Files.readAllLines(Paths.get(nombreFichero));//parsea las lineas de fichero
		for(String linea:lineas) {//de las lineas q tengo voy iterando todas las lineas
			Pelicula p = parsearPelicula(linea);
			res.add(p);
		}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	private static Pelicula parsearPelicula(String linea) {
		String[] trozos = linea.split(",");
		if(trozos.length != 7) {
			throw new IllegalArgumentException("La cadena no tiene" + " formato válido");
	}
	
		//checkNombre(trozos[0].trim());

		String titulo = trozos[0].trim();
		LocalDate fechaEstreno = LocalDate.parse(trozos[1].trim(), DateTimeFormatter.ofPattern("d/M/y")); 
		String  localizacion= trozos[2].trim();
		String dato = trozos[3].trim();
		String director = trozos[4].trim();
		String escritor = trozos[5].trim();
		String actor = trozos[6].trim();

		return new PeliculaImpl(titulo, fechaEstreno, localizacion, dato, director, escritor, actor);
		}
//	private static void checkNombre(String s) {
//		if(s.replaceAll(" ", "").equals("")) {
//			throw new IllegalArgumentException("El nombre no puede estar vacio");
//		
//		
//	}
}

