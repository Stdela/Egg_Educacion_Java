package Herencia.ej2_3;

import java.util.Scanner;

public class Electrodomestico {

    protected double Precio;
    protected String color;
    protected String consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double Precio, String color, String consumoEnergetico, double peso) {
        this.Precio = Precio;
        this.peso = peso;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "Precio=" + Precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }

    public void comprobarConsumo(String letri) {
        if ((letri.equalsIgnoreCase("A")) || ((letri.equalsIgnoreCase("B"))) || ((letri.equalsIgnoreCase("C"))) || ((letri.equalsIgnoreCase("D"))) || ((letri.equalsIgnoreCase("E"))) || ((letri.equalsIgnoreCase("F")))) {
            this.consumoEnergetico = letri;

        } else{
            this.consumoEnergetico = "F";
        }
    }

    public void comprobarColor(String color) {
        if ((color.equalsIgnoreCase("blanco")) || ((color.equalsIgnoreCase("negro"))) || ((color.equalsIgnoreCase("rojo"))) || ((color.equalsIgnoreCase("azul"))) || ((color.equalsIgnoreCase("gris")))) {
            this.color = color;
        } else{
            this.color = "Blanco";
        }
        
    }

    public void crearElectrodomestico() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el color de su electrodomestico");
        String color = scanner.nextLine();
        this.comprobarColor(color);
        System.out.println("Ingrese el consumo de su electrodoméstico");
        String consumo = scanner.nextLine();
        this.comprobarConsumo(consumo);
        System.out.println("Ingrese el peso de su electrodoméstico");
        double peso = scanner.nextDouble();
        this.peso = peso;
        this.Precio = 1000;
    }

    public void precioFinal1() {
        if (this.consumoEnergetico.equalsIgnoreCase("A")) {
            this.Precio += 1000;
        } else if (this.consumoEnergetico.equalsIgnoreCase("B")) {
            this.Precio += 800;
        } else if (this.consumoEnergetico.equalsIgnoreCase("C")) {
            this.Precio += 600;
        } else if (this.consumoEnergetico.equalsIgnoreCase("D")) {
            this.Precio += 500;
        } else if (this.consumoEnergetico.equalsIgnoreCase("E")) {
            this.Precio += 300;
        } else if (this.consumoEnergetico.equalsIgnoreCase("F")) {
            this.Precio += 100;
        }
        if (this.peso >= 1 && this.peso <= 19) {
            this.Precio += 100;
        } else if (this.peso >= 20 && this.peso <= 49) {
            this.Precio += 500;
        } else if (this.peso >= 50 && this.peso <= 79) {
            this.Precio += 800;
        } else if (this.peso >= 80) {
            this.Precio += 1000;
        }
    }
    
}
