package Herencia.ej4;

import java.util.Scanner;

public class CalculoFormasMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(8.10, 10);
        Circulo circulo1 = new Circulo(4, 8.30);
        rectangulo1.calcularArea();
        rectangulo1.calcularPerimetro();
        circulo1.calcularArea();
        circulo1.calcularPerimetro();
    }

}
