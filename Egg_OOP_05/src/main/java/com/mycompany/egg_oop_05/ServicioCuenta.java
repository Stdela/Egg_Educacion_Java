package com.mycompany.egg_oop_05;

import java.util.Scanner;

public class ServicioCuenta {

    Scanner lectura = new Scanner(System.in).useDelimiter("\n");

    public Cuenta crearCuenta() {

        Cuenta cuenta1 = new Cuenta();
        System.out.println("Ingrese el saldo");
        cuenta1.setSaldo(lectura.nextInt());
        System.out.println("Ingrese número de cuenta");
        cuenta1.setNumeroCuenta(lectura.nextInt());
        System.out.println("Ingrese documento");
        cuenta1.setDocumento(lectura.nextInt());
        return cuenta1;

    }

    public void Ingreso(Cuenta cuenta1) {
        int sumar = lectura.nextInt();
        cuenta1.setIngresar(sumar + cuenta1.getSaldo());
        System.out.println("Se ha ingresado la cantidad solicitada, su nuevo saldo es de" + cuenta1.getIngresar());

    }

    public void Retirar(Cuenta cuenta1) {
        int restar = lectura.nextInt();
        if (cuenta1.getSaldo() > restar) {
            cuenta1.setRetirar(cuenta1.getSaldo() - restar);
        } else {
            cuenta1.setSaldo(0);

        }
        System.out.println(cuenta1.getSaldo());

    }

    public void extRap(Cuenta cuenta1) {
        System.out.println("Ingrese una cantidad menor al 20% de sus fondos");
        int restar = lectura.nextInt();
        if (restar > (cuenta1.getSaldo() * 100) / 20) {
            System.out.println("Cantidad no válida");

        } else {
            cuenta1.setSaldo(-restar);
        }
        System.out.println(cuenta1.getSaldo());
    }

    public void consultarSaldo(Cuenta cuenta1) {
        System.out.println(cuenta1.getSaldo());
    }

}
