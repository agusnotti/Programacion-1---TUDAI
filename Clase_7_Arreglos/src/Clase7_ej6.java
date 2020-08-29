/*
 * 6. Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, solicite al usuario un numero entero y elimine todas las ocurrencia de numero en el
arreglo si existe. Mientras exista (en cada iteración tiene que buscar la posición dentro del
arreglo) tendrá que usar la posición para realizar un corrimiento a izquierda (quedarán tantas
copias de la última posición del arreglo como cantidad de ocurrencias del número).

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase7_ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroIngresado;
		int [] numeros;
		numeros = new int[10];
		boolean existeOcurrencia = false;

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		try {
			
			cargarArreglo(numeros);
			System.out.println("ARREGLO ORIGINAL");
			imprimirArreglo(numeros);
						
			System.out.println("ingrese un numero: ");
			numeroIngresado = Integer.valueOf(entrada.readLine());
			
			existeOcurrencia = buscarOcurrencia(numeros, numeroIngresado);			
			System.out.println("hay ocurrencia? "+existeOcurrencia);
			
			if(existeOcurrencia){
				System.out.println("NUEVO ARREGLO");
				imprimirArreglo(numeros);
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error" +e);
		}

	}
	//BUSCAR OCURRENCIA
	public static boolean buscarOcurrencia(int [] arr, int num) {
		boolean ocurrencia= false;		

		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				ocurrencia=true;
				corrimientoIzquierda(arr, i);
				i--;
			} 
		}		
		return ocurrencia; 
	}
	
	//CORRIMIENTO DE IZQUIERDA
	public static void corrimientoIzquierda(int [] arr, int indice){
		int pos = indice;
		while (pos < arr.length -1){
			arr[pos] = arr[pos+1];
			pos++;
		}
	}

	//CARGAR ARREGLO de int con valores de MINVALOR a MAXVALOR
	public static void cargarArreglo(int [] arr){
		int max = 10;
		int min = 1;

		for (int i = 0; i < arr.length; i++){
			//arr[i]=i; ----> CARGA NUMEROS SUCESIVOS
			arr[i]=(int) (Math.floor(Math.random() * (max - min)) + min);;
		}
	}

	//IMPRIME EL ARREGLO	
	public static void imprimirArreglo(int [] arr){
		for (int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+ " ");
		}
	}

}
