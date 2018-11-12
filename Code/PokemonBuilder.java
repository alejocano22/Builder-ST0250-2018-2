package builder;

/**
 * Clase Abstracta Pokemonbuilder. En esta clase se contiene la plantilla base
 * que define como se debe implementar un constructor de pokemones.
 *
 * @author Alejandro Cano Múnera
 * @author Luis Javier Palacio Mesa
 * @author Sebastián Girlado Gómez
 * @version Noviembre 2018
 */
public abstract class PokemonBuilder {

    /**
     * Se tiene un atributo pokemon tipo Pokemon
     */
    protected Pokemon pokemon;

    /**
     * Método getPokemon. Este método devuelve un pokemon que ha sido creado
     * anteriormente gracias al método crearNuevoPokemon
     *
     * @return Se retorna un objeto tipo Pokemon
     */
    public Pokemon getPokemon() {
        return pokemon;
    }

    /**
     * Método crearNuevoPokemon. Este método hace un llamado a los diferentes
     * métodos build para construir un pokemon en diferentes partes. Esta clase
     * funciona como un AbstractBuilder que define como deben de ser los
     * diferente ConcreteBuilder.
     */
    public void crearNuevoPokemon() {
        pokemon = new Pokemon();
        buildNombre();
        buildClase();
        buildPoder();
        buildNivel();
    }

    //Métodos build para crear las partes del Pokemon
    abstract void buildNombre();

    abstract void buildClase();

    abstract void buildPoder();

    abstract void buildNivel();

}
