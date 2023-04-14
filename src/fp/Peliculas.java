package fp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Peliculas implements Peliculass{
	
	private List<Pelicula> peliculas;
	
	public Peliculas() {
		peliculas = new ArrayList<Pelicula>();
	}
	
	
	public Peliculas(Collection<Pelicula> peliculas) {
		peliculas = new ArrayList<Pelicula>(peliculas);
	}
	
	
	public Set<Pelicula> getPeliculas(){
		return new HashSet<Pelicula>(peliculas);
	}
	
	public Peliculas(List<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}
		
		
	public Integer getNumeroPelis() {
		return peliculas.size();
		}
		
		//añade peliculas
		public void incorporaPelis(Collection<? extends Pelicula> peliculas) {
		this.peliculas.addAll(peliculas);
		}
	
		//elimina peliculas
		public void eliminaPelis(Pelicula p) {
		peliculas.remove(p);
	
		}	
		
		//contador
		public Integer getNumeroPelisDirector(String p) {
			Integer i = 0;
			for(Pelicula peli: peliculas) {
				if(peli.getDirector().equals(p)) 
					i++;
			}
			return i;
		}
		
		
		//existe
		 public Boolean existePeliculaDirectorValoracion(String l, Valoracion a) {
			  	Predicate<Pelicula> p = peli -> peli.getDirector().equals(l) && peli.getValoracion().equals(a); 
			  	
			  	return peliculas.stream().anyMatch(p);
			  	
			  }
		 
		   //agrupacion
		   public Map<String, Set<String>> calcularTituloPorDirector(){
				return peliculas.stream()
					    .collect(Collectors.groupingBy(
					    		      Pelicula::getDirector, 
					        		  Collectors.mapping(Pelicula::getTitulo, Collectors.toSet())));
		
		   }

		   public Map<Integer, Long> getPelisMismaDuracion(){
			    //(inicializar vacio)
			     Map<Integer, Long> res = new HashMap<Integer, Long>();
			     
			     for(Pelicula pe:peliculas) {
			     	//(obtener clave)
			    	Integer key = pe.getDuracion();
			     	if(res.containsKey(key)) {
			     		//(obtener valor almacenado)
			     		Long value = res.get(key);
			     		//(actualizar valor)
			     		value+=1;
			     		//(actualizar clave-valor en el diccionario)
			     		res.put(key, value);
			     	
			     	}
			    	else {
			      	    //(inicializo el valor)
			      		Long value = 1L;
			      		//(añadir al diccionario)
			      		res.put(key, value);		
			     }
			    }
			     return res;
			     }

		public void añadirPelicula(Pelicula pelicula) {
			// TODO Auto-generated method stub
			
		}

		
		
		
}