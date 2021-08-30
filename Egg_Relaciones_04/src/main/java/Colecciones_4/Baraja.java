/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones.ejercicio04;

import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.Collections;

/*
    * @param args the command line arguments
 * @author Cesar Gomez
 */
public class Baraja {

    ArrayList<Carta> mazo = new ArrayList();
    ArrayList<Carta> cartasUsadas = new ArrayList();

    public void crearMazo() {
        String[] palos = {"basto", "oro", "espada", "copa"};
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 12; j++) {
                if (j == 8) {
                    j = 10;
                }
                Carta c = new Carta(j, palos[i]);
                this.mazo.add(c);
            }
        }
    }

    public void barajar() {
        Collections.shuffle(mazo);
    }

    public void siguienteCarta() {
//        Carta aux = new Carta();
        if (!(mazo.isEmpty())) { //Preguntamos si la lista esta vacia (devuelve falso cuando la lista este vacia por estar negado)
            System.out.println(this.mazo.get(0));
            this.cartasUsadas.add(this.mazo.get(0));
            this.mazo.remove(0);
        } else {
            System.out.println("No hay mas cartas en el mazo");
        }
    }

    public void cartasDisponibles() {
        System.out.println(this.mazo.size());
    }

    public void darCartas(int cantidad) {
        if (cantidad > mazo.size()) {
            System.out.println("No hay cartas suficientes");

        } else {
            while (cantidad > 0) {
                this.siguienteCarta();
                cantidad--;
            }
        }

    }

    public void cartasMonton() {
        if (!(this.cartasUsadas.isEmpty())) {
            System.out.println("Estas cartas ya se usaron");
            for (Carta cartasUsada : cartasUsadas) {
                System.out.println(cartasUsada);
            }
        } else {
            System.out.println("Todavia no se usaron");
        }
    }

    public void mostrarBaraja() {
        System.out.println(this.mazo);
    }
}
