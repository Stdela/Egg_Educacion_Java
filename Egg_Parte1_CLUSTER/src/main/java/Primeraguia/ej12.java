
package Primeraguia;

import java.util.Scanner;


public class ej12 {
public static void main(String[] args){
    int varMotor;
    Scanner LecturaNum = new Scanner(System.in);
    System.out.println("Ingrese un número");
    varMotor = LecturaNum.nextInt();
    switch(varMotor){
        case 1: 
            System.out.println("La bomba es una bomba de agua");
           break;
        case 2:
            System.out.println("La bomba es una bomba de gasolina");
            break;
        case 3: 
            System.out.println("La bomba es una bomba de hormigón");
            break;
        case 4:
            System.out.println("La bomba es una bomba de pasta alimentica");
            default:
                System.out.println("No existe un valor válido para este tipo de bomba");
    }
         
}  
}
