/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.egg_oop_08;

/**
 *
 * @author delam
 */
public class Main {

    public static void main(String[] args) {
        ServicePersona1 sp1 = new ServicePersona1();
        Persona persona1 = sp1.crearPersona1();
        sp1.calcularEdad(persona1);
        sp1.menorQue(persona1);
        sp1.mostrarMetodo(persona1);
    }
}
