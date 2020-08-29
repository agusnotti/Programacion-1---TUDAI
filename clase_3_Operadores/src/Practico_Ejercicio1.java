/* Escribir un programa que permita el ingreso de un número entero
por teclado e imprima el cociente de la división de dicho número
con 2, 3, y 4. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practico_Ejercicio1 {
    public static void main (final String[] args) {
        int numero=0;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Ingrese un numero entero: ");
            numero=Integer.valueOf(entrada.readLine());

            System.out.println(numero+"/2 = "+numero/2);
            System.out.println(numero+"/3 = "+numero/3);
            System.out.println(numero+"/4 = "+numero/4);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}