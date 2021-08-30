package Primeraguia;


import java.util.Scanner;

public class Ej22 {
public static void main(String[] args){
    Scanner lectura = new Scanner(System.in);
    int[] aux1 = new int[100];
    for(int i = 1; i<100; i++){
        for(int j = 1; j< 100; j++){
            aux1[j] = j;
        }
    }
     for(int l = 99; l>0; l--){
         for (int m = 99; m>0; m--){
             System.out.println(aux1[m]);
         }
     }   
}

}
