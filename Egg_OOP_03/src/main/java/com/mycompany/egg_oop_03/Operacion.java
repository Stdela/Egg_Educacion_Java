package com.mycompany.egg_oop_03;

import java.util.Scanner;

public class Operacion {

    private int numero1;
    private int numero2;

    public Operacion() {

    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void llenarNumeros() {
        Scanner lectura = new Scanner(System.in).useDelimiter("\n");
        numero1 = lectura.nextInt();
        numero2 = lectura.nextInt();
    }

    public int getNumero1() {

        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {

        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void sumar() {
        System.out.println(numero1 + numero2);
    }

    public void restar() {

        System.out.println(numero1 - numero2);
    }

    public void multiplicar() {
        if (numero1 != 0 || numero2 != 0) {
            System.out.println(numero1 * numero2);
        } else {
            System.out.println("ERROR! INTENTANDO HACER OPERACIÓN CON CERO");
        }
    }

    public void dividir() {
        if (numero1 != 0 || numero2 != 0) {
            System.out.println(numero1 / numero2);
        } else {
            System.out.println("ERROR! INTENTANDO HACER OPERACIÓN CON CERO");
        }
    }
}
