# Builder-ST0250-2018-2
Builder: Implementación del patrón builder mediante un juego de pokemons donde cada pokemon se crea siguiendo dicho patrón.
## Integrantes
Alejandro Cano Múnera,
Luis Javier Palacio Mesa,
Sebatián Giraldo Gómez.
## Patrón de diseño
Builder design pattern.
## Justificación del uso del patrón de diseño
Utilizamos el ejemplo de un juego de pokemon dado a que este nos ayuda a ejemplificar de una manera correcta y explicativa el patrón de diseño builder. En el juego tenemos dos personajes que son Pikachu y Charmander los cuales tienen determinados atributos definidos por lo que a través del patrón Builder podemos crear pokemones con la configuración de atributos de Pikachu o de Charmander. Aplicando Builder se nos permite crear las diferentes partes de un pokemon por separado para crear al final un objeto complejo pokemon.
## Diagrama de clases de la solución implementada
![alt text](https://github.com/alejocano22/Builder-ST0250-2018-2/blob/master/Diagramas/DiagramaPokemons.png)
## Lenguaje de programación
El lenguaje de programación usado para el desarrollo de este patrón de diseño fue JAVA versión 8 Update 191 CPU
## Ejecución del código
El método main del código, donde se inicia su ejecución, está en la clase JuegoPokemon.java, allí se crean instancias de un CentroPokemon, un PikachuBuilder y un CharmanderBuilder, que además son los lugares donde se crearan los Pokemones pedidos.
## Referencias bibliográficas
- [1] Wikipedia. Información recuperada de:  https://es.wikipedia.org/wiki/Patr%C3%B3n_de_dise%C3%B1o
- [2] Wikipedia. Información recuperada de: https://es.wikipedia.org/wiki/Builder_(patr%C3%B3n_de_dise%C3%B1o)
- [3] Programación net. Información recuperada de: https://programacion.net/articulo/patrones_de_diseno_iii_patrones_de_creacion_builder_1002
- [4] Mi granito de Java. Información recuperada de: http://migranitodejava.blogspot.com/2011/05/builder.html
