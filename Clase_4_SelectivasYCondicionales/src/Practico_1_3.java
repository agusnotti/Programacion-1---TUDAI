//Escribir un programa que ingrese un número entero por teclado y
//realice:
//_ imprima es múltiplo de 6 y de 7 si cumple con esa condición,
//_ o imprima es mayor a 30 y múltiplo de 2 si cumple con esa
//condición,
//_ imprima si el cociente de la división de dicho número con 5 es
//mayor a 10 sin importar las condiciones previas.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practico_1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int entero;
		
		try {
			BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un numero entero: ");
			entero = Integer.valueOf(entrada.readLine());
			
			if((entero%6==0)&&(entero%7==0)) {
				System.out.println("Es múltiplo de 6 y de 7");
			
			}else if((entero > 30)&&(entero%2==0)) {
				System.out.println("Es mayor a 30 y múltiplo de 2");
			}
			
			if(entero/5>10) {
				System.out.println("El cociente de la división de dicho número con 5 es mayor a 10");
			} else {
				System.out.println("El cociente de la división de dicho número con 5 NO es mayor a 10");
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		

	}

}
