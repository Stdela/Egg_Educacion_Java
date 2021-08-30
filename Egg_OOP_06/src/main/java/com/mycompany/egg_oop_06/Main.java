package com.mycompany.egg_oop_06;


public class Main {
public static void main(String[]args){
    ServicioCadena sc = new ServicioCadena();
    Cadena cadena1 = sc.crearCadena();
    sc.mostrarVocales(cadena1);
    sc.invertirFrase(cadena1);
    sc.vecesRepetido(cadena1);
    sc.compararLongitud(cadena1);
    sc.unirCadenas(cadena1);
    sc.reemplazar(cadena1);
    sc.contiene(cadena1);
    if(sc.contiene(cadena1) == true){
        System.out.println("El caracter ingresado está contenido");
    } else{
        System.out.println("El caracter ingresado no está contenido");
    }
}

}
