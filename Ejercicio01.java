/*
* Ejercicio01.java
* 
* Jesus Vargas Galan
* 
*Escribe un programa en el que se declaren las variables enteras x e y . Asignales
*los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
*el valor de cada variable, la suma, la resta, la división y la multiplicación.
*/


public class Ejercicio01{

  public static void main (String args[]) {
    
    
    int x=144;
    int y=999;
    
    
    System.out.println("X es igual a "+x+" e Y es igual a "+y);
    System.out.println("Y+X es igual a "+(x + y));
    System.out.println("Y-X es igual a "+(x - y));
    System.out.println("Y*X es igual a "+(double)(x * y));
    System.out.println("Y/X es igual a "+(float)(x / y));
  }
}

