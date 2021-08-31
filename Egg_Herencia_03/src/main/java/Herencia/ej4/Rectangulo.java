
package Herencia.ej4;

/**
 *
 * @author delam
 */
public class Rectangulo implements CalculoFormas{
private double base;
private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
@Override
public void calcularPerimetro(){
   double aux1 = (this.altura + this.base) * 2;
    System.out.println("El perímetro de este rectángulo es " + aux1);
}
@Override
public void calcularArea(){
   double aux1 = this.base*this.altura;
    System.out.println("El área de este rectángulo es  " + aux1);
}
}
