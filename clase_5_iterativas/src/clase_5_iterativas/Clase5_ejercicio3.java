/*
 * Escribir un programa que mientras el usuario ingresa un caracter distinto
del caracter ‘*’, muestre por pantalla si es caracter digito, o si es caracter
vocal minúscula. 
 */
package clase_5_iterativas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase5_ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char caracter=' ';
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			do {
				System.out.println("ingrese un caracter: ");
				caracter=entrada.readLine().charAt(0);
				
				if((caracter >= '0')&&(caracter <= '9')) {
					System.out.println(caracter+" es digito");
				} else if((caracter == 'a')
						||(caracter == 'e')
						||(caracter == 'i')
						||(caracter == 'o')
						||(caracter == 'u')) {
					System.out.println(caracter+" es vocal muniscula");
				}
								
			} while (caracter != '*');
			System.out.println("Ingreso *");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error!!");
		}
		
		
		

	}

}
