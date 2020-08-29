import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

/*
 * Se tiene un arreglo de enteros de tamaño 20 de secuencias de números entre
1 y 9, separadas por 0. El arreglo esta precargado, y además empieza y
termina con uno o más separadores 0. Considere para los siguientes ejercicios
este tipo de arreglo.
10. Hacer un programa que dado el arreglo definido y precargado permita
obtener a través de métodos la posición de inicio y la posición de fin de la
secuencia ubicada a partir de una posición entera ingresada por el
usuario. Finalmente, si existen imprima por pantalla ambas posiciones
obtenidas. 
 */


public class Clase7_ej10 {
	public static final int MAX = 20;
	public static final double probabilidad_numero = 0.4;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;

	public static void main(String[] args) {
		//int [] arregloEnteros = new int [MAX];
		
		int [] arregloEnteros = {0,1,2,3,0,5,3,0,1,8,4,0,8,6,9,3,0,1,4,0};
		int numero;
		int inicio;
		int fin;

		/* Buffer de ingreso por teclado: */
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)); 
		
		try {			
			
			//cargar_arreglo_aleatorio_secuencias_int(arregloEnteros);			
			imprimir_arreglo_secuencias_int(arregloEnteros);
			
			System.out.println("ingrese un valor entre 1 y 20: ");
			numero = Integer.valueOf(entrada.readLine());
			
			while((numero < 1) || (numero > 20)){
				
				System.out.println("ingrese un valor entre 1 y 20: ");
				numero = Integer.valueOf(entrada.readLine());
			}
			
			
			
			inicio = obtener_inicio_secuencia(arregloEnteros, numero-1);
			fin = obtener_fin_secuencia(arregloEnteros, inicio);
			
			System.out.println("inicio secuancia: "+(inicio +1)+". Fin secuencia: "+(fin+1));
			
			
			
			
			
			
		} catch (Exception e) {
			System.out.println("error"+e);
		}
		

	}
	
	//##################  CARGAR ARREGLO DE SECUENCIAS INT
	public static void cargar_arreglo_aleatorio_secuencias_int(int [] arr){
		Random r = new Random();
		arr[0] = 0;
		arr[MAX-1] = 0;
		for (int pos = 1; pos < MAX-1; pos++){
			if (r.nextDouble()>probabilidad_numero){  //public static final double probabilidad_numero = 0.4;
				arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
			}
			else{
				arr[pos]=0;
			}
		}
	}
	
	//##################  IMPRIMIR ARREGLO de SECUENCIAS INT
	public static void imprimir_arreglo_secuencias_int(int [] arr){
		System.out.print("Arreglo de secuencias int\n|");
		for (int pos = 0; pos < MAX; pos++){
			System.out.print(arr[pos]+" | ");
		}
		System.out.print("\n");
	}
	
//	//##################  OBTENER INICIO DE SECUENCIA
//	public static int obtener_inicio_secuencia(int[] arr, int inicio){
//		while ((inicio < MAX)&&(arr[inicio]==0))
//			inicio++;
//		return inicio;
//	}
	
	//##################  OBTENER INICIO DE SECUENCIA
	public static int obtener_inicio_secuencia(int[] arr, int inicio){
		while ((inicio > 0)||(arr[inicio]!=0)) {
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

}
