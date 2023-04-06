# proyecto-java-BlancaYsasiK-1
proyecto-java-BlancaYsasiK-1 created by GitHub Classroom


Estructura de las carpetas del proyecto:

src: Directorio con el código fuente.
fp: Paquete que contiene los tipos del proyecto.
test: Paquete que contiene las clases de test del proyecto.
utiles: Paquete que contiene las clases de utilidad.
data: Contiene el dataset del proyecto.
peliculas.csv: Archivo csv que contiene datos de diferentes peliculas grabadas en San Francisco.


Estructura del dataset:
El dataset ha sido modificado. Se han mantenido veinte lineas de información sobre las películas. Algunas columnas han sido borradas y la columna de fecha de estreno ha sido modificada añadiendo un dia y mes.

title: de tipo cadena. Indica el titulo de las películas.
released year: de tipo fecha. Indica la fecha (solo el año es real) en el que se estrenó la pelicula.
fun fact: de tipo cadena. Indica un dato curioso sobre la película.
location: de tipo cadena. Indica la localización donde se grabó la película.
director: de tipo cadena. Indica el director que ha rodado la película.
writer: de tipo cadena. Indica el escritor que ha escrito la película.
actor: de tipo cadena. Indica el actor principal de la película.


Constructores:

C1: Tiene un parámetro por cada propiedad básica del tipo.
C2: Crea un objeto de tipo Pelicula a partir de los siguientes parámetros: String titulo, LocalDate fechaEstreno, String director, String escritor, String actor.
Restricciones:

R1: El titulo tiene que tener un valor.
R2: El actor tiene que tener un valor.
Criterio de ordenación: Por director y titulo.
Criterio de igualdad: Dos peliculas son iguales si lo son sus propiedades director, fecha de estreno y titulo.

