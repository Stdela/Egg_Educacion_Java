package Primeraguia;


import java.util.Scanner;
//Escribir un programa que lea un número entero y devuelva el número de dígitos
//que componen ese número. Por ejemplo, si introducimos el número 12345, el
//programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente
//utilizando el operador de división. Nota: recordar que las variables de tipo entero
//truncan los números o resultados

public class ej11extra {

    public static void main(String[]args) {
        Scanner lectura= new Scanner(System.in);
        int a;
        a = lectura.nextInt();
        subprograma1(a);
        
   
   
    }
    public static void subprograma1(int a){
        int aux1;
        aux1 = 0;
        do {
        a = a/10;
        aux1 = aux1 + 1;    
            
        } while (a> 0);
        System.out.println("El número está compuesto por " + aux1+ " dígitos"); 
    }
}
