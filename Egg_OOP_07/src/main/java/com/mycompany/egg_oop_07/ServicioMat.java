/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.egg_oop_07;

import java.util.Random;

/**
 *
 * @author delam
 */
public class ServicioMat {

    Random rand = new Random();

    public Matematica llenarNumeros() {
        Matematica mats = new Matematica();
        mats.setNum1(rand.nextInt(1000));
        System.out.println(mats.getNum1());
        mats.setNum2(rand.nextInt(1000));
        System.out.println(mats.getNum2());

        return mats;

    }

    public void devolverMayor(Matematica mats) {
        int comparador;
        System.out.println(mats.getNum1().compareTo(mats.getNum2()));

    }

    public void calcularPotencia(Matematica mats) {
        if (mats.getNum1() > mats.getNum2()) {
            System.out.println(Math.pow(mats.getNum1(), mats.getNum2()));
        } else {
            System.out.println(Math.pow(mats.getNum2(), mats.getNum1()));
        }

    }

    public void calcularRaiz(Matematica mats) {
        if (mats.getNum1() > mats.getNum2()) {
            System.out.println(Math.sqrt(mats.getNum1()));
        } else {

            System.out.println(Math.sqrt(mats.getNum2()));
        }
    }
}
