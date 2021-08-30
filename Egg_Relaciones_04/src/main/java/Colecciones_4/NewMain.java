package relaciones.ejercicio04;

import java.util.Scanner;

/**
 *
 * @author Cesar Gomez
 */
public class NewMain {

    /**
     * Realizar una baraja de cartas españolas orientada a objetos. Una carta
     * tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo
     * (espadas, bastos, oros y copas). Esta clase debe contener un método
     * toString() que retorne el número de carta y el palo. La baraja estará
     * compuesta por un conjunto de cartas, 40 exactamente. Las operaciones que
     * podrá realizar la baraja son: 9 • barajar(): cambia de posición todas las
     * cartas aleatoriamente. • siguienteCarta(): devuelve la siguiente carta
     * que está en la baraja, cuando no haya más o se haya llegado al final, se
     * indica al usuario que no hay más cartas. • cartasDisponibles(): indica el
     * número de cartas que aún se puede repartir. • darCartas(): dado un número
     * de cartas que nos pidan, le devolveremos ese número de cartas. En caso de
     * que haya menos cartas que las pedidas, no devolveremos nada, pero debemos
     * indicárselo al usuario. • cartasMonton(): mostramos aquellas cartas que
     * ya han salido, si no ha salido ninguna indicárselo al usuario •
     * mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se
     * saca una carta y luego se llama al método, este no mostrara esa primera
     * carta.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Baraja b1 = new Baraja();
        System.out.println("creamos el mazo");
        b1.crearMazo();
        b1.barajar();
        b1.siguienteCarta();
        b1.siguienteCarta();
        System.out.println("Cartas del monton");
        b1.cartasMonton();
        System.out.println("Cartas disponibles");
        b1.cartasDisponibles();
        b1.darCartas(39);
        System.out.println("Damos las cartas");
        b1.darCartas(38);
        System.out.println("Pedimos mas cartas");
        b1.siguienteCarta();

    }

}
