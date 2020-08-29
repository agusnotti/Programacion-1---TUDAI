/*
 * 9. Hacer un programa que dado un arreglo de enteros de tamaño 10 que se
encuentra precargado, solicite al usuario el ingreso de dos números
enteros (posiciones del arreglo) y ordene de forma creciente el arreglo
entre dos posiciones correspondientes a los números ingresados.
 */

//declarar arreglo enteros
//declarar variable num1
//declarar variable num2
//solicitar al usuario el ingreso de 2 numeros (posiciones)
//ordenar el arreglo de manera creciente
//recorrerlo iniciando en la pos 1 hasta pos2

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random; 

public class Clase7_ej9 {

	public static final int MAX = 10;
	public static final int MAXVALOR = 50;
	public static final int MINVALOR = 1;

	public static void main(String[] args) {

		int [] numeros = new int [MAX];
		int pos1 = -1;
		int pos2 = -1;

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		try {

			cargar_arreglo_aleatorio_int(numeros);
			imprimirArregloInt(numeros);


			while(((pos1 < 0) || (pos1 >= MAX)) || ((pos2 < 0) || (pos2 >= MAX)) || (pos1 > pos2)){

				System.out.println("\nIngrese 2 valores entre 0 y 9: ");
				System.out.println("El valor inicial debe ser menor al valor final");
				
				System.out.println("\nIngrese valor 1");
				pos1 = Integer.valueOf(entrada.readLine());	
				System.out.println("\nIngrese valor 2 ");
				pos2 = Integer.valueOf(entrada.readLine());
			}
			
			

			ordenar_arreglo_insercion(numeros, pos1, pos2);			
			imprimirArregloInt(numeros);


		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error"+e);
		}

	}
	// ##################  CARGA ARREGLO ALEATORIO de ENTEROS  ---> con valores de MINVALOR a MAXVALOR definidas como constantes
	// INCORPORAR LA LIBRERIA import java.util.Random;
	public static void cargar_arreglo_aleatorio_int(int [] arr){
		Random r = new Random();
		for (int pos = 0; pos < MAX; pos++){
			arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
		}
	}

	// IMPRIMIR ARREGLO
	public static void imprimirArregloInt(int [] arr){
		for (int pos = 0; pos < MAX; pos++){  //definir MAX como constante
			System.out.print(arr[pos]+" | ");
		}
	}

	// ########  ORDENAR POR INSERCION  ---> verifica el elemento a la izquierda:  Si numIzq > numActual -> intercambian
	public static void ordenar_arreglo_insercion(int[]arr, int posIni, int posFin) {
		int aux, j;
		for (int i = posIni+1 ; i <= posFin; i++) {
			aux = arr[i];
			j = i - 1;
			while ((j >= posIni) && (arr[j] > aux)){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = aux;
		}
	}

}
