package builder;

/**
 * Clase Pikachubuilder Extiende de PokemonBuilder. En esta clase se definen los métodos que construyen las
 * partes de un Pokemon Pikachu. Esta clase funciona como un
 * ConcreteBuilder que crea un pokemon específico.
 *
 * @author Alejandro Cano Múnera
 * @author Luis Javier Palacio Mesa
 * @author Sebastián Girlado Gómez
 * @version Noviembre 2018
 */
public class PikachuBuilder extends PokemonBuilder {

    //Métodos que construyen las partes del pokemon Pikachu
    @Override
    void buildNombre() {
        super.pokemon.setNombre("Pikachu");
    }

    @Override
    void buildClase() {
        super.pokemon.setClase("Eléctrico");
    }

    @Override
    void buildPoder() {
        super.pokemon.setPoder("Impactrueno");
    }

    @Override
    void buildNivel() {
        super.pokemon.setNivel(2000);
    }

}
