/*
 * 11. Hacer un programa que dado el arreglo definido y precargado permita
encontrar la posición de inicio y fin de la secuencia cuya suma de valores sea
mayor.
 */

//definir el arreglo
//cargar el arreglo
//recorrer el arreglo
	//
public class Clase7_ej11 {
	public static final  int MAX = 20;
	
	public static void main(String[] args) {
		int [] arregloEnteros = {0,1,2,3,0,5,3,0,1,8,4,0,8,6,9,3,0,1,4,0};
		int indice = 0;
		int inicio =0;
		int fin = 0;
		int inicioAux;
		int finAux;
		int resultadoSuma = 0;
		int resAux = 0;
		
		try {
			
			imprimir_arreglo_secuencias_int(arregloEnteros);
			
			while(indice < MAX) {
				
				inicioAux = obtener_inicio_secuencia(arregloEnteros, indice);
				finAux = obtener_fin_secuencia(arregloEnteros, indice);
				
				resAux = obtener_suma_secuencia(arregloEnteros, inicioAux, finAux);
				
				if (resAux > resultadoSuma) {
					resultadoSuma = resAux;
					inicio = inicioAux;
					fin = finAux;
				}
						
				indice++;
			}
			
			System.out.println("inicio secuencia: "+inicio+". Fin secuencia: "+fin);
			
			
			
			
		} catch (Exception e) {
			System.out.println("error"+e);
		}

		
		
		
		
	}
	
	//##################  OBTENER SUMA DE SECUENCIA
		public static int obtener_suma_secuencia(int[] arr, int inicio, int fin){
			int suma = 0;
			while (inicio <= fin){
				suma+=arr[inicio];
				inicio++;
			}
			return suma;
		}

		//##################  IMPRIMIR SUMA DE SECUENCIA
		public static void imprimir_suma_cada_secuencia(int[] arr){
			int inicio,fin,suma;
			inicio = 0;
			fin = -1;
			while ((inicio < MAX)){
				inicio = obtener_inicio_secuencia(arr,fin+1); 
				if (inicio < MAX){
					fin = obtener_fin_secuencia(arr,inicio);
					suma = obtener_suma_secuencia(arr,inicio,fin);
					System.out.println("La suma de la secuencia de "+inicio+" a "+fin+" es "+suma);
				}
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

}
