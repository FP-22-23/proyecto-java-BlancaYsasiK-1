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
			List<String> lineas = Files.readAllLines(Paths.get(nombreFichero));
//parsea las lineas de fichero
		for(String linea:lineas) {//de las lineas que tengo voy iterando todas las lineas
			Pelicula p = new PeliculaImpl(linea);
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
		if(trozos.length != 10) { //si los datos no corresponden a 8 salta un error
			throw new IllegalArgumentException("La cadena no tiene" + " formato válido");
	}

		String titulo = trozos[0].trim();
	    Integer duracion = Integer.valueOf(trozos[1].trim());
		LocalDate fechaEstreno = LocalDate.parse(trozos[1].trim(), DateTimeFormatter.ofPattern("d/M/y")); 
		String  localizacion= trozos[2].trim();
		String dato = trozos[3].trim();
		String director = trozos[4].trim();
		String escritor = trozos[5].trim();
		String actor = trozos[6].trim();
		Valoracion valoracion = Valoracion.valueOf(trozos[8].trim().toUpperCase());
		Boolean ValPos = parseaBooleano(trozos[9].trim());


		return new PeliculaImpl(titulo, duracion, fechaEstreno, localizacion, dato, director, escritor, actor, valoracion, ValPos);
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
	
