# proyecto-java-BlancaYsasiK-1
proyecto-java-BlancaYsasiK-1 created by GitHub Classroom



Estructura de las carpetas del proyecto:


src: Directorio con el código fuente.
fp: Paquete que contiene los tipos del proyecto.
test: Paquete que contiene las clases de test del proyecto.
útiles: Paquete que contiene las clases de utilidad.
data: Contiene el dataset del proyecto.
películas.csv: Archivo csv que contiene datos de diferentes películas grabadas en San Francisco.


Estructura del dataset:


El dataset ha sido modificado. Se han mantenido veinte líneas de información sobre las películas. Algunas columnas han sido borradas y la columna de fecha de estreno ha sido modificada añadiendo un día y mes. Se han creado las columnas; valoración para poder hacer un enumerado donde puede tomar los valores: mala, buena, exito;  la columna duración, que indica los minutos que dura cada película; y la columna ValPos (valoración positiva), si ha la película se le ha dado una valoración, nos devuelve true.


title: de tipo cadena. Indica el título de las películas.

released year: de tipo fecha. Indica la fecha (solo el año es real) en el que se estrenó la película.

fun fact: de tipo cadena. Indica un dato curioso sobre la película.

Location: de tipo cadena. Indica la localización donde se grabó la película.

director: de tipo cadena. Indica el director que ha rodado la película.

Writer: de tipo cadena. Indica el escritor que ha escrito la película.

actor: de tipo cadena. Indica el actor principal de la película.


PELICULAIMPL

Constructores:

C1: Tiene un parámetro por cada propiedad básica del tipo.
C2: Crea un objeto de tipo Película a partir de los siguientes parámetros: String titulo, LocalDate fechaEstreno, String director, String escritor, String actor.
Restricciones:

R1: El título tiene que tener un valor.
R2: El actor tiene que tener un valor.
Criterio de ordenación: Por director y título.
Criterio de igualdad: Dos películas son iguales si lo son sus propiedades director, fecha de estreno y título.



PELÍCULAS (contenedor)

contiene los objetos de tipo película.


Constructores:

C1: Crea un objeto películas vacía.
C2: Constructor con un parámetro Collection. Crea un objeto películas con las películas incluidas en la colección dada como parámetro.


Otras operaciones:


 getNumeroPelis: devuelve el número de películas que hay en el CSV.

IncorporaPelis: mete una película dentro de la lista de las películas.

eliminaPelis: elimina una película dentro de la lista de las películas.

getNumeroPelisDirector: devuelve el número de películas que haya hecho el director que le pasemos.

existepeliculaDirectorValoracion: devuelve true si el director de esa película ha obtenido de valoración la que hemos seleccionado.

calcularTituloPorDirector: devuelve el director y los títulos de las películas que haya dirigido.

getPelisMismaDuracion: crea un diccionario con las distintas duraciones que pueden tener como clave y el número de películas que tienen esa duración.







