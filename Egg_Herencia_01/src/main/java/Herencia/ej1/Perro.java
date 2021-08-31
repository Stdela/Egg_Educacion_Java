
package Herencia.ej1;

/**
 *
 * @author delam
 */
public class Perro extends Animal {

    public Perro() {
    }

    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public String toString() {
        return "Perro{" + '}';
    }

}
