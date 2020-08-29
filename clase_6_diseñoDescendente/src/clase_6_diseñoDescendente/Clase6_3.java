package clase_6_diseñoDescendente;

/*
 * Escribir un programa que mientras el usuario cargue desde
teclado un caracter letra minúscula, llame a un método
que imprime por pantalla la tabla de multiplicar de 9. 
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char caracter;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Ingresar un caracter: ");
			caracter = entrada.readLine().charAt(0);
			
			while(((caracter >= 'a')&&(caracter <= 'z'))) {
				multiplicar();
				
				System.out.println("Ingresar un caracter: ");
				caracter = entrada.readLine().charAt(0);
			}
			System.out.println("chau!");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error" +e);
		}

	}
	
	public static void multiplicar() {
		final int numero = 9;
		for (int i = 0; i < 10; i++) {
			System.out.println(numero +"x"+i+"= "+numero*i);
		}
	}

}
