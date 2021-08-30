package com.mycompany.egg_oop_04;
import java.util.Scanner;


public class Main {

    public static void main(String[]args) {
        Scanner lectura= new Scanner(System.in);
        Rectangulo rec = new Rectangulo();
        rec.pedirDatos();
        rec.Superficie();
        rec.Perimetro();
        rec.DibujoRectangulo();
    }
    
}
