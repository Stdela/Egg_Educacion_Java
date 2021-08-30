package Primeraguia;


import java.util.Scanner;

public class ej17extra {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int n, aux1 = 0;
        n = lectura.nextInt();
        int[] vector1 = new int[n];
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < n; j++) {
                vector1[j] = lectura.nextInt();
                aux1 = vector1[j] + aux1;

            }

        }
        System.out.println("La suma de todos los vectores es igual a " + aux1);              

    }
    
}
