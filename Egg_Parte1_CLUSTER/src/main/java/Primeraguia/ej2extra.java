package Primeraguia;


import java.util.Scanner;
//Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a
//cada una. A continuación, realizar las instrucciones necesarias para que: B tome el
//valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
//Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una
//variable auxiliar.

public class ej2extra {

    public static void main(String[]args) {
        Scanner lectura= new Scanner(System.in);
    int aux1,aux2,aux3,aux4,aux5;
    aux1 = lectura.nextInt();
    aux2 = lectura.nextInt();
    aux3 = lectura.nextInt();
    aux4 = lectura.nextInt();
    aux5 = lectura.nextInt();
    
    subprograma(aux1,aux2,aux3,aux4,aux5);
    
    
    
    
    
    }
    public static void subprograma(int A,int B, int C, int D,int E){
       E = D;
       D = A;
       A = E;
       E = B;
       B = C;
       C = D;
       D = E;
       
       
       
        
        
        
        System.out.println((A)+""+""+(B)+""+""+(C)+""+""+(D) +"");
        
    }
    
}
