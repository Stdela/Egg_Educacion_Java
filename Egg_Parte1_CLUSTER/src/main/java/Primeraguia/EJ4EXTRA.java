package Primeraguia;


import java.util.Scanner;


public class EJ4EXTRA {

    public static void main(String[]args) {
        Scanner lectura= new Scanner(System.in);
        String a;
        int b;
        a = lectura.nextLine();
        b = lectura.nextInt();
        subprograma1(a,b);
        
    }
    public static void subprograma1(String a, int b){
        if (a.equals("A")) {
            System.out.println("Usted es un socio de tipo A, el costo de su tratamiento es de " + b + " Por ser un cliente de primer nivel, el costo de su tratamiento es de" + b/2);
        } else if(a.equals("B")) {
            System.out.println("Usted es un socio de tipo B, el costo de su tratamiento es de " + b+ " Por ser un cliente de segundo nivel, el costo de su tratamiento es de " + b/3);
        }else{
            System.out.println("El costo de su tratamiento es de "+ b+ "salu2");
        }
    }
}
