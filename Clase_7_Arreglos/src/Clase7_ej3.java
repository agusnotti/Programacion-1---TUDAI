/*
 * Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, solicite al usuario una posición y realice un corrimiento a izquierda o hacia la
menor posición del arreglo.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase7_ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numeros;
		numeros = new int [10];
		int posicion;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
 
		try {
			cargarArreglo(numeros);
			System.out.println("ARREGLO ORIGINAL");
			imprimirArreglo(numeros);
			
			
			System.out.println("Ingrese un numero entre 1 y 10: ");
			posicion = Integer.valueOf(entrada.readLine());
			
			corrimientoIzquierda(numeros, posicion);
			
			System.out.println("ARREGLO CON CORRIMIENTO");
			imprimirArreglo(numeros);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error"+e);
		}

	}
	//corrimiento izquierda
	public static void corrimientoIzquierda(int [] arr, int pos){
		int indice = 0;
		while (indice < pos){
			arr[indice] = arr[indice+1];
			indice++;
		}
	}
	//carga de arreglo de int con valores de MINVALOR a MAXVALOR
	public static void cargarArreglo(int [] arr){
		int max = 10;
		int min = 1;
				
		for (int i = 0; i < arr.length; i++){
			//arr[i]=i;
			arr[i]=(int) (Math.floor(Math.random() * (max - min)) + min);;
		}
	}
	
	//imprime el arreglo	
	public static void imprimirArreglo(int [] arr){
		for (int i = 0; i < arr.length; i++){
		System.out.print(arr[i]+" | ");
		}
	}

}
