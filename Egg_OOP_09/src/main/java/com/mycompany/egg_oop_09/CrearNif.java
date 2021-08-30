/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.egg_oop_09;

/**
 *
 * @author delam
 */
public class CrearNif {
    private long documento;
    private String letra;

    public CrearNif() {
    }

    public CrearNif(long documento, String letra) {
        this.documento = documento;
        this.letra = letra;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    @Override
    public String toString() {
        return "CrearNif{" + "documento=" + documento + " - " + letra + '}';
    }
public CrearNif creandoNIf(long documento){
    this.documento = documento;
    String[] letras = new String[]{"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H" ,"L", "C" ,"K" ,"E"}; 
        int aux1 = (int) (documento % 23);
        this.letra = letras[aux1];
     CrearNif creandoNif = new CrearNif(documento,letra);
        return creandoNif;
} 

}


