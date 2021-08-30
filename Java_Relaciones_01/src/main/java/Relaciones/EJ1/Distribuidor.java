package Relaciones.EJ1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author delam
 */
public class Distribuidor {

    private Persona persona;
    private ArrayList<Perro> perros;

    public Distribuidor() {
    }

    public Distribuidor(ArrayList<Perro> perros) {

        this.perros = perros;
    }

    @Override
    public String toString() {
        return "Distribuidor{" + "persona=" + persona + ", perros=" + perros + '}';
    }

    public void setearDueños(Persona persona) {
        // No funciona - buscar de poner iterator o ponerle un for adecuado zzzzzzzz
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre del perro que quiere adoptar ");
        String nombrePerro = scanner.nextLine();
        for (int i = 0; i < this.perros.size(); i++) {
            if (true) {

            }
        }

    }

}
