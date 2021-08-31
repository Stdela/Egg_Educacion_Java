package Herencia.ej2_3;

/**
 *
 * @author delam
 */
public class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, double Precio, String color, String consumoEnergetico, double peso) {
        super(Precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return super.toString() +  "Lavadora{" + "carga=" + carga + '}';
    }
    

    public void crearLavadora(int carga) {
        this.crearElectrodomestico();
        this.carga = carga;
    }

    

    public void precioFinal() {
        this.precioFinal1();
        if (this.carga > 30) {
            this.Precio += 500;
        }
    }

}
