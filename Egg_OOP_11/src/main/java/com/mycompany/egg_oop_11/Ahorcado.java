/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.egg_oop_11;

/**
 *
 * @author delam
 */
public class Ahorcado {

    private String palabra[];
    private int jugadasMaximas;
    private int letrasEncontradas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int jugadasMaximas, int letrasEncontradas) {
        this.palabra = palabra;
        this.jugadasMaximas = jugadasMaximas;
        this.letrasEncontradas = letrasEncontradas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", jugadasMaximas=" + jugadasMaximas + ", letrasEncontradas=" + letrasEncontradas + '}';
    }

}
