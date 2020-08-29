/*
 * 15. Hacer un programa que dado el arreglo definido y precargado elimine del
arreglo todas las ocurrencias de una secuencia patrón dada por otro arreglo
de iguales características (solo tiene esa secuencia). Al eliminar se pierden los
valores haciendo los corrimientos.

 */
public class Clase7_ej15 {
	public static final int MAX = 20;

	public static void main(String[] args) {
		int [] arregloEnteros = {0,7,2,3,0,5,3,0,1,8,4,0,8,6,9,3,0,1,4,0};
		int [] arregloPatron = {0,7,2,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int indice = 0;
		int inicio;
		int fin;
		int inicioPatron;
		int finPatron;
		int longitudPatron;
		int longitudArregloEnteros;
		
		try {
			inicioPatron = obtener_inicio_secuencia(arregloPatron, indice);
			finPatron = obtener_fin_secuencia(arregloPatron, inicioPatron);
			longitudPatron = calcularLongitudSecuencia(inicioPatron, finPatron);			
			
			while(indice < MAX) {
				inicio =obtener_inicio_secuencia(arregloEnteros, indice);
				fin = obtener_fin_secuencia(arregloEnteros, inicio);
				longitudArregloEnteros = calcularLongitudSecuencia(inicio, fin);
				
				if(longitudPatron == longitudArregloEnteros) {
					int i = inicio;
					int j = inicioPatron;
					int cantidadElementos = 0;
					while((arregloEnteros[i] == arregloPatron[j])&&(cantidadElementos<longitudPatron)) {
						cantidadElementos++;
						i++;
						j++;
					}
					
					if(cantidadElementos == longitudPatron) {
						for (i = 0; i < longitudPatron; i++) {
							corrimientoIzquierda(arregloEnteros, inicio);
						}
						indice = inicio;
					} else {
						indice = fin+1;
					}
				} else {
					indice = fin+1;
				}
				
			}
			
			
			
			
		} catch (Exception e) {
			System.out.println("error"+e);
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
