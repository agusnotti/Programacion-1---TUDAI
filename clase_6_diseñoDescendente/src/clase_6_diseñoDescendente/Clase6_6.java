package clase_6_diseñoDescendente;

/*
 * 6. Escribir un programa que mientras que el usuario ingrese un número entero
natural, llame a un método que calcule la sumatoria entre 1 y dicho
numero y se lo retorne como resultado. 
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		int sumatoria = 0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			System.out.println("Ingrese un numero: ");
			numero = Integer.valueOf(entrada.readLine());
			
			while(numero > 0) {
				sumatoria = calcularSumatoria(numero);
				System.out.println(sumatoria);
				
				System.out.println("Ingrese un numero: ");
				numero = Integer.valueOf(entrada.readLine());
			}
			System.out.println("chau!");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error" + e);
		}

	}
	
	public static int calcularSumatoria(int num) {
		int max = num;
		int suma = 0;
		
		for (int i = 0; i <= max; i++) {
			suma += i;
		}
		return suma;
	}

}
