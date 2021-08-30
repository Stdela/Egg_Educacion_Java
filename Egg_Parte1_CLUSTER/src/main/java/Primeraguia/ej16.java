package Primeraguia;

import java.util.Scanner;

public class ej16 {

    public static void main(String[] args) {
        int aux1, aux2;
        aux1 = 0;
        Scanner lectura = new Scanner(System.in);
        for (int i = 0; i <= 20; i++) {
            aux2 = lectura.nextInt();
            if (aux2 == 0) {
                System.out.println("Usted ha ingresado 0, a continuación se romperá el programa");
                break;
            }
            if (aux2 <= 1) {
                aux1 = aux2 + aux1;
            }
        }
        System.out.println("La suma de todos los números es" + aux1);
    }
}
