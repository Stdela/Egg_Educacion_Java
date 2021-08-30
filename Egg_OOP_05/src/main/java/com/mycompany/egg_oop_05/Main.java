/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.egg_oop_05;

/**
 *
 * @author delam
 */
public class Main {

    public static void main(String[] args) {
        ServicioCuenta sc = new ServicioCuenta();
        Cuenta cuenta1 = sc.crearCuenta();

        sc.Ingreso(cuenta1);
        sc.Retirar(cuenta1);
        sc.extRap(cuenta1);
        sc.consultarSaldo(cuenta1);
        cuenta1.toString();
        

    }

}
