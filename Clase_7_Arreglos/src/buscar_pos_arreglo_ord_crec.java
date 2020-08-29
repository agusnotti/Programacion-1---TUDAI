/*Hacer un programa que dado un arreglo de enteros ordenado creciente de tamano 10 que se encuentra precargado, encuentre la posicion
donde se encuentra un numero entero ingresado por el usuario. Si existe, muestre esa posicion por pantalla, o indique que no existe.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
public class buscar_pos_arreglo_ord_crec {
	
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static int MAX = 10;
	
	public static void main (String [] args) {
		
		int [] arrenteros = new int [MAX];
		int pos,numero;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			//CARGAR EL ARREGLO CON ALGUNO DE POR CONSOLA DE MANERA ORDENADA CRECIENTE
			cargarArregloPorTeclado(arrenteros);	
			//imprimirArregloInt(arrenteros);
			
			
			System.out.println("Ingrese un numero entero :");
			numero = Integer.valueOf(entrada.readLine());
			pos = buscarPosArregloOrdCrec(arrenteros,numero);
			
			if ((pos<MAX)&&(arrenteros[pos]==numero)){
				System.out.println("La posicion de "+numero+" es: "+pos);
			}
			else{
				System.out.println(numero + " no existe en el arreglo");
			}
		}
		
		catch(Exception exc){
			System.out.println(exc);
		}
	}
	
	//La posicion que retorna no significa que este ahí, es donde deberia estar
	public static int buscarPosArregloOrdCrec(int[] arr,int numero) {
		int pos = 0;
		while ((pos<MAX)&&(arr[pos]<numero)){
			pos++;
		}
		return pos;
	}
	
	//##################  CARGAR ARREGLO DESDE TECLADO	
		public static void cargarArregloPorTeclado(int[] arr) {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			try {
				for (int i = 0; i < MAX; i++){
					System.out.println("Ingrese un entero: ");

					arr[i]= Integer.valueOf(entrada.readLine()); /*arrEnteros es un arreglo, arrenteros[i] es como una variable de tipo entero a la que se le asigna un valor */
				}

			} catch (Exception e) {
				System.out.println("error"+e);			
			}		
		}
		
		//imprimir arreglo		
		public static void imprimirArregloInt(int [] arr){
			for (int pos = 0; pos < MAX; pos++){  //definir MAX como constante
				System.out.print(arr[pos]+ " ");
			}
		}
} 