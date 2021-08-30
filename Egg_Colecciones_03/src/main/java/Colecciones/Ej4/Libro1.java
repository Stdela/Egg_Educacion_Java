/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones.Ej4;

/**
 *
 * @author delam
 */
public class Libro1{

     
private String nombre;
private String autor;
private int ejemplares;
private int ejemplaresPrestados;

    public Libro1() {
    }

    public Libro1(String nombre, String autor, int ejemplares, int ejemplaresPrestados) {
        this.nombre = nombre;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(int ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public void printItems(){
        System.out.println(this.autor + ""+ this.nombre +""+ this.ejemplares+ ""+ this.ejemplaresPrestados);
    }

    
    
    

}

