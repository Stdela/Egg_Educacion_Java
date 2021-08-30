package Primeraguia;

import java.util.Scanner;

public class ej17 {

    public static void main(String[] args) {
        int correcta = 0, incorrecta = 0, incorrecta2;
        incorrecta2 = 0;
        String aux1;
        System.out.println("Bienvenido, ingrese preferiblemente una serie de 5 cifras y donde el primer caracter empiece con X y termine con O");
        Scanner lectura = new Scanner(System.in);
        do {
            aux1 = lectura.nextLine();
            if (aux1.substring(0, 1).equals("X") && (aux1.substring(4, 5).equals("O") && aux1.length() == 5)) {
                correcta = correcta + 1;
            } else {
                incorrecta2 = incorrecta2 + 1;
            }
        } while (!"&&&&&".equals(aux1));

        System.out.println("Veces que se ingresó una variable correcta " + correcta + "Veces que se ingresó una variable incorrecta " + (incorrecta2 - 1));

    }
}
