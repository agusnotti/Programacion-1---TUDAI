package clase_6_diseñoDescendente;

/*
 * Escribir un diseño de programa que mientras que el usuario
ingrese un número distinto de 0, pida ingresar otro numero y
lo imprima.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 0;
		
		//declarar una variable entero
		//pedir al usuario que ingrese un numero distinto de 0
		//mientras (usuario ingresa un numero distinto de 0){
					//pedir que ingrese otro numero.
					//imprimir numero
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("ingrese un numero: ");
			numero = Integer.valueOf(entrada.readLine());
			
			while(numero != 0) {
				System.out.println("El numero es "+numero);
				
				System.out.println("ingrese un numero: ");
				numero = Integer.valueOf(entrada.readLine());
				
				
			}
			System.out.println("Finalizó el programa. Ingreso 0.");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error"+e);
		}

	}

}
