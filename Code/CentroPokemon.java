package builder;

/**
 * Clase CentroPokemon. En esta clase se contienen todos los atributos y métodos
 * de un Centro pokemon donde se hacen los llamados para crear nuevos pokemones.
 * Esta clase funciona como Director en la creación de los pokemones.
 *
 * @author Alejandro Cano Múnera
 * @author Luis Javier Palacio Mesa
 * @author Sebastián Girlado Gómez
 * @version Noviembre 2018
 */
public class CentroPokemon {

    /**
     * Atributo builder de tipo PokemonBuilder
     */
    private PokemonBuilder builder;

    /**
     * Metodo construirPokemon. Este método se encarga de utilizar el builder
     * que se esta usando actualmente para crear un nuevo pokemon.
     */
    public void construirPokemon() {
        builder.crearNuevoPokemon();
    }

    /**
     * Metodo getPokemon. Este método permite obtener un pokemon que ha sido
     * creado por el builder.
     *
     * @return Se devuelve un pokemon creado por el builder
     */
    public Pokemon getPokemon() {
        return builder.getPokemon();
    }

    /**
     * Metodo setBuilder. Este metodo cambia el builder actual por uno que se
     * pasa como parametro.
     *
     * @param builder Es el builder que se desea utilizar.
     */
    public void setBuilder(PokemonBuilder builder) {
        this.builder = builder;
    }

}
