package builder;

/**
 * Clase Pokemon. En esta clase se contienen los atributos y métodos que tiene
 * un Pokemon. Esta clase funciona como el Product que define como es un
 * Pokemon.
 *
 * @author Alejandro Cano Múnera
 * @author Luis Javier Palacio Mesa
 * @author Sebastián Girlado Gómez
 * @version Noviembre 2018
 */
public class Pokemon {

    /**
     * Atributos de un Pokemon
     */
    private String nombre;
    private String clase;
    private String poder;
    private int nivel;

    //Métodos set para modificar los atributos del pokemon
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * Método toString. Este método devuelve toda la información del pokemon en
     * forma de String.
     *
     * @return Se retorna un String con toda la información del pokemon
     */
    @Override
    public String toString() {
        return "Pokemon{" + "nombre=" + nombre + ", clase=" + clase + ", poder=" + poder + ", nivel=" + nivel + '}';
    }

}
