package clase_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/*Programa para ingresar datos necesarios para dibujar un circulo y un triangulo*/
class Practico_segunda_parte_1 {
  public static void main(String[] args) {
    
    final double pi= 3.14;
    float radio, longitud_lado1,longitud_lado2, longitud_lado3;

    try{
      BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
      
            
      System.out.println("Ingrese el radio del circulo: ");
      radio = Float.valueOf(entrada.readLine());
      
      System.out.print("DATOS PARA DIBUJAR UN CIRCULO:\n pi: "+pi+"\nRadio: "+radio);
      
      System.out.println("\nIngrese la longitud del lado 1 del triangulo: ");
      longitud_lado1=Float.valueOf(entrada.readLine());
      
      System.out.println("Ingrese la longitud del lado 2 del triangulo: ");
      longitud_lado2=Float.valueOf(entrada.readLine());
      
      System.out.println("Ingrese la longitud del lado 3 del triangulo: ");
      longitud_lado3=Float.valueOf(entrada.readLine());
      
      System.out.println("DATOS PARA DIBUJAR UN TRIANGULO:\n Lado 1: "+longitud_lado1+"\n Lado 2: "+longitud_lado2+"\n Lado 3: "+longitud_lado3);
    
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
}
    