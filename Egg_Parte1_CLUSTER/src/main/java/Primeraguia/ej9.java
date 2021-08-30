    
package Primeraguia;

import java.util.Scanner;


public class ej9 {
   public static void main(String[] args){
       String frase, eureka = "EUREKA";
       Scanner lectura = new Scanner(System.in);
       frase = lectura.nextLine();
       if (frase.equals(eureka)){
           System.out.println("Las frases son igaules");
       } else{
               System.out.println("Las frases no son iguales");
               }
   }
}
