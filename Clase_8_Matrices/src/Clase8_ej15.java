/*Hacer un programa que dada la matriz de secuencias de caracteres definida y 
*precargada elimine todas las secuencias que tienen orden descendente entre sus elementos.
 */

public class Clase8_ej15 {

    public static final int MAXFILA = 3;
    public static final int MAXCOLUMNA = 20;

    public static void main(String[] args) {
        int[][] matint = 	{{0, 1, 2, 0, 3, 4, 0, 6, 5, 4, 3, 0, 0, 2, 3, 5, 0, 8, 5, 0},
        					{0, 1, 5, 0, 3, 4, 0, 6, 8, 4, 3, 0, 0, 2, 3, 5, 0, 8, 5, 0},
        					{0, 1, 2, 3, 3, 4, 0, 6, 5, 7, 3, 0, 0, 5, 2, 1, 0, 8, 9, 0}};
        
        
        try {
        	imprimir_matriz(matint);
        	eliminar_secuencias_descendentes(matint);
        	System.out.println("Descendentes eliminados:");
        	imprimir_matriz(matint);
        	
        	
        	
			
		} catch (Exception e) {
			System.out.println("error"+ e);
		}
        
        
    }

    public static void imprimir_matriz(int[][] mat) {
        for (int fila = 0; fila < MAXFILA; fila++) {
            System.out.print("|");
            for (int columna = 0; columna < MAXCOLUMNA; columna++) {
                System.out.print(mat[fila][columna] + "|");
            }
            System.out.println("");
        }
    }

    public static void eliminar_secuencias_descendentes(int[][] mat) {
        for (int fila = 0; fila < MAXFILA; fila++) {
            eliminar_secuencias_descendentes_fila(mat[fila]);
        }
    }

    public static void eliminar_secuencias_descendentes_fila(int[] arr) {
        int inicio, fin;
        inicio = 0;
        fin = -1;
        while (inicio < MAXCOLUMNA-1) {
            inicio = buscar_inicio_secuencia(arr, fin + 1);
            if (inicio < MAXCOLUMNA-1) {
                fin = buscar_fin_secuencia(arr, inicio);
                if (es_descendente(arr, inicio, fin) == true) {
                    int veces = (fin - inicio) + 1;
                    while (veces > 0) {
                        corrimiento_izq(arr, inicio);
                        veces--;
                    }
                }
            }
        }
    }

    public static boolean es_descendente(int[] arr, int inicio, int fin) {
        int i = inicio;
        while ((i < fin) && (arr[i + 1] <= arr[i])) {           
            System.out.println(arr[i+1]);
            System.out.println(arr[i]);
            i++;
        } 
        return i == fin;
    }

    public static int buscar_inicio_secuencia(int[] arr, int pos) {
        while ((pos < MAXCOLUMNA-1) && (pos == 0)) {
            pos++;
        }
        return pos;
    }

    public static int buscar_fin_secuencia(int[] arr, int pos) {
        while ((pos < MAXCOLUMNA-1) && (pos != 0)) {
            pos++;
        }
        return pos - 1;
    }

    public static void corrimiento_izq(int[] arr, int inicio) {
        for (int i = inicio; i < MAXCOLUMNA; i++) {
            arr[i] = arr[i + 1];
        }
    }
}
