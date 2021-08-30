package com.mycompany.egg_oop_10;

import java.util.Scanner;
import java.util.ArrayList;

public class MesSecreto {

    private String[] Mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    private String mesSecreto = Mes[8];

    public MesSecreto() {
    }

    public MesSecreto(String[] Mes, String mesSecreto) {
        this.Mes = Mes;
        this.mesSecreto = mesSecreto;
    }

    public String[] getMes() {
        return Mes;
    }

    public void setMes(String[] Mes) {
        this.Mes = Mes;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    @Override
    public String toString() {
        return "MesSecreto{" + "Mes=" + Mes + ", mesSecreto=" + mesSecreto + '}';
    }

    public void adivinarMes(MesSecreto Mes) {
        System.out.println("Ingrese el nombre de un mes!");
        Scanner lectura = new Scanner(System.in);
        String aux1 = lectura.nextLine();
        if (aux1.equals(this.mesSecreto)) {
            System.out.println("Correcto!!!");
        } else {
            System.out.println("Incorrecto, vuelva a intentar");
        }
    }
}
