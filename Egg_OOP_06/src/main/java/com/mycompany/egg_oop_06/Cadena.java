
package com.mycompany.egg_oop_06;


public class Cadena {
private String Frase;
private Integer LongitudFrase;

    public Cadena() {
    }

    public Cadena(String Frase, Integer LongitudFrase) {
        this.Frase = Frase;
        this.LongitudFrase = LongitudFrase;
    }

    public String getFrase() {
        return Frase;
    }

    public void setFrase(String Frase) {
        this.Frase = Frase;
    }

    public Integer getLongitudFrase() {
        return LongitudFrase;
    }

    public void setLongitudFrase(Integer LongitudFrase) {
        this.LongitudFrase = LongitudFrase;
    }

    @Override
    public String toString() {
        return "Cadena{" + "Frase=" + Frase + ", LongitudFrase=" + LongitudFrase + '}';
    }

}
