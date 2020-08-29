/*
 * Escribir un programa que mientras el usuario ingrese un número entero
menor que 10 y mayor a 1, muestre por pantalla si el número es múltiplo de
2 y múltiplo de 3 simultáneamente. (¿Los valores mencionados deberían
ser constantes?. De a poco habría que definirlos como constantes).
 * */
package clase_5_iterativas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase5_ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numIngresado;
		final int max=10;
		final int min=1;
		
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Ingrese un numero: ");
			numIngresado = Integer.valueOf(entrada.readLine());
			
			while((numIngresado >= min)&&(numIngresado <= max)) {
				if((numIngresado%2==0)&&(numIngresado%3==0)) {
					System.out.println(numIngresado+" es multiplo de 2 y de 3 simultaneamente.");
				}else {
					System.out.println("nada");
				}
				System.out.println("Ingrese un numero: ");
				numIngresado = Integer.valueOf(entrada.readLine());
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR!!");
		}
		
		System.out.println("Aplicacion finalizada.");

	}

}
