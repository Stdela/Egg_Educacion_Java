/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relaciones.EJ1;

import java.util.ArrayList;

/**
 *
 * @author delam
 */
public class Perro {

    private String nombre;
    private String raza;
    private Integer edad;
    private Integer tamanio;

    public Perro() {

    }

    public Perro(String nombre, String raza, Integer edad, Integer tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getTamanio() {
        return tamanio;
    }

    public void setTamanio(Integer tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Su mascota es " + nombre + ", es un  " + raza + ". Tiene " + edad + " años con " + tamanio + " metros de largo";
    }

}
