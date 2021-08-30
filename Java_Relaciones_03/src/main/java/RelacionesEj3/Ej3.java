package RelacionesEj3;

import java.util.Scanner;
import java.util.ArrayList;

public class Ej3 {

    public static void main(String[]args) {
        ArrayList<Espectador> espectadores = new ArrayList<>();
        Scanner lectura= new Scanner(System.in);
     Espectador ep1 = new Espectador("Marcos",10,2.90); 
     Espectador ep2 = new Espectador("Gabi",19,6.90); 
     Espectador ep3 = new Espectador("Santi",23,99999999.90); 
     Espectador ep4 = new Espectador("Gonza",12,7.80); 
     Espectador ep5 = new Espectador("Marcos",10,2.90);
     espectadores.add(ep1);
     espectadores.add(ep2);
     espectadores.add(ep3);
     espectadores.add(ep4);
     espectadores.add(ep5);
   
     Pelicula peli = new Pelicula("Kill Bill", 1.50, 16,"Quentin Tarantino");
     Cine elCairo = new Cine(peli,3.80,espectadores);
    elCairo.llenarArray();
//    elCairo.printAsientos();
    elCairo.sentarEspectador();
    elCairo.printAsientos();
   
    }
    
}
