/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones.Ej4;


public class Main {
 public static void main(String[]args){
      Libreria elPez = new Libreria();
    Libro1 librito = new Libro1("Los caminos de la vida","Hayao",3,2);
    Libro1 librito1 = new Libro1("Autobiografía","Otto Bismarck",0,2);
    Libro1 librito2 = new Libro1("Info secreta","Nisman",3,0);
    Libro1 librito3 = new Libro1("Vida y obra de los cactus mendocinos","Santiago",3,2);
    Libro1 librito4 = new Libro1("Los caminos de la vida al final no eran lo que esperaba","Hayao",99,1);

elPez.add(librito);
elPez.add(librito1);
elPez.add(librito2);
elPez.add(librito3);
elPez.add(librito4);
elPez.devolver(librito);
elPez.devolver(librito);
  elPez.printItems();
   }
}
