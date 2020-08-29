package clase_6_diseñoDescendente;

/*5. Escribir un programa que mientras el usuario ingresa un caracter distinto
del caracter ‘*’, invoque a un método que imprima si es caracter dígito o
caracter letra minúscula, y si es letra minúscula imprimir si es vocal o
consonante. 
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final char caracter = '*';
		char caracterIngresado = ' ';
		
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			System.out.println("Ingrese un caracter: ");
			caracterIngresado = entrada.readLine().charAt(0);
			
			while (caracterIngresado != caracter) {
				
				imprimirTipoCaracter(caracterIngresado);
								
				System.out.println("Ingrese un caracter: ");
				caracterIngresado = entrada.readLine().charAt(0);
			}
			System.out.println("ingreso *");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error" + e);
		}

	}
	public static void imprimirTipoCaracter (char a) {
		String mensaje = "El caracter ingresado es "; 
		
		if((a >= 'a') && (a <= 'z')) {
			System.out.println(mensaje + "letra minuscula");
			esVocalOConsonante (a);			
		} else if((a >= '0') && (a <= '9')) {
			System.out.println(mensaje +  "digito");
		} else {
			System.out.println(mensaje +  "distinto de caracter minuscula o caracter digito");
		}
	}
	
	public static void esVocalOConsonante (char letra) {
		if ((letra == 'a')|| (letra == 'e')|| (letra == 'i')|| (letra == 'o')|| (letra == 'u')) {
			System.out.println("Es vocal");
		} else {
			System.out.println("Es consonante");
		}
	}
	
	

}
