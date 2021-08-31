
package Herencia.ej1Extra;

import java.util.Date;


public class AlquilerVelero extends Alquiler {
private Velero velero;

    public AlquilerVelero(Velero velero) {
        this.velero = velero;
    }

    public AlquilerVelero(Velero velero, String nombre, Long documento, Date fechaPrestamo, Date fechaDevolucion) {
        super(nombre, documento, fechaPrestamo, fechaDevolucion);
        this.velero = velero;
    }
    
public int calcularCosto(){
this.setearFechas();
     int aux1 = this.diasdePrestamo() + velero.getEslora()*10;
     aux1 = aux1 + velero.getNumeroMastil();
     return aux1;
}

}