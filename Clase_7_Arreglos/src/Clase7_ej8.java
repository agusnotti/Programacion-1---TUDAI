/*
 * 8. Hacer un programa que dado un arreglo ordenado creciente de enteros
de tamaño 10 que se encuentra precargado, solicite al usuario un numero
entero y elimine la primer ocurrencia de numero (un número igual) en el
arreglo si existe.
 */

//declarar un arreglo de enteros de tamaño 10
//declarar una variable entero
//pedirle al usuario que ingrese un numero
//recorrer el arreglo buscando la primer ocurrencia de ese numero
	// si existe la ocurrencia
		//hacer un corrimiento a izquierda para eliminarla


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase7_ej8 {
	
	public static final int MAX = 10; 

	public static void main(String[] args) {
		int [] numeros = new int [MAX];
		int numero; 
		int posOcurrencia;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			System.out.println("ARREGLO ORIGINAL");
			cargarArreglo(numeros);
			imprimirArregloInt(numeros);
			
			System.out.println("\nIngrese un numero: ");
			numero = Integer.valueOf(entrada.readLine());
			
			
			
			
			posOcurrencia = buscarOcurrencia(numeros, numero);
			
			if(posOcurrencia != -1) {
				corrimientoIzquierda(numeros, posOcurrencia);
			}	
			
			System.out.println("ARREGLO NUEVO");			
			imprimirArregloInt(numeros);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		
		

	}
	//##################  CORRIMIENTO IZQUIERDA  ---> BORRAR ELEMENTO DE ARREGLO
		public static void corrimientoIzquierda(int [] arr, int indice){
			int pos = indice;
			while (pos < MAX -1){  //o MAX
				arr[pos] = arr[pos+1];
				pos++;
			}
			if(indice == MAX-1) {
				arr[indice] = 0;
			}			
		}
	
	
	// IMPRIMIR ARREGLO
	public static void imprimirArregloInt(int [] arr){
		for (int pos = 0; pos < MAX; pos++){  //definir MAX como constante
			System.out.print(arr[pos]+" | ");
		}
	}
	
	
	//##################  CARGAR ARREGLO
	public static void cargarArreglo(int[] arr) {
		for (int i = 0; i < MAX; i++) {
			arr[i] = i;
		}
	}
	
	//##################  ENCONTRAR POSICION
	public static int buscarOcurrencia(int[] arr, int num) {
		int pos = -1; //en caso de que la ocurrencia no este me retorna -1
		int i = 0;
		
		while((i < MAX) && (pos == -1)) {
			if(arr[i] == num) {
				pos = i;
			}			
			i++;		
		}
		
		return pos;
	}
	

}
