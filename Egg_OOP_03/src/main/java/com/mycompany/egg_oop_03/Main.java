package com.mycompany.egg_oop_03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Operacion op = new Operacion();
        op.llenarNumeros();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();

    }

}
