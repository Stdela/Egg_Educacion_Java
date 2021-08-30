/*Implemente la clase Persona. Una persona tiene un nombre y una fecha de
nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los
siguientes métodos:
Ejemplo Date como atributo: DateAtributo
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe
conocer la fecha actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro
otra edad y retorna true en caso de que el receptor tenga menor edad que la
persona que se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.*/
package com.mycompany.egg_oop_08;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author delam
 */
public class ServicePersona1 {

    public Persona crearPersona1() {
        Scanner lectura = new Scanner(System.in).useDelimiter("\n");
        System.out.println(" ingrese año de nacimiento");
        int anio = lectura.nextInt();
        System.out.println("ingrese mes de nacimiento");
        int mes = lectura.nextInt();
        System.out.println("ingrese día de nacimiento");
        int dia = lectura.nextInt();
        System.out.println(" ingrese el nombre de la persona ");
        String nombre = lectura.next();
        Date nacimiento = new Date(anio, mes, dia);
        Persona persona1 = new Persona(nombre, nacimiento);
        return persona1;
    }

    public void calcularEdad(Persona persona1) {
        System.out.println(" Calculando la segunda fecha");
        Date fecha2 = new Date();
        System.out.println("La persona tiene " + (Math.abs((persona1.getNacimiento().getYear() - fecha2.getYear()) - 1900)) + " años");
    }

    public boolean menorQue(Persona persona1) {
        Scanner lectura = new Scanner(System.in).useDelimiter("\n");
        System.out.println(" ingrese la edad de la segunda persona");
        int edad2 = lectura.nextInt();
        if (edad2 < persona1.getNacimiento().getYear()) {
            System.out.println("La persona ingresada es menor que la persona pasada por parámetros");
            return true;
        } else {
            System.out.println("La persona ingresada es mayor que la primera persona ingresada");
            return false;
        }

    }

    public void mostrarMetodo(Persona persona1) {
        System.out.println(persona1.getNacimiento().toString() + persona1.getNombre());
    }

}
