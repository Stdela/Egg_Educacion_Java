package Primeraguia;


import java.util.Scanner;


public class ej20 {
    public static void main(String[] args){
    Scanner lectura = new Scanner(System.in);
    int aux1;      
    
    for(int i=0; i<4; i++){
    aux1 = lectura.nextInt();
    if(aux1>20 || aux1 < -1){
        break;
    }
        System.out.print(aux1);
        for(int j = 0; j< aux1; j++){
            System.out.print("*");
            
        }
        
    }          
}
}
