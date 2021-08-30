package Primeraguia;
// ESTE EJERCICIO ESTÁ MAL, NO HACER CON TRUE
import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args){
   int lecturanum;
   boolean variable1;
   variable1= true;
    Scanner lectura = new Scanner(System.in);
    while (true){
        System.out.println("Ingrese un número entre 1 y 10");
        lecturanum = lectura.nextInt();
        if (lecturanum>10 || lecturanum< 0) {
            System.out.println(" Error, ingrese un número entre 1 y 10");
        }
    }
    }
}

    
        

        
         
       
