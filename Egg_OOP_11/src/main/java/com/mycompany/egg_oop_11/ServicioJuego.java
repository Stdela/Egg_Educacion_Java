package com.mycompany.egg_oop_11;

import java.util.Scanner;
import java.util.ArrayList;

public class ServicioJuego {

    Scanner lectura = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego() {

        System.out.println("Ingrese la palabra a buscar");
        String palabra = lectura.next();
        System.out.println("Ingrese la cantidad máxima de jugadas");
        int jugadas = lectura.nextInt();
        String[] acomodarPalabra = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            acomodarPalabra[i] = palabra.substring(i, i + 1);

        }
        Ahorcado ahorcado1 = new Ahorcado(acomodarPalabra, jugadas, 0);
        return ahorcado1;

    }

    public int mostrarLongitud(Ahorcado ahorcado1) {
        System.out.println("La longitud de la palabra es de" + ahorcado1.getPalabra().length);
        return ahorcado1.getPalabra().length;
    }

    public boolean buscarLetra(Ahorcado ahorcado1) {
        System.out.println("Ingrese una letra a buscar");
        String letra = lectura.next();
        int aux1 = 0;

        for (int i = 0; i < ahorcado1.getPalabra().length; i++) {
            if (ahorcado1.getPalabra()[i].equals(letra)) {

                aux1++;
            }

        }

        if (aux1 > 0) {
            System.out.println("La cantidad de letras que han sido encontradas en esta ronda es " + aux1);
            ahorcado1.setLetrasEncontradas(ahorcado1.getLetrasEncontradas() + aux1);
            System.out.println("La cantidad de letras que han sido encontradas en total es " + ahorcado1.getLetrasEncontradas());
            if (ahorcado1.getLetrasEncontradas() == this.mostrarLongitud(ahorcado1)) {
                System.out.println("FELICIDADES, HA GANADO");
                ahorcado1.setLetrasEncontradas(99);

            }
            aux1 = 0;

            return true;

        } else {
            ahorcado1.setJugadasMaximas(ahorcado1.getJugadasMaximas() - 1);
            System.out.println("La palabra no se encuentra!! Le quedan " + ahorcado1.getJugadasMaximas() + " intentos");
            if (ahorcado1.getJugadasMaximas() < 0) {
                System.out.println("FIN DEL JUEGO");
            }

            aux1 = 0;
            return false;
        }

    }
}
