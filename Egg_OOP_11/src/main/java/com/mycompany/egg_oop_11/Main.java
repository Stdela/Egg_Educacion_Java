package com.mycompany.egg_oop_11;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ServicioJuego sj = new ServicioJuego();
        Ahorcado juegoAhorcado = sj.crearJuego();
//     sj.mostrarLongitud(juegoAhorcado);
//        sj.buscarLetra(juegoAhorcado);
        juego(juegoAhorcado);
    }

    public static void juego(Ahorcado juegoAhorcado) {
        int aux1 = 0;
        int aux2 = 99;
        ServicioJuego sj = new ServicioJuego();
        sj.mostrarLongitud(juegoAhorcado);
        do {
            sj.buscarLetra(juegoAhorcado);
        } while (aux1 != juegoAhorcado.getJugadasMaximas() || aux2 == juegoAhorcado.getLetrasEncontradas());
        System.out.println("Juego finalizado! Gracias vuelva prontos");

    }

}
