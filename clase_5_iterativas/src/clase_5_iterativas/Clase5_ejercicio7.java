/*
 * Escribir un programa que mientras que el usuario ingrese un número entero
entre 1 y 10 inclusive, lleve la suma de los números ingresados y la cantidad
de sumas que realizó. Finalmente, cuando sale del ciclo muestre por
pantalla el resultado del promedio de todo lo ingresado.
 */
package clase_5_iterativas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase5_ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int suma=0;
		int iterador=0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		try {
			
			System.out.println("ingrese un numero del 1 al 10");
			num = Integer.valueOf(entrada.readLine());
			
			while((num != 0) && ((num>=1)&&(num<=10))) {
				suma += num;	
				iterador++;
				
				System.out.println("Suma "+suma);
				System.out.println("Cantidad de sumas realizadas: "+iterador);
				System.out.println("ingrese otro numero: ");
				num = Integer.valueOf(entrada.readLine());
			}
			System.out.println("El promedio de los numero ingresados es "+suma/iterador);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
		}

	}

}
