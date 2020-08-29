/* Librerias para ingreso por teclado: */
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Libreria para creacion de arreglo aleatorio */
import java.util.Random;

public class apuntesJava {

	/* Constantes necesarias para carga e impresion de arreglos (valores a modificar)*/
	public static final int MAX = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	

	public static void main(String[] args) {
		/* declaracion de variables */

		char caracter = ' ';
		int numero;

		/* Buffer de ingreso por teclado: */
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)); 

		/* Lectura de ingresos por teclado  SIEMPRE ENTRE TRY - CATCH
		 * 
		numero = Integer.valueOf(entrada.readLine());
		caracter = entrada.readLine().charAt(0); */

		/* Impresion por pantalla */    
		System.out.println(" ");

		/* Manejo de excepciones */
		try{

		}
		catch (Exception exc){
			System.out.println(exc);
		}

		/* Caracter minuscula */
		if((caracter >= 'a') && (caracter <= 'z')) {
		}

		/* Caracter mayuscula */
		if((caracter >= 'A') && (caracter <= 'Z')) {
		}

		/* Caracter numero */
		if((caracter >='0') && (caracter <='9')) {

		}

	}

}
