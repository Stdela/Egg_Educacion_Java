
package Herencia.ej1Extra;

import java.util.Date;


public class AlquilerBarcoMotor extends Alquiler {
private BarcoMotor barcoMotor;
    public AlquilerBarcoMotor(BarcoMotor barcoMotor) {
        this.barcoMotor = barcoMotor;
    }

    public AlquilerBarcoMotor(BarcoMotor barcoMotor, String nombre, Long documento, Date fechaPrestamo, Date fechaDevolucion) {
        super(nombre, documento, fechaPrestamo, fechaDevolucion);
        this.barcoMotor = barcoMotor;
    }
public int calcularCosto(){
this.setearFechas();
     int aux1 = this.diasdePrestamo() + barcoMotor.getEslora()*10;
     aux1 = aux1 + barcoMotor.getCaballosFuerza();
     return aux1;
}
}
