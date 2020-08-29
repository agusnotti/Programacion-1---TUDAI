/*
 * Escribir un programa que mientras el usuario ingrese un caracter letra
minúscula, acumule la cantidad de vocales que ingreso. Finalmente
muestre por pantalla dicha cantidad.
 */
package clase_5_iterativas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase5_ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char caracter=' ';	
		int iterador=0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Ingrese una letra: ");
			caracter = entrada.readLine().charAt(0);
			
			while(((caracter>='a')&&(caracter<='z'))&&(caracter!='*')) {
				if((caracter == 'a')||(caracter == 'e')||(caracter == 'i')||(caracter == 'o')||(caracter == 'u')) {
					iterador++;
				}
				System.out.println("Ingrese una letra: ");
				caracter = entrada.readLine().charAt(0);
			}
			System.out.println("Cantidad de vocales: "+iterador);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
		}

	}

}
