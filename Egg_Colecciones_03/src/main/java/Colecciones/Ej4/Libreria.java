package Colecciones.Ej4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

public class Libreria {

    private ArrayList<Libro1> libro;

    public Libreria() {
        this.libro = new ArrayList<>();
    }

    public Libreria(ArrayList<Libro1> libro) {

        this.libro = new ArrayList<>();
    }

    public ArrayList<Libro1> getLibro() {
        return libro;
    }

    public void setLibro(ArrayList<Libro1> libro) {
        this.libro = libro;
    }
public Libro1 add(Libro1 libro){
    this.libro.add(libro);
    return libro;
}
    public boolean prestamo(Libro1 libro) {
        if (libro.getEjemplares() > 0) {
            libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() + 1);
            return true;
        } else {
            return false;
        }

    }

    public boolean devolver(Libro1 libro) {
        if (libro.getEjemplaresPrestados() > 0) {
            libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() - 1);
            libro.setEjemplares(libro.getEjemplares() + 1);
            return true;
        } else {
            return false;
        }
    }

  public void printItems(){
      for (Libro1 libro1 : this.libro) {
          System.out.println(libro1.getAutor());
          System.out.println(libro1.getNombre());
          System.out.println(libro1.getEjemplares());
          System.out.println(libro1.getEjemplaresPrestados());
      }
  }
    

}
