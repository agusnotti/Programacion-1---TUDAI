//Escribir un programa que permita el ingreso de un car�cter y realice:
//_ imprima es car�cter d�gito si el car�cter ingresado es car�cter
//d�gito,
//_ o imprima no es car�cter d�gito

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
				System.out.println("NO es caracter d�gito");				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
}

}
