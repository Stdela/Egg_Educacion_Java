package Colecciones.Ej2;

import java.util.Scanner;
import java.util.ArrayList;

public class Ej2 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Numbers numeros = new Numbers();
        while (true) {

            int num = lectura.nextInt();
            if (num == -99) {
                break;
            }
            numeros.leerValores(new Numbers(num));

        }
        System.out.println(numeros.CalcularSuma());
        numeros.mostrarResultados();
    }
}
