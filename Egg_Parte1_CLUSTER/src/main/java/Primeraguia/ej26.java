package Primeraguia;


import java.util.Scanner;

public class ej26 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int n;
        int rober, auxilio1;
        auxilio1 = 0;
        n = lectura.nextInt();
        int[][] aux1 = new int[n][n];
        System.out.println("Muy bien, el tamaño de aux1 es" + n);
        int[][] aux2 = new int[n][n];
        System.out.println("Muy bien, el tamaño de aux2 es" + n);
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                aux1[i][j] = lectura.nextInt();
                System.out.println("El tamaño de la variable aux1 es " + aux1[i][j]);
                System.out.print(aux1[i][j]);
                aux2[i][j] = lectura.nextInt();
                System.out.println("El tamaño de la variable aux2 es " + aux2[i][j]);
                System.out.print(aux2[i][j]);

            }
            System.out.println("");
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.println(aux1[i][j] - aux2[i][j]);
                rober = (aux1[i][j] - aux2[i][j]);
                if (rober > 0) {
                    auxilio1 = auxilio1 + 1;
                }
            }
        }
        if (auxilio1 == 0) {
            System.out.println("BIEN, LA MATRIZ ES SIMÉTRICA");
        } else {
            System.out.println("OH NO, LA MATRIZ ES ASIMÉTRICA O BLABLA, LOS ERRORES REGISTRADOS SON " + auxilio1);
        }
    }
}
