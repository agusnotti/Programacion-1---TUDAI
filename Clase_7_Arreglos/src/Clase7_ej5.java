import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, solicite al usuario un numero entero y elimine la primer ocurrencia de numero (un
número igual) en el arreglo si existe. Para ello tendrá que buscar la posición y si está, realizar un
corrimiento a izquierda (queda una copia de la última posición del arreglo en la anteúltima
posición).
 */
public class Clase7_ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroIngresado;
		int [] numeros;
		numeros = new int [10];
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			cargarArreglo(numeros);
			System.out.println("ARREGLO ORIGINAL");
			imprimirArreglo(numeros);
			
			
			System.out.println("Ingrese un numero entre 1 y 10: ");
			numeroIngresado = Integer.valueOf(entrada.readLine());
			
			buscarOcurrencia(numeros, numeroIngresado);
			
			
			
			
			
		} catch (Exception e) {
			System.out.println("error"+ e);
		}

	}
	//buscar ocurrencia
	public static void buscarOcurrencia(int [] arr, int num) {
		boolean ocurrencia= false;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				corrimientoIzquierda(arr, i);
				ocurrencia=true;
				break;
			} 
		}
		
		System.out.println("hay ocurrencia? "+ocurrencia);
		if(ocurrencia) {
			System.out.println("ARREGLO nuevo");
			imprimirArreglo(arr);	
		}
	}
	
	//corrimiento izquierda
	public static void corrimientoIzquierda(int [] arr, int indice){
		int pos = arr.length -1;
		while (indice < pos){
			arr[indice] = arr[indice+1];
			indice++;
		}
	}
	
	//carga de arreglo de int con valores de MINVALOR a MAXVALOR
	public static void cargarArreglo(int [] arr){
		int max = 10;
		int min = 1;
				
		for (int i = 0; i < arr.length; i++){
			//arr[i]=i;
			arr[i]=(int) (Math.floor(Math.random() * (max - min)) + min);;
		}
	}
		
	//imprime el arreglo	
	public static void imprimirArreglo(int [] arr){
		for (int i = 0; i < arr.length; i++){
		System.out.println("numeros["+i+"]=>: "+arr[i]);
		}
	}

}
