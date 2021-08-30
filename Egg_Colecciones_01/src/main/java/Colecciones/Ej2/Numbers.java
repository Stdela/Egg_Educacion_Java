/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones.Ej2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author delam
 */
public class Numbers {

    private ArrayList<Numbers> numeros;
    private int nums;

    public Numbers() {
        this.numeros = new ArrayList<>();

    }

    public Numbers(int nums) {

        this.nums = nums;
    }

    public ArrayList<Numbers> getNumeros() {
        return numeros;
    }

    public void setNumeros(ArrayList<Numbers> numeros) {
        this.numeros = numeros;
    }

    public int getNums() {
        return nums;
    }

    public void setNums(int nums) {
        this.nums = nums;
    }

    @Override
    public String toString() {
        return "Numbers{" + "numeros=" + numeros + ", nums=" + nums + '}';
    }

    public Numbers leerValores(Numbers numeros) {
        this.numeros.add(numeros);

        return numeros;
    }

    public int CalcularSuma() {
        int aux1 = 0;
        for (Numbers numero : numeros) {
            aux1 += numero.nums;
        }
        return aux1;
    }

    public void mostrarResultados() {
        for (Numbers numero : numeros) {
            System.out.println(numero);
        }
        System.out.println(this.CalcularSuma());
        System.out.println("Promedio" + (this.CalcularSuma() / this.numeros.size()));

    }

}
