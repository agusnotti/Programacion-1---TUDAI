//Escribir un programa que mientras el usuario ingrese un caracter letra
//minúscula, se quede con la menor y la mayor letra ingresada. Finalmente
//muestre por pantalla dichas letras.
package clase_5_iterativas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase5_ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letra;
		char letraMenor='z';
		char letraMayor='a';
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("ingrese una letra: ");
			letra = entrada.readLine().charAt(0);
			while ((letra >='a')&&(letra <='z')) {
				
				if(letra<letraMenor) {
					letraMenor=letra;			
				}
				
				if(letra>letraMayor) {
					letraMayor=letra;
				}		
				
				System.out.println("ingrese una letra: ");
				letra = entrada.readLine().charAt(0);
			}
			System.out.println("La letra menor es "+letraMenor+" y la letra mayor es "+letraMayor);
					
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR!");
		}
		
		

	}

}

