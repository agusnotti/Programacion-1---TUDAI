/*
 * Escribir un programa que solicite al usuario el ingreso de un número entero
positivo, y muestre por pantalla los valores entre el numero ingresado y 0
de manera decreciente.
 */

package clase_5_iterativas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase5_ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		
		try {
			System.out.println("Ingrese un numero entero positivo:");
			num = Integer.valueOf(entrada.readLine());
			
			for (int i = num; i >= 0; i--) {
				num=i;
				System.out.println(num);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error!!!");
		}

	}

}
