import java.util.Random;

public class Ejemplo_ordenamiento {
	
	public static int MAX = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	
	public static void main(String[] args) {
		int [] arrint;
		arrint = new int[MAX];
		
		cargar_arreglo_aleatorio_int(arrint);
		imprimirArregloInt(arrint);
		
		System.out.println(' ');
		
		//PROBAR LLAMAR LOS METODOS PARA ORDENAR (ARRINT);
		
		//ordenar_arreglo_seleccion(arrint);
		
		ordenar_arreglo_insercion(arrint);
		
		//cargar_arreglo_aleatorio_int(arrint);
		
		
		imprimirArregloInt(arrint);
	}


	// ########  ORDENAR POR SELECCION
	public static void ordenar_arreglo_seleccion(int[]arr) {
		int pos_menor, tmp;
		for (int i = 0; i < MAX; i++) {
			pos_menor = i;
			for (int j = i + 1; j < MAX; j++){
				if (arr[j] < arr[pos_menor]) {
					pos_menor = j;
				}
			}
			if (pos_menor != i){
				tmp = arr[i];
				arr[i] = arr[pos_menor];
				arr[pos_menor] = tmp;
			}
		}
	}


	// ########  ORDENAR POR INSERCION  ---> verifica el elemento a la izquierda:  Si numIzq > numActual -> intercambian
	public static void ordenar_arreglo_insercion(int[]arr) {
		int aux, j;
		for (int i = 1; i < MAX; i++) {
			aux = arr[i];
			j = i - 1;
			while ((j >= 0) && (arr[j] > aux)){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = aux;
		}
	}


	// ########  ORDENAR POR BURBUJEO ---> verifica el elemento a la derecha:  Si numActual > numSig -> intercambian
	public static void ordenar_arreglo_burbujeo(int[] arr){
		int temp;
		for(int i = 1;i < MAX;i++){
			for (int j = 0 ; j < MAX - 1; j++){
				if (arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	// ########  CARGAR ALEATORIO	
	public static void cargar_arreglo_aleatorio_int(int [] arr){
		Random r = new Random();
		for (int pos = 0; pos < MAX; pos++){
			arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
		}
	}
	
	
	// ##################  IMPRIMIR ARREGLO	
		public static void imprimirArregloInt(int [] arr){
			for (int pos = 0; pos < MAX; pos++){  //definir MAX como constante
				System.out.print(arr[pos]+ " ");
			}
		}
}