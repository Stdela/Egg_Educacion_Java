
package Herencia.ej1Extra;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author delam
 */
public class BarcosServicio {
    ArrayList<Barco> barco1 = new ArrayList<>();
    
public  Barco crearBarcos(){
    Barco barco = new Barco();
    barco.crearBarco();
    return barco;
}
public BarcoMotor barcoMotor(){
    BarcoMotor barcoMotor1 = new BarcoMotor();
    barcoMotor1.crearBarco();
    return barcoMotor1;
    
}
public Velero barcoVelero(){
    Velero velero1 = new Velero();
    velero1.crearBarco();
    return velero1;
}
public Yate crearYate(){
    Yate yate1 = new Yate();
    yate1.crearBarco();
    return yate1;
    
}
public ArrayList<Barco> listaBarcos(){
    for (int i = 0; i < 1; i++) {
    barco1.add(crearBarcos());
    barco1.add(barcoMotor());
    barco1.add(barcoVelero());
    barco1.add(crearYate());
    }
    return barco1;    
}

}
