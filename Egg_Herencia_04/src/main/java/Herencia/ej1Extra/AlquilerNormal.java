
package Herencia.ej1Extra;

import java.util.Date;

/**
 *
 * @author delam
 */
public class AlquilerNormal extends Alquiler {
private Barco barco;

    public AlquilerNormal(Barco barco) {
        this.barco = barco;
    }

    public AlquilerNormal(Barco barco, String nombre, Long documento, Date fechaPrestamo, Date fechaDevolucion) {
        super(nombre, documento, fechaPrestamo, fechaDevolucion);
        this.barco = barco;
    }
public int calcularCosto(){
    this.setearFechas();
     int aux1 = this.diasdePrestamo()* barco.getEslora()*10;
    return aux1;
}

    
    
    
}
