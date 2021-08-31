
package Herencia.ej4;

/**
 *
 * @author delam
 */
public class Circulo implements CalculoFormas {
private double radio ;
private double diametro;

    public Circulo() {
    }

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }
@Override
 public void calcularArea(){
  double aux1 = Math.PI*Math.pow(this.radio, 2);
    System.out.println("El área de este círculo es " + aux1);
 }
@Override
public void calcularPerimetro(){
    double aux1 = Math.PI* this.diametro;
    System.out.println("El perímetro de este círculo es de " + aux1);
}
}
