package Primeraguia;


import java.util.Scanner;

public class ej25 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        int n;
        n = lectura.nextInt();
        int[][] aux1 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                aux1[i][j] = (int) (Math.random()*10);

            }
        }
for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(aux1[i][j]);

            }
            System.out.println("");
    }
}
}
