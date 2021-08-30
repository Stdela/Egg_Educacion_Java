package Primeraguia;


import java.util.Scanner;

public class ej23 {

    public static void main(String[] args) {
        int n, auxilio;
        Scanner lectura = new Scanner(System.in);
        n = lectura.nextInt();
        int[] aux1;
        aux1 = new int[n];
        for (int j = 0; j < n - 1; j++) {
            aux1[j] = (int) (Math.random() * 10);
        }
        System.out.println("Ingrese un número a buscar");
        auxilio = lectura.nextInt();
        for (int i = 0; i < n - 1; i++) {
            if (aux1[i] == auxilio) {
                System.out.println("Número encontrado! se encuentra en la posición " + i);

            }
        }

    }

}
