package Primeraguia;


import java.util.Scanner;

public class ej3_extra {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String a;
        System.out.println("Ingrese una vocal, es importante que se ingrese en MAYÚSCULAS");
        a = lectura.nextLine();
        subprograma1(a);

    }

    public static void subprograma1(String a) {
        if (a.equals("A")) {
            System.out.println("Es una vocal");
        } else if (a.equals("E")) {
            System.out.println("Es una vocal");
        } else if (a.equals("I")) {
            System.out.println("Es una vocal");
        } else if (a.equals("O")) {
            System.out.println("Es una vocal");
        } else if (a.equals("U")) {
            System.out.println("Es una vocal");
        } else {
            System.out.println("No es una vocal");

        }
    }

}
