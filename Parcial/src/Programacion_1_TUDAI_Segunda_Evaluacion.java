import java.util.Random;

/*
    Se tiene una matriz de enteros de tamanio 4*20 de secuencias de numeros entre 1 y 9 (por cada fila), separadas por 0.
    La matriz esta precargada, y ademas cada fila empieza y termina con uno o mas separadores 0. Se pide realizar un programa que:
    _elimine de cada fila la tercer y cuarta secuencia (por ejemplo si hay menos de 3 secuencias no hay que hacer nada,
    si hay 3 secuencias solo la tercera, si hay mas de 3 secuencias la tercera y cuarta).
 */

/* Utilizar la siguiente estructura de programa para resolver en enunciado, definiendo e implementando todos los metodos necesarios 
 * (salvo la carga inicial de las estructuras)*/

public class Programacion_1_TUDAI_Segunda_Evaluacion {

	public static final int MAXFILA = 4;
	public static final int MAXCOLUMNA = 20;
	public static final double probabilidad_numero = 0.4;
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 1;

	public static void main(String[] args) {

		int [][] matint;

		matint = new int[MAXFILA][MAXCOLUMNA];

		System.out.println("MATRIZ ORIGINAL");
		cargar_matriz_aleatorio_secuencias_int(matint);
		imprimir_matriz_int(matint);

		System.out.println("");

		realizar_segundo_ejercicio(matint);
		
		System.out.println("NUEVA MATRIZ");
		imprimir_matriz_int(matint);


	}

	public static void realizar_segundo_ejercicio(int [][] matint){

		//EN ESTE METODO DEBE RESOLVER EL ENUNCIADO MODULARIZANDO SEGUN CORRESPONDA

		for (int i = 0; i < MAXFILA; i++) {

			eliminarSecuencias(matint[i]);

		}
	}


	//ELIMINAR SECUENCIAS
	public static void eliminarSecuencias(int [] arr) {
		int indice = 0;
		int inicio = 0;
		int fin = 0;
		int contadorSecuencias = 0;


		while(indice < MAXCOLUMNA) {
			inicio =obtener_inicio_secuencia(arr, indice);
			fin = obtener_fin_secuencia(arr, inicio);
			contadorSecuencias++;

			int longitudSecuencia = calcularLongitudSecuencia(inicio, fin);


			if((contadorSecuencias == 3) || (contadorSecuencias == 4)) {
				for (int i = 0; i < longitudSecuencia; i++) {
					corrimientoIzquierda(arr, inicio);
				}
				indice = inicio;
			} else {
				indice = fin+1;
			}
		}
	}

	//CARGAR MATRIZ
	public static void cargar_matriz_aleatorio_secuencias_int(int [][] mat){
		for (int fila = 0; fila < MAXFILA; fila++){
			cargar_filas_matriz_secuencias(mat[fila]);
		}
		System.out.println("");
	}


	//CARGAR FILAS DE LA MATRIZ - SECUENCIAS
	public static void cargar_filas_matriz_secuencias(int []
			arr){
		Random r = new Random();
		arr[0] = 0;
		arr[MAXCOLUMNA-1] = 0;
		for (int pos = 1; pos < MAXCOLUMNA-1; pos++){
			if (r.nextDouble()>probabilidad_numero){  
				arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
			}
			else{
				arr[pos]=0;
			}
		}
	}

	//OBTENER INICIO DE SECUENCIA
	public static int obtener_inicio_secuencia(int[] arr, int inicio){
		while ((inicio < MAXCOLUMNA)&&(arr[inicio]==0))
			inicio++;
		return inicio;
	}

	//OBTENER FIN DE SECUENCIA
	public static int obtener_fin_secuencia(int[] arr, int inicio){
		while ((inicio < MAXCOLUMNA)&&(arr[inicio]!=0))
			inicio++;
		return inicio-1;
	}

	//CALCULAR LONGITUD DE SECUENCIA
	public static int calcularLongitudSecuencia(int inicio, int fin) {
		int longitudSecuencia = (fin - inicio)+1;

		return longitudSecuencia;
	}

	//CORRIMIENTO IZQUIERDA
	public static void corrimientoIzquierda(int [] arr, int indice){
		int pos = indice;
		while (pos < MAXCOLUMNA -1){  //o MAX
			arr[pos] = arr[pos+1];
			pos++;
		}
		if(indice == MAXCOLUMNA-1) {
			arr[indice] = 0;
		}			
	}

	//IMPRIMIR MATRIZ
	public static void imprimir_matriz_int(int [][] mat){
		for (int fila = 0; fila < MAXFILA; fila++){
			System.out.print(" | ");
			for (int columna = 0; columna < MAXCOLUMNA; columna++){
				System.out.print(mat[fila][columna]+" | ");
			}
			System.out.println("");
		}
	}

}