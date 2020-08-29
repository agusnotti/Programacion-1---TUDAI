//Hacer un programa que solicite la carga desde consola de
//un carácter y realice: imprima si es dígito, o letra minúscula, o
//es cualquier otro carácter. Si es letra minúscula indicar si es
//vocal o consonante.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practico_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char caracter;

		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un caracter:");
			caracter = entrada.readLine().charAt(0);

			if (Character.isDigit(caracter)) {

				System.out.println("es digito");

			} else if (caracter == Character.toLowerCase(caracter)) {
								
				System.out.println("es minuscula");
				
				switch (caracter) {
					case 'a':
					case 'e':
					case 'i':
					case 'o':
					case 'u': {
						
						System.out.println("es vocal");
						break;
					}
					default: {
						
						System.out.println("es consonante");
					}
				}
			} else {
				
				System.out.println("es mayuscula");
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
