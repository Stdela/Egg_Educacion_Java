package Primeraguia;


import java.util.Scanner;


public class ej16extra {

    public static void main(String[]args) {
        Scanner lectura= new Scanner(System.in);
        int a;
        a = lectura.nextInt();
        subprograma1(a);
        
        
    }
    public static void subprograma1(int a){
        int aux1 = 1, aux2,aux3;
        aux2 = 0;
        aux3 = 0;
        do {
            aux2 = a%aux1;
            aux1 = aux1 + 1;
            if (aux2 == 0) {
                aux3 = aux3 + 1;
            }
        } while (aux1<=a);
        if (aux3>2) {
            System.out.println("El número no es primo");
        }else{
            System.out.println("El número es primo!");
        }
    }
    
}
