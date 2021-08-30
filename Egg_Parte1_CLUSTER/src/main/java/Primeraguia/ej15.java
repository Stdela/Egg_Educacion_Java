package Primeraguia;

import java.util.Scanner;

public class ej15 {

    public static void main(String[] args) {
        int aux2;
        String aux3;
        Scanner lectura = new Scanner(System.in);
        do {
            System.out.println("Menu");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5.Salir");
            aux2 = lectura.nextInt();
            if (aux2 == 5) {
                System.out.println("Está seguro que quiere salir del programa?");
                aux3 = lectura.nextLine();
                if (aux3.equals("Yes")) {
                    System.out.println("Usted ha elegido salir del programa");
                    break;
                }
            }
        } while (aux2 <= 5);
    }
}
