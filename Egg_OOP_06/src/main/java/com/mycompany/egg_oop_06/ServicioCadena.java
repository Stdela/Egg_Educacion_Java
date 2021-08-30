package com.mycompany.egg_oop_06;

import java.util.Scanner;

public class ServicioCadena {

    Scanner lectura = new Scanner(System.in);

    public Cadena crearCadena() {
        int longitud;
        Cadena cadena = new Cadena();
        cadena.setFrase(lectura.nextLine());
        longitud = (cadena.getFrase()).length();
        cadena.setLongitudFrase(longitud);
        return cadena;
    }

    public void mostrarVocales(Cadena cadena) {
        int caracter = 0;

        for (int i = 0; i < cadena.getLongitudFrase(); i++) {
            if (cadena.getFrase().substring(i, i + 1).equalsIgnoreCase("A")) {
                caracter++;

            } else if (cadena.getFrase().substring(i, i + 1).equalsIgnoreCase("E")) {
                caracter++;
            } else if (cadena.getFrase().substring(i, i + 1).equalsIgnoreCase("I")) {
                caracter++;
            } else if (cadena.getFrase().substring(i, i + 1).equalsIgnoreCase("O")) {
                caracter++;
            } else if (cadena.getFrase().substring(i, i + 1).equalsIgnoreCase("E")) {
                caracter++;
            }
        }
        System.out.println(caracter);
    }

    public void invertirFrase(Cadena cadena) {
        System.out.println("La frase de forma invertida es");
        for (int i = cadena.getLongitudFrase(); i > 0; i--) {
            System.out.print(cadena.getFrase().substring(i - 1, i));
        }
    }

    public void vecesRepetido(Cadena cadena) {
        System.out.println(" ");
        System.out.println("Ingrese un caracter que crea que está repetido");
        String caracter = lectura.next();
        System.out.println(" ");
        int contador = 0;
        for (int i = 0; i < cadena.getLongitudFrase(); i++) {
            if (cadena.getFrase().substring(i, i + 1).equalsIgnoreCase(caracter)) {
                contador++;
            }

        }
        System.out.println("El caracter indicado se repite " + contador + " veces");

    }

    public void compararLongitud(Cadena cadena) {
        System.out.println("Ingrese una nueva frase para comparar");
        String frase2 = lectura.next();
        if (cadena.getLongitudFrase() > frase2.length()) {
            System.out.println("La cadena ingresada en primer lugar es mayor que la segunda");

        } else {
            System.out.println("La segunda frase ingresada es mayor que la primera");
        }
    }

    public void unirCadenas(Cadena cadena) {
        System.out.println("Ingrese una frase que quiera unir con la primera");
        String union = lectura.next();
        System.out.println(cadena.getFrase().concat(union));
    }

    public void reemplazar(Cadena cadena) {
        System.out.println("Ingrese un caracter con el cual reemplazar las letras A");
        String reemplazar = lectura.next();
        System.out.println(cadena.getFrase().replace("a", reemplazar));
//    for (int i = 0; i < cadena.getLongitudFrase(); i++) {
//        if (cadena.getFrase().substring(i, i+1).equalsIgnoreCase("A")){
//            cadena.getFrase().replace((cadena.getFrase().substring(i,i+1)),reemplazar);

    }
//        System.out.println(cadena.getFrase());

    public boolean contiene(Cadena cadena) {
        System.out.println("Ingrese un caracter a buscar");
        String letra = lectura.next();

        int aux1 = 0;
        for (int i = 0; i < cadena.getLongitudFrase(); i++) {
            if (cadena.getFrase().substring(i, i + 1).equalsIgnoreCase(letra)) {
                aux1++;
            }
        }
        if (aux1 > 0) {
            return true;

        } else {
            return false;
        }
    }
}
//    System.out.println(cadena.getFrase());

