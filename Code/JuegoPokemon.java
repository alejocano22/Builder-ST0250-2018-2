package builder;

/**
 * Clase JuegoPokemon. En esta clase se contiene el método main del programa, es
 * decir, desde donde se inicia la ejecución.
 *
 * @author Alejandro Cano Múnera
 * @author Luis Javier Palacio Mesa
 * @author Sebastián Girlado Gómez
 * @version Noviembre 2018
 */
public class JuegoPokemon {

    /**
     * Metodo main. Este método inicia la ejecución del programa.
     *
     * @param args Argumentos de la clase main
     */
    public static void main(String[] args) {
        PikachuBuilder pikachuBuilder = new PikachuBuilder();
        CharmanderBuilder charmanderBuilder = new CharmanderBuilder();
        CentroPokemon centro = new CentroPokemon();

        centro.setBuilder(pikachuBuilder);
        centro.construirPokemon();

        Pokemon pokemon1 = centro.getPokemon();
        System.out.println(pokemon1);

        centro.setBuilder(charmanderBuilder);
        centro.construirPokemon();

        Pokemon pokemon2 = centro.getPokemon();
        System.out.println(pokemon2);

    }

}
