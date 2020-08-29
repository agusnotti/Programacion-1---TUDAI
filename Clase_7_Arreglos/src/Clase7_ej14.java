import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * 14. Hacer un programa que dado el arreglo definido y precargado, y un número
entero ingresado por el usuario, copie de forma continua las secuencias de
tamaño igual al número ingresado en otro arreglo de iguales características e
inicializado con 0. La copia en este último arreglo deben comenzar desde el
principio del mismo.
 */

//definir un arreglo de enteros (original)
//cargar arreglo
//definir un arreglo (copia)
//inicializarlo en 0
//definir una varible entero
//asignarle valor ingresado por usuario
//recorrer arreglo original ---> mientras (indice < MAX)
//buscar inicio secuencia
//buscar fin secuencia
//obtener longitud de secuencia
//evaluar si longitud de secuencia en igual a numero ingresado
//recorro la secuencia
//copio en arreglo copia


public class Clase7_ej14 {
	public static final int MAX = 20;

	public static void main(String[] args) {
		int [] arregloEnteros = {0,7,2,3,0,5,3,0,1,8,4,0,8,6,9,3,0,1,4,0};
		int [] arregloCopia = new int [MAX];
		int numero;
		int indice = 0;
		int inicio;
		int fin;
		int longitudSecuencia;
		int j = 0;



		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));		

		try {
			imprimir_arreglo_secuencias_int(arregloEnteros);

			System.out.println("ingrese un numero: ");
			numero = Integer.valueOf(entrada.readLine());

			while(indice < MAX) {
				inicio = obtener_inicio_secuencia(arregloEnteros, indice);
				fin = obtener_fin_secuencia(arregloEnteros, inicio);

				longitudSecuencia = calcularLongitudSecuencia(inicio, fin);
				
				// arreglo de 20 posiciones
				// secuencias de 3 (longitud 3)
				// inicio 10... 10, 11, 12
				// for iniciar en 10 y terminar en 12..
				// for iniciando en inicio (10)
				// for termina en longitud --> 3
				// < inicio + longitud... 

				if(longitudSecuencia == numero) {					
					for (int i = inicio; i <= fin; i++) {
						arregloCopia[j] = arregloEnteros[i];
						j++;
					}
				}

				indice = fin +1; //pra posicionarme en la proxima secuencia
			}
			
			imprimir_arreglo_secuencias_int(arregloCopia);



		} catch (Exception e) {
			System.out.println("ERROR"+e);
		}

	}
	
	
	//##################  OBTENER INICIO DE SECUENCIA
	public static int obtener_inicio_secuencia(int[] arr, int inicio){
		while ((inicio < MAX)&&(arr[inicio]==0))
			inicio++;
		return inicio;
	}

	//##################  OBTENER FIN DE SECUENCIA
	public static int obtener_fin_secuencia(int[] arr, int inicio){
		while ((inicio < MAX)&&(arr[inicio]!=0))
			inicio++;
		return inicio-1;
	}

	//##################  IMPRIMIR ARREGLO de SECUENCIAS INT
	public static void imprimir_arreglo_secuencias_int(int [] arr){
		System.out.print("Arreglo de secuencias int\n|");
		for (int pos = 0; pos < MAX; pos++){
			System.out.print(arr[pos]+" | ");
		}
		System.out.print("\n");
	}

	//##################  CALCULAR LONGITUD DE SECUENCIA
	public static int calcularLongitudSecuencia(int inicio, int fin) {
		int longitudSecuencia = (fin - inicio)+1;

		return longitudSecuencia;
	}

}
