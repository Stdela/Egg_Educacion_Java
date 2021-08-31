package Herencia.ej2_3;

public class Televisor extends Electrodomestico {

    private double resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(double resolucion, boolean sintonizadorTDT) {
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor(double resolucion, boolean sintonizadorTDT, int Precio, String color, String consumoEnergetico, double peso) {
        super(Precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public String toString() {
        return super.toString() + "Televisor{" + "resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + '}';
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public void crearTelevisor(double resolucion, boolean sintonizador) {
        this.crearElectrodomestico();
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizador;
    }

    public void precioFinal() {
        double aux1;
        aux1 = this.getPrecio() * 0.30;
        this.precioFinal1();
        if (this.resolucion > 40) {
            this.Precio = this.Precio + aux1;
        }
        if (this.isSintonizadorTDT()) {
            this.Precio += 500;
        }
    }

}
