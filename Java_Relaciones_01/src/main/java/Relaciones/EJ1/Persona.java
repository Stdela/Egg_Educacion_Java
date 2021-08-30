/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//nombre, apellido, edad, documento y Perro.
package Relaciones.EJ1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author delam
 */
public class Persona {

    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer documento;
    private Perro perrito;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, Integer documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public Perro getPerrito() {
        return perrito;
    }

    public void setPerrito(Perro perrito) {
        this.perrito = perrito;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + edad + " años, DNI: " + documento + "\n Perro : " + perrito;
    }

}
