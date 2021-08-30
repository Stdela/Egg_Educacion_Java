/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones.Ej2;

import java.util.ArrayList;

/**
 *
 * @author delam
 */
public class CantanteFamoso {
 
private String nombre;
private String cancionMasVendida;

    public CantanteFamoso() {
        
    }

    public CantanteFamoso( String nombre, String cancionMasVendida) {
        
        this.nombre = nombre;
        this.cancionMasVendida = cancionMasVendida;
    }

    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCancionMasVendida() {
        return cancionMasVendida;
    }

    public void setCancionMasVendida(String cancionMasVendida) {
        this.cancionMasVendida = cancionMasVendida;
    }

    @Override
    public String toString() {
        return  "Autor " + nombre + ", cancionMasVendida " + cancionMasVendida;
                
    }
   public void add(CantanteFamoso cantor){
      this.add(cantor);
   }
}
