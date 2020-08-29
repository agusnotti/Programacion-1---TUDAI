/*
 * 12. Hacer un programa que dado el arreglo definido y precargado permita
encontrar la posición de inicio y fin de la anteúltima secuencia (considerar
comenzar a buscarla a partir de la ultima posición del arreglo).
 */
public class Clase7_ej12 {
	public static final  int MAX = 20;
	public static final  int MIN = 0;
	public static final int SEC = 2;

	public static void main(String[] args) {
		int [] arregloEnteros = {0,1,2,3,0,5,3,0,1,8,4,0,8,6,9,3,0,1,4,0};
		int inicio =0;
		int fin = 0;
		int contador = 0;
		int i = MAX-1;
		
		
		try {
			
			imprimir_arreglo_secuencias_int(arregloEnteros);
			
			while((i > MIN) && (contador != SEC)) {
				inicio = obtener_inicio_secuencia(arregloEnteros, i-1);
				fin = obtener_fin_secuencia(arregloEnteros, inicio);
				
				contador++;
				i = inicio-1;
			}
			
			System.out.println("inicio secuencia: "+inicio+". Fin secuencia: "+fin);
			System.out.println("secuencia: "+contador);
			
			
		} catch (Exception e) {
			System.out.println("error"+e);
		}

	}
	
	//##################  OBTENER INICIO DE SECUENCIA
		public static int obtener_inicio_secuencia(int[] arr, int inicio){
			while ((inicio > 0)&&(arr[inicio]!=0)) {
					inicio--;				
			}
			return inicio+1;
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
	
	
		
		

}
