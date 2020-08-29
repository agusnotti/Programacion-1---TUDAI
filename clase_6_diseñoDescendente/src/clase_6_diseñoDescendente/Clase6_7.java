package clase_6_diseñoDescendente;

/*
 * Escribir un programa que mientras el usuario ingresa un numero de mes
(entero) entre 1 y 12 inclusive, muestre por pantalla la cantidad de días del
mes ingresado (suponer febrero de 28 días) (¿mostrar por pantalla la
cantidad de días del mes debería realizarse con un método? Debería). 
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroMes;
		int cantidadDias;
		final int min = 1;
		final int max = 12;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Ingrese un numero de mes");
			numeroMes = Integer.valueOf(entrada.readLine());
			
			while((numeroMes >= min)&&(numeroMes <= max)) {
				cantidadDias = mostrarCantidadDias(numeroMes);
				System.out.println("La cantidad de dias del mes "+ numeroMes+" es "+cantidadDias);
				
				System.out.println("Ingrese un numero de mes");
				numeroMes = Integer.valueOf(entrada.readLine());
			}
			
			
		} catch (Exception e) {
			System.out.println("error" + e);
		}


	}
	
	public static int mostrarCantidadDias(int num) {
		int cantidadDias;
		
		if((num == 4) || (num == 6) || (num == 9) || (num == 11)) {
			cantidadDias = 30;
		} else if (num == 2){
			cantidadDias = 28;
		} else {
			cantidadDias = 31;
		}
		
		return cantidadDias;
	}

}
