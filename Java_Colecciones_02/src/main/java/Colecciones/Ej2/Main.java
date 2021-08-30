package Colecciones.Ej2;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[]args) {
      ArrayList<CantanteFamoso> cantito = new ArrayList<>();
        Scanner lectura= new Scanner(System.in);

Test test1 = new Test(cantito,lectura);
test1.start();
test1.Print();
}

       

     
}
