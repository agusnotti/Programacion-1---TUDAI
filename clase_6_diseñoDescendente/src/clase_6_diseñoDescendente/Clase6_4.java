package clase_6_diseñoDescendente;

/*
 * Escribir un programa que mientras el usuario cargue desde
teclado un numero entero distinto de 0, imprima por
pantalla la suma que se obtiene de invocar un método
que calcula la sumatoria de los primeros 200 números
naturales (son números enteros en 1 y 200). 
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		int suma;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Ingresar un numero: ");
			numero = Integer.valueOf(entrada.readLine());
			
			while(numero != 0) {
				
				suma= sumar();
				System.out.println(suma);
				
				System.out.println("Ingresar un numero: ");
				numero = Integer.valueOf(entrada.readLine());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error"+e);
		}
	}
	
	public static int sumar() {
		int suma = 0;
		int max = 200;
		
		for (int i = 0; i <= max; i++) {
			suma += i;
		}		
		return suma;
	}

}
