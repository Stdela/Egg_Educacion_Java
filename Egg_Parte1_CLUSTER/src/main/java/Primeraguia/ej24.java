package Primeraguia;


import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;
import java.util.Scanner;

public class ej24 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int n, undi = 0, dosdi = 0, tresdi = 0, cuatrodi = 0, cincodi = 0;

        n = lectura.nextInt();
        int[] aux1 = new int[n];
        for (int i = 0; i < n - 1; i++) {
            aux1[i] = (int) (Math.random() * 100000);
        }

        for (int i = 0; i < n - 1; i++) {
            if (aux1[i] > 0 && aux1[i] < 10) {
                undi = undi + 1;
            } else if (aux1[i] >= 10 && aux1[i] < 100) {
                dosdi = dosdi + 1;
            } else if (aux1[i] >= 100 && aux1[i] < 1000) {
                tresdi = tresdi + 1;
            } else if (aux1[i] >= 1000 && aux1[i] < 10000) {
                cuatrodi = cuatrodi + 1;
            } else if (aux1[i] >= 10000 && aux1[i] < 100000) {
                cincodi = cincodi + 1;

            }

        }
        System.out.println("Los números de un dígito son " + undi);
        System.out.println("Los números de dos dígitos son " + dosdi);
        System.out.println("Los números de tres dígitos son " + tresdi);
        System.out.println("Los números de cuatro dígitos son " + cuatrodi);
        System.out.println("Los números de cinco dígitos son " + cincodi);
    }
}
