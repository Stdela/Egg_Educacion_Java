package com.mycompany.egg_oop_10;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        MesSecreto mes1 = new MesSecreto();
        System.out.println(mes1);
        mes1.adivinarMes(mes1);

    }

}
