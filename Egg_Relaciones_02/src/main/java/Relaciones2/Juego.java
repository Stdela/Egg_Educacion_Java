package Relaciones2;

//Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de
import java.util.ArrayList;


public class Juego {

    private ArrayList<Jugador> jugadores;
    private Revolver revolver;

    public Juego() {
        this.jugadores = new ArrayList<>();
    }

    public Juego(Revolver revolver) {
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver + '}';
    }

    public void llenarJuego(Jugador jugadores) {
        this.jugadores.add(jugadores);
    }

    public boolean ronda(Juego juego) {
        int aux1 = 0;
        int rondas = 0;
        while (aux1 == 0) {

            for (Jugador jugador : jugadores) {
                jugador.disparo(revolver);
                rondas++;
                if (jugador.disparo(revolver) ==true){
                System.out.println("Jugador encontrado" + jugador);
                    System.out.println(rondas);
                aux1++;
                break;
        }
    }
            
    }
        return true;
    }
}



