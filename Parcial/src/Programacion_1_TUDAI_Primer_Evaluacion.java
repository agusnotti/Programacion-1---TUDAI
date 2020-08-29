/*
 * Hacer un programa que mientras el usuario ingrese un caracter distinto de '*' realice lo siguiente:
    _pida ingresar otro caracter,
    _cuente cuantas veces el nuevo caracter fue letra mayuscula y aparte cuantas veces fue digito,
    _si el nuevo caracter ingresado es vocal calcule la productoria de los primeros 18 numeros naturales e imprima el resultado por pantalla,
    _si el nuevo caracter no es vocal solicite ingresar un numero entero e imprima la tabla de multiplicar del numero ingresado.
    Finalmente cuando sale de la iteracion imprima por pantalla ambas cantidades (mayusculas y digitos) por separado.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Programacion_1_TUDAI_Primer_Evaluacion {
	public static final char ASTERISCO = '*';
	public static final int MAX_PRODUCTORIA = 18;
	public static final int MAX_MULTIPLICADOR = 10;

	public static void main(String[] args) {
		
		char nuevoCaracter = ' ';
		int contadorDigitos = 0;
		int contadorMayusculas = 0;
		int resultadoProductoria = 0;
		int numero;
		 
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			System.out.println("Ingrese un caracter: ");
			nuevoCaracter = entrada.readLine().charAt(0);
			
			while(nuevoCaracter != ASTERISCO) {
				
				if(esDigito(nuevoCaracter)) {
					contadorDigitos++;
				} else if (esLetra(nuevoCaracter)) {
					if (esMayuscula(nuevoCaracter)) {
						contadorMayusculas++;	
					}
					
					if (esVocal(nuevoCaracter)) {
						calcularProductoria();
						
					} else {
						System.out.println("Ingrese un numero entero");
						numero = Integer.valueOf(entrada.readLine());
						
						calcularTablaMultiplicar(numero);
					}
				}
				System.out.println("Ingrese un caracter: ");
				nuevoCaracter = entrada.readLine().charAt(0);
				
			}
			
			System.out.println("Cantidad de mayusculas: "+contadorMayusculas);
			System.out.println("Cantidad de digitos: "+contadorDigitos);
			
					
			
		} catch (Exception e) {
			System.out.println("error" + e);
		}



	}
	
	public static boolean esDigito(char caracter) {
		boolean esDigito = false;
		
		if((caracter >= '0') && (caracter <= '9')) {
			esDigito = true;
		}
		
		return esDigito;
	}
	
	public static boolean esMayuscula(char caracter) {
		boolean esMayuscula = false;
		
		if((caracter >= 'A') && (caracter <= 'Z')) {
			esMayuscula = true;
		}
		
		return esMayuscula;
	}
	
	public static boolean esLetra(char caracter) {
		boolean esLetra = false;
		
		if(((caracter >= 'A') && (caracter <= 'Z')) || ((caracter >= 'a') && (caracter <= 'z')) ) {
			esLetra = true;
		}
		
		return esLetra;
	}
	
	public static boolean esVocal(char caracter) {
		boolean esVocal = false;
		
		if ((caracter == 'a')|| (caracter == 'e')|| (caracter == 'i')|| (caracter == 'o')|| (caracter == 'u')) {
			esVocal = true;
		} 
		
		if ((caracter == 'A')|| (caracter == 'E')|| (caracter == 'I')|| (caracter == 'O')|| (caracter == 'U')) {
			esVocal = true;
		} 
		
		return esVocal;
	}
	
	public static void calcularProductoria() {
		long productoria = 1;
		
		for (int i = 1; i <= MAX_PRODUCTORIA; i++) {
			productoria = productoria * i;
		}
		
		System.out.println("El resultado de la productoria es: "+ productoria);
	}
	
	public static void calcularTablaMultiplicar(int numero) {
		int multiplicacion = 0;
		
		for (int i = 0; i <= MAX_MULTIPLICADOR; i++) {
			multiplicacion = numero * i;
			
			System.out.println(numero +" x "+i+ " = "+multiplicacion);
		}
	}
}
