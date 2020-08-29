/*
 * 7. Hacer un programa que dado un arreglo ordenado creciente de enteros
de tamaño 10 que se encuentra precargado, solicite al usuario un numero
entero y lo inserte en el arreglo manteniendo su orden. Para ello tendrá
que realizar un corrimiento a derecha (se pierde el último valor del arreglo)
y colocar el numero en el arreglo en la posición indicada.
 */

//declarar un arreglo de enteros ordenado creciente
//declarar una variable entero
//solicitar al usuario un numero entero
//recorrer el arreglo
//buscar en que posicion iria el numero
//realizar un corrimiento a derecha
//insertar el numero

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase7_ej7 {
	public static final int MAX = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numeros = {5,7,8,9,9,10,12,14,14,20};
		int numero;

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)); 

		try {
			imprimirArregloInt(numeros);
			
			
			System.out.println("\nIngresar un numero entero: ");
			numero = Integer.valueOf(entrada.readLine());

			int i = 0;
			int pos = 0;

			while ((i < MAX)){
				
				pos= buscar_pos_arreglo_ord_crec(numeros, numero);
				
				i++;				
			}	

			corrimiento_der(numeros, pos);
			
			numeros[pos]=numero;
			
			imprimirArregloInt(numeros);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error"+e);
		}

	}
	//##################  BUSCAR POSICION EN ARREGLO ORENADO CRECIENTE  --->La posicion que retorna no significa que este ahí, es donde deberia estar
	public static int buscar_pos_arreglo_ord_crec(int[] arr,int numero) {
		int pos = 0;
		while ((pos<MAX)&&(arr[pos]<numero)){
			pos++;
		}
		return pos;
	}

	//##################  CORRIMIENTO DERECHA	---> INSERTAR ELEMENTO EN ARREGLO
	public static void corrimiento_der(int [] arr, int pos){
		int indice = MAX-1;
		while (indice > pos){
			arr[indice] = arr[indice-1];
			indice--;
		}
	}
	// IMPRIMIR ARREGLO
	public static void imprimirArregloInt(int [] arr){
		for (int pos = 0; pos < MAX; pos++){  //definir MAX como constante
			System.out.print(arr[pos]+" | ");
		}
	}

}
