/*
 * Ejercicio06.java
 * 
 * Jesus Vargas Galan
 * 
 *Escribe un programa que calcule el total de una factura a partir de la base
 *imponible (precio sin IVA). La base imponible estará almacenada en una
 *variable.
 * 
 * 
 */


public class Ejercicio06 {

  public static void main (String args[]) {
    
    
    double factura=145.65;
    int iva=21;
    double calculoIva=factura % iva;
    
    
    System.out.println("Tu factura sin IVA "+factura+ " €");
    System.out.println("extra a pagar con IVA "+calculoIva+" €"); 
    System.out.println("total a pagar con el IVA añadido "+(calculoIva +factura)+" €");
   
  }
}

