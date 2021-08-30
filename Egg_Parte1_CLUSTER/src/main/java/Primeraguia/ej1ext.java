package Primeraguia;


import java.util.Scanner;

public class ej1ext {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        int[][] aux1 = new int[10][10];
        System.out.println("Matriz 1 tamaño 10x10");
        int[][] aux2 = new int[3][3];
        System.out.println("Matriz 2 tamaño 3x3");
        System.out.println("Llenamos matriz 1");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                aux1[i][j] = (int) (Math.random() * 99);
                System.out.print(aux1[i][j]);
                System.out.print(" ");

            }
            System.out.println("");
        }
        
        System.out.println("Llenar matriz 2");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                aux2[i][j] = lectura.nextInt();

            }

        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (aux1[i][j] == aux2[0][0]) {
                    System.out.println("Encontramos una coincidencia, continuamos");
                    System.out.println("Encontrada en " + i + j);
                    if (aux1[i][j + 1] == aux2[0][1]) {
                        System.out.println("Segunda coincidencia encontrada en " + i + " , " + (j + 1));
                        if (aux1[i][j + 2] == aux2[0][2]) {
                            System.out.println("TERCERA COINCIDENCIA, encontrada en " + i + " , " + (j + 2));
                            System.out.println("Pasamos a la segunda fila");
                            if (aux1[i + 1][j] == aux2[1][0]) {
                                System.out.println("Cuarta COINCIDENCIA, encontrada en " + (i + 1) + " , " + (j));
                                if (aux1[i + 1][j + 1] == aux2[1][1]) {
                                    System.out.println("QUINTA COINCIDENCIA, encontrada en " + (i + 1) + " , " + (j + 1));
                                    if (aux1[i + 1][j + 2] == aux2[1][2]) {
                                        System.out.println("Sexta coincidencia, encontrada en " + (i + 1) + " , " + (j + 2));
                                        if (aux1[i + 2][j] == aux2[2][0]) {
                                            System.out.println("Séptima COINCIDENCIA, encontrada en " + (i + 2) + " , " + (j));
                                            if (aux1[i + 2][j + 1] == aux2[2][1]) {
                                                System.out.println("Octava COINCIDENCIA, encontrada en " + (i + 2) + " , " + (j + 1));
                                                if (aux1[i + 2][j + 2] == aux2[2][2]) {
                                                    System.out.println("NOVENA COINCIDENCIA, encontrada en " + (i + 2) + " , " + (j + 2));

                                                }

                                            }
                                        }

                                    }
                                }

                            }
                        } else{
                            System.out.println("ERROR, al final no era por acá");
                        }

                    }  
            }

        }

    }
}
    }

