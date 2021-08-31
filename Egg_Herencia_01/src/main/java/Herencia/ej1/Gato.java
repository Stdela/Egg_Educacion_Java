
package Herencia.ej1;

/**
 *
 * @author delam
 */
public class Gato extends Animal {

    public Gato() {
    }

    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public String toString() {
        return "Gato{" + '}';
    }

}
