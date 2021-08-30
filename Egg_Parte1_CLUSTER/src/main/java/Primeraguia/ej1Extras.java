package Primeraguia;

import java.util.Scanner;


public class ej1Extras {
//Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si
//el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2
//horas
    public static void main(String[]args) {
        Scanner lectura= new Scanner(System.in);
    int n;
    n = lectura.nextInt();
     llenarvector(n);
      

    
    
    
    
    
    
    
    }
    public static void llenarvector(int n) {
        int aux1, aux2;       
        aux1 = n/60;
        aux2 = aux1%24;
        aux1 = aux1/24;
        System.out.println(aux2);
        aux1 = (int)(Math.floor(aux1));
        System.out.println("Al final, los minutos ingresados corresponden a un total de  " + aux1+ " días y " +aux2+ "horas" );
        
      
        
        
       
        
        
        
        
            
        {
    }
    
}
}
