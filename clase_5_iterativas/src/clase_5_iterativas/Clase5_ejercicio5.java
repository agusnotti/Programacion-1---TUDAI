/*
 * Escribir un programa que mientras que el usuario ingrese un caracter dígito
o caracter letra minúscula, imprima si es caracter dígito o caracter letra
minúscula, y si es letra minúscula imprimir si es vocal o consonante.

 */
package clase_5_iterativas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase5_ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char caracter=' ';
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Ingrese un caracter: ");
			caracter = entrada.readLine().charAt(0);
			
			while(((caracter>='0')&&(caracter<='9'))||((caracter>='a')&&(caracter<='z'))){
				
					if(((caracter>='0')&&(caracter<='9'))) {						
						System.out.println("Es un caracter digito");
						
					} else if(((caracter>='a')&&(caracter<='z'))) {
						
						if((caracter == 'a')||(caracter == 'e')||(caracter == 'i')||(caracter == 'o')||(caracter == 'u')) {
							System.out.println("Es vocal");	
							
						}else {							
							System.out.println("Es consonante");						
						}
					}
					System.out.println("Ingrese un caracter: ");
					caracter = entrada.readLine().charAt(0);
			}
			
						
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
		}

	}

}
