package Primeraguia;

import java.util.Scanner;

public class ej11 {

    public static void main(String[] args) {
        String palabra, comparador = "a", aux1;
        Scanner frase = new Scanner(System.in);
        palabra = frase.nextLine();
        aux1 = palabra.substring(0, 1);
        if (aux1.equals(comparador))     {
            System.out.println("La palabra inicia con a");
        }else {
                    System.out.println("La palabra no inicia con a");
                }

    }
}
