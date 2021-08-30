package Primeraguia;

import java.util.Scanner;

public class ej7 {

    public static void main(String[] args) {
        int num1;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese un número");
        num1 = lectura.nextInt();
        if ((num1 % 2) == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }

    }
}
