
package Herencia.ej1Extra;
import java.util.Scanner;
/**
 *
 * @author delam
 */
public class Velero extends Barco{
private int numeroMastil;

    public Velero() {
    }

    public Velero(int numeroMastil, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numeroMastil = numeroMastil;
    }

    public int getNumeroMastil() {
        return numeroMastil;
    }

    public void setNumeroMastil(int numeroMastil) {
        this.numeroMastil = numeroMastil;
    }

    @Override
    public String toString() {
        return super.toString() + "numeroMastil=" + numeroMastil + '}';
    }

    @Override
    public void crearBarco() {
        Scanner scanner = new Scanner(System.in);
        
        super.crearBarco(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Numero de mástiles ");
        this.numeroMastil = scanner.nextInt();
    }

}
