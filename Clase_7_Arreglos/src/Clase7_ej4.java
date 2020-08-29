/*
 *  Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, solicite al usuario un numero entero y lo agregue al principio del arreglo (posición
0). Para ello tendrá que realizar un corrimiento a derecha (se pierde el último valor del arreglo) y
colocar el numero en el arreglo en la posición indicada.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase7_ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroIngresado;
		int [] numeros;
		numeros = new int [10];
		
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		try {
			cargarArreglo(numeros);
			System.out.println("ARREGLO ORIGINAL");
			imprimirArreglo(numeros);
			
			System.out.println("ingrese un numero: ");
			numeroIngresado = Integer.valueOf(entrada.readLine());
			
			insertarNumero(numeros, numeroIngresado);
			
			System.out.println("NUEVO ARREGLO");
			imprimirArreglo(numeros);
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error"+e);
		}

	}
	
	//insertar numero
	public static void insertarNumero(int [] arr, int num) {
		corrimientoDerecha(arr);
		arr[0] = num;
		
	}
	
	public static void corrimientoDerecha(int [] arr){
		int indice = arr.length-1;
		while (indice > 0){
			arr[indice] = arr[indice-1];
			indice--;
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
		System.out.println("numeros["+i+"]=>: "+arr[i]);
		}
	}

}
