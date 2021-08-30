
package Primeraguia;

import java.util.Scanner;


public class ej14 {
public static void main(String[] args){
int aux1, aux2, aux3;
aux3 = 0;
Scanner lectura = new Scanner(System.in);
aux2 = lectura.nextInt();
do{
    aux1 = lectura.nextInt();
    aux3 = aux1 + aux3;
}while(aux2 > aux3);
    
            

}
}
