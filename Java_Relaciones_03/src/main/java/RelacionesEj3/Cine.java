package RelacionesEj3;
//Cine, que tiene una sala con un conjunto de
//asientos (8 filas por 6 columnas). 

import java.util.ArrayList;
import java.util.Collections;

//De Cine nos interesa conocer la película que se está
//reproduciendo, la sala con los espectadores y el precio de la entrada.
public class Cine {

    private Pelicula peliculaReproduciendo;
    private Double precioEntrada;
    private String[][] asientos = new String[8][6];
    private ArrayList<Espectador> espectador;


    public Cine() {
    }

    public Cine(Pelicula peliculaReproduciendo, Double precioEntrada, ArrayList<Espectador> espectador) {
        this.peliculaReproduciendo = peliculaReproduciendo;
        this.precioEntrada = precioEntrada;
        this.espectador = espectador;
    }

    public Pelicula getPeliculaReproduciendo() {
        return peliculaReproduciendo;
    }

    public void setPeliculaReproduciendo(Pelicula peliculaReproduciendo) {
        this.peliculaReproduciendo = peliculaReproduciendo;
    }

    public Double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(Double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public String[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(String[][] asientos) {
        this.asientos = asientos;
    }

    public ArrayList<Espectador> getEspectador() {
        return espectador;
    }

    public void setEspectador(ArrayList<Espectador> espectador) {
        this.espectador = espectador;
    }

    @Override
    public String toString() {
        return "Cine{" + "peliculaReproduciendo=" + peliculaReproduciendo + ", precioEntrada=" + precioEntrada + ", asientos=" + asientos + ", espectador=" + espectador + '}';
    }

    public void llenarArray() {

//    String[] aux1 = new String[]{"A","B","C","D","E","F"};
        ArrayList<String> aux2 = new ArrayList<>();
        aux2.add("A");
        aux2.add("B");
        aux2.add("C");
        aux2.add("D");
        aux2.add("E");
        aux2.add("F");

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                this.asientos[i][j] = String.valueOf(i + 1).concat(aux2.get(j));

//                System.out.print(this.asientos[i][j]);
//                System.out.print(" ");
            }
//            System.out.println("");
        }

    }

    public void sentarEspectador() {
        int auxiliar = 0;
        for (Espectador persona : espectador) {
            if (persona.getEdad() > peliculaReproduciendo.getEdadMinima() && (persona.getDinero() > this.precioEntrada)) {
                System.out.println("Puede entrar");
                this.Array1();
                this.Array2();
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 6; j++) {
                        if (this.asientos[i][j].equals(this.asientos[this.Array1()][this.Array2()])) {
                            System.out.println("Correcto!");
                            if (!(this.asientos[i][j].contains("X"))) {
                                this.asientos[i][j] = this.asientos[i][j].concat("X");
                            }

                        }

                    }
                }

            }

//                 this.asientos[this.Array1()][this.Array2()] = this.asientos[this.Array1()][this.Array2()].concat("X");
//                    this.asientos[1][0] = this.asientos[1][0].concat("X");
//                        System.out.println("Otorgación realizada");
            auxiliar++;

        }
    }

//while (auxiliar!=0){
//     this.asientos[0][1] = this.asientos[0][1].concat("X");
//     auxiliar--;
//}
    public void printAsientos() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(this.asientos[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

    }

    public int Array1() {
        ArrayList<Integer> superRandom = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            superRandom.add(i);
        }
        Collections.shuffle(superRandom);
        int auxiliar1 = 1;
        int auxiliar2 = auxiliar1 - 1;
        auxiliar1++;

        return superRandom.get(auxiliar2);
    }

    public int Array2() {
        ArrayList<Integer> superRandom = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            superRandom.add(i);
        }
        Collections.shuffle(superRandom);
        int auxiliar3 = 1;
        int auxiliar2 = auxiliar3 - 1;
        auxiliar3++;

        return superRandom.get(auxiliar2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Object)) {
            return false;
        }
        Cine c = (Cine) o;
        if (this.asientos.equals(c.asientos)) {
            return true;
        }
        return false;
    }
//    public int crearAuxiliar1(){
//       int auxiliar1 =(int) Math.random()*(8-1)+1;
//        return auxiliar1;
//    }
//    public int crearAuxiliar2(){
//       int auxiliar1 =(int) Math.random()*(6-1)+1;
//        return auxiliar1;
//    }
//    public int superRandom(Integer random){
//       
//        Collections.shuffle(superRandom);
//        return superRandom.get(random);
//    }
//    
}
