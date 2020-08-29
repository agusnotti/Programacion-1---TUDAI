/*Hacer un programa que dado un arreglo de enteros de tamano 8 que se encuentra precargado, solicite al usuario una posicion y
realice un corrimiento a derecha o hacia la mayor posicion del arreglo. Ademas imprima el arreglo antes y despues del
corrimiento
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
public class Corrimiento_derecha {
	
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static int MAX = 8;
	
	public static void main(String[] args) {
		
		int [] arrenteros;
		arrenteros = new int[MAX];
		int pos;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			cargar_arreglo_aleatorio_int(arrenteros);
			imprimirArregloInt(arrenteros);
			
			System.out.println("Ingrese un numero entero pos:");
			pos = Integer.valueOf(entrada.readLine());
			
			corrimiento_der(arrenteros,pos);
			
			imprimirArregloInt(arrenteros);
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
	public static void corrimiento_der(int [] arrenteros, int pos){
		int indice = MAX-1;
		while (indice > pos){
			arrenteros[indice] = arrenteros[indice-1];
			indice--;
		}
	}
	
	public static void cargar_arreglo_aleatorio_int(int [] arr){
		Random r = new Random();
		for (int pos = 0; pos < MAX; pos++){
			arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
		}
	}
	
	public static void imprimirArregloInt(int [] arr){
		for (int pos = 0; pos < MAX; pos++){  //definir MAX como constante
			System.out.print(arr[pos]+ " ");
		}
	}
}
