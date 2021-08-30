/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relaciones.EJ1;

import java.util.ArrayList;

/**
 *
 * @author delam
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Perro> ArrayPerros = new ArrayList<>();
        Perro perrote = new Perro("Marco", "Gran Danés", 4, 2);
        Perro perrito = new Perro("Pucci", "Caniche", 8, 1);
        Perro perrito2 = new Perro("Joe", "Pitbull", 2, 2);
        Perro perrito3 = new Perro("Jotaro", "Doberman", 10, 1);
        Perro perrito4 = new Perro("Martin", "Labrador", 8, 1);
        ArrayPerros.add(perrote);
        ArrayPerros.add(perrito);
        ArrayPerros.add(perrito2);
        ArrayPerros.add(perrito3);
        ArrayPerros.add(perrito4);
        Persona cliente1 = new Persona("Martita", "Martinez", 10, 4030309);
        Persona cliente2 = new Persona("Hugo", "Delamer", 74, 10000001);
        Persona cliente3 = new Persona("Santiago", "Delamer", 23, 40909);
        Persona cliente4 = new Persona("Valeria", "Adorni", 48, 24392);
        Persona cliente5 = new Persona("Charly", "Mercury", 54, 120102);
        Distribuidor distribuirPerros = new Distribuidor(ArrayPerros);
        distribuirPerros.setearDueños(cliente1);
        distribuirPerros.setearDueños(cliente2);
        distribuirPerros.setearDueños(cliente3);
        distribuirPerros.setearDueños(cliente4);
        distribuirPerros.setearDueños(cliente5);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
        System.out.println(cliente5);
    }

}
