import java.util.Random;

/**
 * Hacer un programa que dado una matriz de enteros de tamaño 5*10 que se encuentra
precargada, invierta el orden del contenido por fila. Este intercambio no se debe realizar
de manera explícita, hay que hacer un método que incluya una iteración de intercambio.
 *
 */
public class Clase8_ej1 {
	public static final int FILAS = 5;
	public static final int COLUMNAS = 5;
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 0;
	
	public static void main(String[] args) {
		int [][] matriz =  new int [FILAS][COLUMNAS];
		
		cargar_matriz_aleatorio_int(matriz);
		
		
		imprimir_matriz_int(matriz);
		System.out.println("");
		
		for (int i = 0; i < FILAS; i++) {			
			invertirArreglos(matriz[i]);			
		}
		
		
		imprimir_matriz_int(matriz);
	}
	
	
	public static void cargar_matriz_aleatorio_int(int [][] mat){
		Random r = new Random();
		for (int fila = 0; fila < FILAS; fila++){
			for (int columna = 0; columna < COLUMNAS; columna++){
				mat[fila][columna]=(r.nextInt(MAXVALOR+MINVALOR-1) + MINVALOR);
			}
		}
	}
	
	public static void cargar_matriz_identidad(int [][] mat) {
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				if(i == j) {
					mat[i][j] = 1;
				}
			}
		}
	}
	
	public static void imprimir_matriz_int(int [][] mat){
		for (int fila = 0; fila < FILAS; fila++){
			System.out.print("|");
			for (int columna = 0; columna < COLUMNAS; columna++){
				System.out.print(mat[fila][columna]+"|");
			}
			System.out.println("");
		}
	}
	
	public static void invertirArreglos(int[] arr) {
		int i = 0;
		int j = arr.length -1;  //o MAX
		int aux = 0;

		while(i < j) {
			aux = arr[i];
			arr[i] = arr[j];
			arr[j] = aux;
			i++;
			j--;			
		}
	}

}
