
package Herencia.ej1Extra;
import java.util.Scanner;
import java.util.ArrayList;
public class BarcosMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      BarcosServicio sv = new BarcosServicio();
//      Barco barcoNormal = sv.crearBarcos();
//      BarcoMotor barcoMotor = sv.barcoMotor();
//      Velero velero = sv.barcoVelero();
//      Yate yate = sv.crearYate();
      Alquiler alquilerGral = new Alquiler();
      alquilerGral.crearAlquiler();
        System.out.println(alquilerGral);
       ArrayList<Barco> listaBarcos = sv.listaBarcos();
        alquilerGral.costoTotal(listaBarcos);
        
                  
        }
      
      
      
      
//        System.out.println(barcoNormal);
//        System.out.println(barcoMotor);
//        System.out.println(velero);
//        System.out.println(yate);
    }


