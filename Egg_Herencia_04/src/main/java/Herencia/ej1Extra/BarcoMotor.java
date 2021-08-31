
package Herencia.ej1Extra;
import java.util.Scanner;
/**
 *
 * @author delam
 */
public class BarcoMotor extends Barco{
private int caballosFuerza;

    public BarcoMotor() {
    }

    public BarcoMotor(int caballosFuerza, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.caballosFuerza = caballosFuerza;
    }

    public int getCaballosFuerza() {
        return caballosFuerza;
    }

    public void setCaballosFuerza(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }

    @Override
    public String toString() {
        return super.toString() + "caballosFuerza=" + caballosFuerza + '}';
    }

    @Override
    public void crearBarco() {
        Scanner scanner = new Scanner(System.in);
        super.crearBarco();
        System.out.println("Ingrese CV");
        this.caballosFuerza =scanner.nextInt();
                //To change body of generated methods, choose Tools | Templates.
    }

}
