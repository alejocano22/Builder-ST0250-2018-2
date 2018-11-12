package builder;

/**
 * Clase CharmanderBuilder Extiende de PokemonBuilder. En esta clase se definen los métodos que construyen
 * las partes de un Pokemon Charmander. Esta clase funciona como un
 * ConcreteBuilder que crea un pokemon específico.
 *
 * @author Alejandro Cano Múnera
 * @author Luis Javier Palacio Mesa
 * @author Sebastián Girlado Gómez
 * @version Noviembre 2018
 */
public class CharmanderBuilder extends PokemonBuilder {

    //Métodos que construyen las partes del pokemon Charmander
    @Override
    void buildNombre() {
        super.pokemon.setNombre("Charmander");
    }

    @Override
    void buildClase() {
        super.pokemon.setClase("Fuego");
    }

    @Override
    void buildPoder() {
        super.pokemon.setPoder("Solar");
    }

    @Override
    void buildNivel() {
        super.pokemon.setNivel(1000);
    }

}
