import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * 13. Hacer un programa que dado el arreglo definido y precargado, y un número
entero ingresado por el usuario, elimine las secuencias de tamaño igual al
número ingresado.
 */

//pedir al usuario que ingrese un numero
//recorrer el arreglo ---> mientras (indice < MAX) 
		//obtener inicio
		//obtener final
		// obtengo longitud de la secuencia --> (fin - inicio) +1 	
			//si longtud == numero	
					//corrimiento izq
		


public class Clase7_ej13 {
	public static final int MAX = 20;

	public static void main(String[] args) {
		int [] arregloEnteros = {0,1,2,3,0,5,3,0,1,8,4,0,8,6,9,3,0,1,4,0};
		int numero;
		int indice = 0;
		int inicio;
		int fin;
		int longitudSecuencia;
		boolean haySecuancias = false;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			imprimir_arreglo_secuencias_int(arregloEnteros);
			
			System.out.println("ingrese un numero: ");
			numero = Integer.valueOf(entrada.readLine());
			
			while(indice < MAX) {
				inicio = obtener_inicio_secuencia(arregloEnteros, indice);
				fin = obtener_fin_secuencia(arregloEnteros, inicio);
				
				longitudSecuencia = calcularLongitudSecuencia(inicio, fin);
				
				if(longitudSecuencia == numero) {
					haySecuancias = true;
					for (int i = 0; i < longitudSecuencia; i++) {
						corrimientoIzquierda(arregloEnteros, inicio);
					}
				}
				indice++;
			}
			System.out.println("¿Hay secuencias? "+haySecuancias);
			
			if(haySecuancias) {
				imprimir_arreglo_secuencias_int(arregloEnteros);	
			}
			
			
			
			
			
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

	//##################  CALCULAR LONGITUD DE SECUENCIA
	public static int calcularLongitudSecuencia(int inicio, int fin) {
		int longitudSecuencia = (fin - inicio)+1;

		return longitudSecuencia;
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

}
