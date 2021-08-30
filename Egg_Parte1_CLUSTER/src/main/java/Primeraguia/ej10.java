package Primeraguia;

import java.util.Scanner;


public class ej10 {

    public static void main(String[] args) {
        String palabra;
        Scanner frase = new Scanner(System.in);
        palabra = frase.nextLine();
        // While a = 1 o a = True
        if (palabra.length() == 8) {
            System.out.println("La palabra tiene 8 caracteres");
            // a = 2 o a = False
        } else {
            System.out.println("Su palabra no tiene 8 caracteres ingrese de nuevo");
        }

    }
}
