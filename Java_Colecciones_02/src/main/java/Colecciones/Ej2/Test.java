/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones.Ej2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author delam
 */
public class Test {

    private ArrayList<CantanteFamoso> cantantes;
    private Scanner scanner;

    public Test() {
        this.cantantes = new ArrayList<>();
        this.scanner = scanner;
    }

    public Test(ArrayList<CantanteFamoso> cantantes, Scanner scanner) {
        this.cantantes = cantantes;
        this.scanner = scanner;
    }

    public ArrayList<CantanteFamoso> getCantantes() {
        return cantantes;
    }

    public void setCantantes(ArrayList<CantanteFamoso> cantantes) {
        this.cantantes = cantantes;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String toString() {
        return "Test{" + "cantantes=" + cantantes + '}';
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        while (contador < 5) {
            contador++;
            System.out.println("Ingrese nombre del cantante");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese nombre del disco más vendido");
            String disco = scanner.nextLine();
            this.cantantes.add(new CantanteFamoso(nombre, disco));
        }
        System.out.println(" ATENCIÓN!!!!! Ingrese nombre de nuevo cantante");
        String agregar1 = scanner.nextLine();
        System.out.println("INGRESE NOMBRE DE SU DISCO");
        String agregar2 = scanner.nextLine();
        this.add(new CantanteFamoso(agregar1, agregar2));
        this.Print();
        int aux3 = 1;
        while (true || aux3 != 4) {
            System.out.println("Ingrese comandos a continuación. 1 para ingresar nuevo cantante. 2 para editar. 3 para eliminar. 4 para salir");
            int aux1 = scanner.nextInt();
            switch (aux1) {
                case 1:
                    System.out.println();
                    System.out.println("Ingrese nombre de cantante para agregar");
                    String a = this.scanner.nextLine();
                    System.out.println("Ingrese nombre de disco");
                    String b = this.scanner.nextLine();
                    this.cantantes.add(new CantanteFamoso(a, b));
                    continue;
                case 2:
                    System.out.println("Qué cantante desea editar ? 0,1,2,3,4,5 etc");
                    int aux = scanner.nextInt();
                    this.editarCantante(aux);
                    continue;
                case 3:
                    int eliminar = this.scanner.nextInt();
                    this.eliminarCantante(eliminar);
                    continue;
                case 4:
                    break;

            }
            System.out.println("Vuelva a ingresar 4 para romper");
            aux3 = scanner.nextInt();
        }
    }

    public CantanteFamoso add(CantanteFamoso cantor) {
        this.cantantes.add(cantor);
        return cantor;
    }

    public void Print() {
        for (CantanteFamoso cantante : cantantes) {
            System.out.println(cantante);
        }
    }

    public CantanteFamoso editarCantante(int number) {
        this.cantantes.get(number);
        System.out.println("Ingrese el nuevo nombre del cantante");
        String aux1 = scanner.nextLine();
        System.out.println("Ingrese nuevo nombre de álbum más vendido");
        String aux2 = scanner.nextLine();
        this.cantantes.get(number).setNombre(aux1);
        this.cantantes.get(number).setCancionMasVendida(aux2);

        return this.cantantes.get(number);
    }

    public CantanteFamoso eliminarCantante(int number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("eliminando cantante........................");
        return this.cantantes.remove(number);

    }

}
