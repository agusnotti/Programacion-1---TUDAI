/*
 * Escribir un programa que mientras que el usuario ingrese un caracter letra
minúscula, pida ingresar un numero entero. Si el número ingresado está
entre 1 y 5 inclusive deberá imprimir la tabla de multiplicar de dicho
numero.
*/
package clase_6_diseñoDescendente;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Clase6_8 {

	public static final int MIN = 1;
	public static final int MAX = 5;
	public static final int MAX_MULTIPLICADOR = 10;
	
	public static void main(String[] args) {
		char caracter = ' ';
		int numero;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Ingrese un caracter letra minuscula: ");
			caracter = entrada.readLine().charAt(0);
			
			while((caracter >= 'a') && (caracter <= 'z')){
				System.out.println("Ingrese un numero entero");
				numero = Integer.valueOf(entrada.readLine());
				
				if((numero >= MIN) && (numero <= MAX)) {
					calcularTablaMultiplicar(numero);
				} 
				
				System.out.println("Ingrese un caracter letra minuscula: ");
				caracter = entrada.readLine().charAt(0);			
			}
			System.out.println("ingreso un caracter distinto de letra minuscula");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error "+ e);
		}
		

	}
	
	public static void calcularTablaMultiplicar(int numero) {
		int multiplicacion = 0;
		
		for (int i = 0; i <= MAX; i++) {
			multiplicacion = numero * i;
			System.out.println(numero +" x "+i+ " = "+multiplicacion);
		}
	}
}
