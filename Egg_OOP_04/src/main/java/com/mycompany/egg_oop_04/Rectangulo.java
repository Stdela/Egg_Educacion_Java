package com.mycompany.egg_oop_04;

import java.util.Scanner;

public class Rectangulo {

    int base;
    int altura;

    public Rectangulo() {
    }
    Scanner lectura = new Scanner(System.in);

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void pedirDatos() {
        System.out.println("Ingrese el tamaño de la base");
        base = lectura.nextInt();
        System.out.println("Ingrese altura");
        altura = lectura.nextInt();
    }

    public void Superficie() {
        System.out.println("La superficie es" + base * altura);
    }

    public void Perimetro() {
        System.out.println("El perímetro es" + 2 * (base + altura));
    }

    public void DibujoRectangulo() {
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                if (i == 0 || i == base - 1 || j == 0 || j == altura - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println(" ");
        }

    }
}
