
package com.mycompany.egg_oop_01;

import java.util.Scanner;
//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
//Autor, Número de páginas, y un constructor con todos los atributos pasados por
//parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
//datos al usuario y luego informar mediante otro método el número de ISBN, el título,
//el autor del libro y el numero de págin

public class Main {
public static void main(String[] args){
    Scanner lectura = new Scanner(System.in).useDelimiter("\n");
 Libro1 libro = new Libro1();
    System.out.println("Ingrese ISBN");
 libro.setIsbn(lectura.nextInt());
    System.out.println("Ingrese el título de la obra");
 libro.setTitulo(lectura.next());
    System.out.println("Ingrese nombre del autor");
 libro.setAutor(lectura.next());
    System.out.println("ingrese el número de páginas");
 libro.setNumeroPaginas(lectura.nextInt());
    mostrarDatos(libro);
}
 public static void mostrarDatos(Libro1 libro){   
     System.out.println(libro.getIsbn());
     System.out.println(libro.getAutor());
     System.out.println(libro.getTitulo());
     System.out.println(libro.getNumeroPaginas());
}
}
