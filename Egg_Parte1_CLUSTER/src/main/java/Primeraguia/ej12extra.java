package Primeraguia;


import java.util.Scanner;

public class ej12extra {

public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        int n;
        System.out.println("Ingrese la altura de la escalera: ");
        n = lectura.nextInt();

        escalera(n);
}
    public static void escalera(int n) {
        
        for (int i = 1; i < n+2; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
}
}
