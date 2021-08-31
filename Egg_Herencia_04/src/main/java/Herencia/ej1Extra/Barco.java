
package Herencia.ej1Extra;

//En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler

import java.util.Scanner;

//se guarda: el nombre, documento del cliente, la fecha de alquiler, fecha de
//devolución, la posición del amarre y el barco que lo ocupará.


//Un alquiler se calcula multiplicando el número de días de ocupación (calculado
//con la fecha de alquiler y devolución), por un valor módulo de cada barco
//(obtenido simplemente multiplicando por 10 los metros de eslora).
//En los barcos de tipo especial el módulo de cada barco, se calcula sacando el
//modulo normal y sumándole el atributo particular de cada barco. En los veleros
//se suma el número de mástiles, en los barcos a motor se le suma la potencia en
//CV y en los yates se suma la potencia en CV y el número de camarotes.
//Utilizando la herencia de forma apropiada, deberemos programar en Java, las
//clases y los métodos necesarios que permitan al usuario elegir el barco que
//quiera alquilar y mostrarle el precio final de su alquiler.
public class Barco {
  protected String matricula;
  protected int eslora;
  protected int anioFabricacion;

    public Barco() {
    }
  
    public Barco(String matricula, int eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", anioFabricacion=" + anioFabricacion + '}';
    }
  public void crearBarco(){
     
      Scanner scanner = new Scanner(System.in).useDelimiter("\n");
      System.out.println("Ingrese año de fabricacion");
     this.anioFabricacion = scanner.nextInt();
      System.out.println("Ingrese eslora-mtrs-");
     this.eslora = scanner.nextInt();
      System.out.println("Ingrese matricula");
     this.matricula = scanner.next();
  }

}
