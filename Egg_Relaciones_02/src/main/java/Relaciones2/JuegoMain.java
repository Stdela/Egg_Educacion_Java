package Relaciones2;

import java.util.Scanner;
import java.util.ArrayList;

public class JuegoMain {

    public static void main(String[]args) {
  ArrayList<Jugador> jugadores = new ArrayList<>();
  Revolver revolver = new Revolver();
  revolver.llenarRevolver();
  System.out.println(revolver);

  Jugador jugador1 = new Jugador(1,"Santiago",true);
     Jugador jugador2 = new Jugador(2,"Juan",true);
     Jugador jugador3 = new Jugador(3,"Jeronimo",true);
     Jugador jugador4 = new Jugador(4,"Camila",true);
     Jugador jugador5 = new Jugador(5,"Antonella",true);
     Jugador jugador6 = new Jugador(6,"Nuria",true);

     Juego juego = new Juego(revolver);
     jugadores.add(jugador1);
     jugadores.add(jugador2);
     jugadores.add(jugador3);
     jugadores.add(jugador4);
     jugadores.add(jugador5);
     jugadores.add(jugador6);
     juego.setJugadores(jugadores);
        juego.ronda(juego);
     

   
    }
    
}
