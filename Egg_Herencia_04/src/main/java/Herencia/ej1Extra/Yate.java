
package Herencia.ej1Extra;

/**
 *
 * @author delam
 */
public class Yate extends Barco {
private int caballosFuerza;
private int camarotes;

    public Yate() {
    }

    public Yate(int caballosFuerza, int camarotes) {
        this.caballosFuerza = caballosFuerza;
        this.camarotes = camarotes;
    }

    public Yate(int caballosFuerza, int camarotes, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.caballosFuerza = caballosFuerza;
        this.camarotes = camarotes;
    }

    public int getCaballosFuerza() {
        return caballosFuerza;
    }

    public void setCaballosFuerza(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public String toString() {
        return super.toString() + caballosFuerza + ", camarotes=" + camarotes + '}';
    }

    @Override
    public void crearBarco() {
        super.crearBarco();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Ingrese CV");
        this.caballosFuerza = scanner.nextInt();
        System.out.println("Ingrese n de camarotes");
        this.camarotes = scanner.nextInt();
//To change body of generated methods, choose Tools | Templates.
    }

}
