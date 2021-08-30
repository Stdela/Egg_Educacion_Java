package Primeraguia;


import java.util.Scanner;

public class ej27 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int n, contador1 = 0, contador2 = 0;
        n = lectura.nextInt();
        int[][] aux1 = new int[n][n];
        System.out.println("Llenamos la matriz");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                aux1[i][j] = lectura.nextInt();
            }
            System.out.println("");
        }
        System.out.println("Sumamos la fila 1");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < n; j++) {
                contador1 = contador1 + aux1[i][j];
                System.out.println("El valor de contador1 es " + contador1);
                System.out.println(aux1[i][j]);

            }
            System.out.println("");
        }
        contador2 = contador1;
        System.out.println("La fila 1 vale" + contador2);
        contador1 = 0;
        System.out.println("sumamos primer diagonal");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    contador1 = aux1[i][j] + contador1;

                }
            }

        }
        System.out.println(contador1);
        if (contador1 == contador2) {
            System.out.println("Vamos bien! Contador1 vale lo mismo que contador2");
        } else {
            System.out.println("Vamos mal. El contador 1 vale " + contador1 + " Por otro lado, el contador 2, es decir fila 1 vale " + contador2);
            contador2 = 1;
        }
        contador1 = 0;
        System.out.println("sumamos la primer columna");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 1; j++) {
                contador1 = contador1 + aux1[i][j];
                System.out.println("El valor de contador1 es " + contador1);
                System.out.println(aux1[i][j]);
            }

        }
        if (contador1 == contador2) {
            System.out.println("Vamos bien! Contador1 vale lo mismo que contador2");
        } else {
            System.out.println("Vamos mal. El contador 1 vale " + contador1 + " Por otro lado, el contador 2, es decir fila 1 vale " + contador2);
            contador2 = 1;
        }
        contador1 = 0;
        System.out.println("sumamos la diagonal opuesta");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == (n - 1)) {
                    System.out.println(aux1[i][j]);
                    contador1 = contador1 + aux1[i][j];

                }

            }

        }
        if (contador1 == contador2) {
            System.out.println("Vamos bien! Contador1 vale lo mismo que contador2");
        } else {
            System.out.println("Vamos mal. El contador 1 vale " + contador1 + " Por otro lado, el contador 2, es decir fila 1 vale " + contador2);
            contador2 = 1;
        }
        if (contador2 == 1) {
            System.out.println("no es un cuadrado mágico");

        } else {
            System.out.println("CUADRADO MÁGICO, POGGERS");
        }

    }
}
