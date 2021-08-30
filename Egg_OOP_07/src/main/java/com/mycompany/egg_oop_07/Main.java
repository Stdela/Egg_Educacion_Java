/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.egg_oop_07;

/**
 *
 * @author delam
 */
public class Main {
    public static void main(String[] args){
        ServicioMat sm = new ServicioMat();
        Matematica mat = sm.llenarNumeros();
        sm.devolverMayor(mat);
        sm.calcularPotencia(mat);
        sm.calcularRaiz(mat);
    }
}
