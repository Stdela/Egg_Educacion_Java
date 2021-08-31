package Herencia.ej2_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElectrodomesticoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   List<Electrodomestico> electrodomesticosPrecios = new ArrayList<>(); 
        Lavadora lavadora1 = new Lavadora();
        lavadora1.crearLavadora(45);
        Lavadora lavadora2 = new Lavadora();
        lavadora2.crearLavadora(10);
        Televisor televisor1 = new Televisor();
        televisor1.crearTelevisor(80, true);
        Televisor televisor2 = new Televisor();
        televisor2.crearTelevisor(25, false);
        electrodomesticosPrecios.add(televisor2);
        electrodomesticosPrecios.add(televisor1);
        electrodomesticosPrecios.add(lavadora1);
        electrodomesticosPrecios.add(lavadora2);
        int aux1 = 0;
        for (Electrodomestico electrodomestico : electrodomesticosPrecios) {
            electrodomestico.precioFinal1();
            aux1 += electrodomestico.getPrecio();
            System.out.println(electrodomestico.getPrecio());
        }
        System.out.println("El precio final de todos los productos es "+ aux1);       
    }

}
