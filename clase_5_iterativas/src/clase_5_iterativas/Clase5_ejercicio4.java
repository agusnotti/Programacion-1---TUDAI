/*
 * Escribir un programa que mientras que el usuario ingrese un número entero
distinto de 0, pida ingresar otro número entero y lo imprima.
 */
package clase_5_iterativas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase5_ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			do {
				System.out.println("ingrese un numero: ");
				num = Integer.valueOf(entrada.readLine());
				System.out.println(num);
				
			} while (num != 0);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
		}

	}

}
