//Escribir un programa que permita el ingreso de un carácter y realice:
//_ imprima es carácter dígito si el carácter ingresado es carácter
//dígito,
//_ o imprima no es carácter dígito

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practico_1_1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char caracter;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese un caracter: ");
			caracter=entrada.readLine().charAt(0);
			
			if(Character.isDigit(caracter)) {
				System.out.println("Es caracter digito");
				
			} else {
				System.out.println("NO es caracter dígito");				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
}

}
