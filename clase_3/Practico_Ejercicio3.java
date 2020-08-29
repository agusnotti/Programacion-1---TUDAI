/* Escribir un programa que permita el ingreso de dos números
enteros por teclado e imprima el resultado de comparar:
_ el primero mayor al segundo.
_ ambos son múltiplos de 2. */

package clase_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practico_Ejercicio3 {
    public static void main (String[]args){

        int num1=0;
        int num2=0;
        
        try {

            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Ingrese un numero entero: ");
            num1 = Integer.valueOf(entrada.readLine());

            System.out.println("Ingrese otro numero entero: ");
            num2 = Integer.valueOf(entrada.readLine());


            System.out.println("¿Es "+num1+" mayor que "+num2+" ? "+(num1>num2));

            System.out.println("¿Son "+num1+" y "+num2+" ambos numeros pares ? "+((num1%2==0) && (num1%2==0)));



            
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}