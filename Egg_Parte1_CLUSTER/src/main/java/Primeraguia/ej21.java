package Primeraguia;


import java.util.Scanner;
/*
switch(<variable>) {
case <valor1>:
<sentencias1>
break;
case <valor2>:
<sentencias2>
break;
default:
<sentencias3>
}
Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 E
* 129.852 yenes es un 1 €
*/
public class ej21 {
public static void main(String[] args){
    Scanner lectura = new Scanner(System.in);
    int aux1, dinero;
    String cambio;
    System.out.println("Inserte una cantidad de EUROS");
    dinero = lectura.nextInt();
    System.out.println("Inserte un cambio a convertir (Libras = 1,Yenes = 2,USD= 3)");
    cambio = lectura.next();
    for(int i= 0; i<1;i++){
        for(int j = 0; j<1; j++){
            aux1= Integer.valueOf(cambio);
            switch(aux1){
                case (1):
                System.out.println("son en libras "+ dinero+ "euros "+ dinero*0.86);
                break;
                case (3) :
                System.out.println(dinero+"euros "+" son en dólares "+dinero*1.28611);
                break;
                case (2) : 
                System.out.println(dinero+"euros "+" son en yenes "+dinero*129.892);
                break;
                default:
                    System.out.println("Usted no ingresó un número válido");



            }
            
            
            
            
            
            
            
            
        }
            
       
   }
    
}
}
