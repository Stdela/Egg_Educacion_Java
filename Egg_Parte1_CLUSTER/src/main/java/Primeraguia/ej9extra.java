package Primeraguia;


import java.util.Scanner;


public class ej9extra {

    public static void main(String[]args) {
        Scanner lectura= new Scanner(System.in);
   int a,b;
   a = lectura.nextInt();
   b = lectura.nextInt();
   subprograma1(a,b);
   
        
    }
   public static void subprograma1(int a, int b){ 
int aux1, aux2;
aux1= 0;
       do {
           a = (a-b);
           aux1 = aux1 + 0;
           } while (a>b);
       
        System.out.println("Dado que " + a + "es menor que " + b + "No se puede continuar. El cociente es " + aux1);
  
   
   
   
   }
}

   
