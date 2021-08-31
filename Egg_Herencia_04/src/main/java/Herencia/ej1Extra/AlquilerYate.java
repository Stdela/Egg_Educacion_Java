
package Herencia.ej1Extra;

import java.util.Date;


public class AlquilerYate extends Alquiler {
private Yate yate;

    public AlquilerYate(Yate yate) {
        this.yate = yate;
    }

    public AlquilerYate(Yate yate, String nombre, Long documento, Date fechaPrestamo, Date fechaDevolucion) {
        super(nombre, documento, fechaPrestamo, fechaDevolucion);
        this.yate = yate;
    }
public int calcularCosto(){
    this.setearFechas();
     int aux1 = this.diasdePrestamo() + yate.getEslora()*10;
     aux1 = aux1 + yate.getCamarotes() + yate.getCaballosFuerza();
    return aux1;
}
}
