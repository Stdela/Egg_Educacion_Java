package Primeraguia;


import java.util.Scanner;


public class ej20extra {

    public static void main(String[]args) {
        Scanner lectura= new Scanner(System.in);
        int aux1,aux2;
        double tp1, tp2, ev1,ev2;
        aux1 = 0;
        double[][] array1= new double[10][4];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                    System.out.println("Ingrese la nota del tp1");
                    tp1 = lectura.nextInt()*0.10;
                    System.out.println("Ingrese la nota del tp2");
                    tp2 = lectura.nextInt()*0.15;
                    System.out.println("Ingrese la nota de ev1");
                    ev1 = lectura.nextInt()*0.25;
                    System.out.println("Ingrese la nota de la ev 2");
                    ev2 = lectura.nextInt()*0.50;
                 array1[i][j] = ((tp1+tp2+ev1+ev2));
                 if (array1[i][j] >= 7){
                     aux1 = aux1 + 1;
                 }
                 System.out.println(array1[i][j]);
                }
            }
            
     
        System.out.println("La cantidad de alumnos aprobados es " + aux1 + " La cantidad de alumnos desaprobados es " + (10-aux1));
        
    }
    
}
