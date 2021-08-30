package com.mycompany.egg_oop_02;

import java.util.Scanner;

public class circunferencia {

    double radio;
    double area;
    double perimetro;

    public circunferencia() {

    }

    public circunferencia(double radio, double area, double perimetro) {
        this.radio = radio;
        this.area = area;
        this.perimetro = perimetro;
    }

    public void pedirRadio() {
        Scanner lectura = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el radio");
        radio = lectura.nextInt();

    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public float calcularArea() {
        area = Math.PI * Math.pow(radio, 2);
        return (float) area;
    }

    public float calcularPerimetro() {
        perimetro = 2 * Math.PI * radio;
        return (float) perimetro;
    }

}
