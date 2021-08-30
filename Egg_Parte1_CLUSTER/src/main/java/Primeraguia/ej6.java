package Primeraguia;

import java.util.Scanner;

public class ej6 {

    public static void main(String[] args) {
        int num1, num2;
        Scanner lectura = new Scanner(System.in);
        num1 = lectura.nextInt();
        num2 = lectura.nextInt();
        if (num1 > num2) {
            System.out.println("El número mayor es " + num1);
        } else if (num1 == num2) {
            System.out.println("Los números son iguales");
        } else {
            System.out.println("El número mayor es " + num2);
        }
    }
}
