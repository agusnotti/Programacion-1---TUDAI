/*Hacer un programa que dado un arreglo de enteros de tamano 10 que se encuentra precargado, encuentre la posicion de un numero entero
ingresado por el usuario. Si existe, muestre esa posicion por pantalla, o indique que no existe.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class ObtenerPosArreglo {
	
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static int MAX = 10;
	
	public static void main (String [] args) {
		
		int [] arrenteros = new int [MAX];
		int pos,numero;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			cargar_arreglo_aleatorio_int(arrenteros);
			imprimirArregloInt(arrenteros);
			System.out.println("Ingrese un numero entero :");
			numero = Integer.valueOf(entrada.readLine());
			pos = obtener_pos_arreglo(arrenteros,numero);
			if (pos<MAX){
				System.out.println(numero + " esta en " + pos);
			}
			else{
				System.out.println("No existe " + numero);
			}
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
	public static int obtener_pos_arreglo(int [] arr, int numero){
		int posicion = 0;
		while ((posicion < MAX) && (arr[posicion] != numero)){
			posicion++;
		}
		return posicion;
	}

	// ##################  CARGA ARREGLO ALEATORIO de ENTEROS  ---> con valores de MINVALOR a MAXVALOR definidas como constantes
		// INCORPORAR LA LIBRERIA import java.util.Random;
		public static void cargar_arreglo_aleatorio_int(int [] arr){
			Random r = new Random();
			for (int pos = 0; pos < MAX; pos++){
				arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
			}
		}

	//imprimir arreglo		
	public static void imprimirArregloInt(int [] arr){
		for (int pos = 0; pos < MAX; pos++){  //definir MAX como constante
			System.out.print(arr[pos]+ " ");
		}
	}
} 