/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relaciones2;

/**
 *
 * @author delam
 */
//Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual
//(posición del tambor que se dispara, puede que esté el agua o no) y posición agua (la
//posición del tambor donde se encuentra el agua). Estas dos posiciones, se generarán
//aleatoriamente.
//Métodos:
//• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
//valores deben ser aleatorios.
//• mojar(): devuelve true si la posición del agua coincide con la posición actual
//• siguienteChorro(): cambia a la siguiente posición del tambor
//• toString(): muestra información del revolver (posición actual y donde está el agua)
public class Revolver {
    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
    }


    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
    
    public void llenarRevolver(){
        this.posicionActual = (int)(Math.random()*6);
        if (this.posicionActual==0) {
            this.posicionActual =1;
        }
        this.posicionAgua = 0 + (int)(Math.random()*6);
        if (this.posicionAgua == 0) {
            this.posicionAgua = 1;
        }
    }
    public boolean mojar(){
        return (this.posicionActual==this.posicionAgua);
    }
    public void siguienteChorro(){
        this.posicionActual= this.posicionActual+1;
        if (this.posicionActual>6) {
            this.posicionActual = 1;
        }
    }
    
    
}
