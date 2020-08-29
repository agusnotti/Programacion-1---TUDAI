package clase_6_diseñoDescendente;

/*
 * Escribir un diseño de programa que mientras que el usuario
ingrese un caracter dígito o caracter letra minúscula,
imprima dicho caracter, y si es caracter letra minúscula,
imprima si es vocal o consonante.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//definir una variable de tipo caracter
		//pedir al usuario que ingrese un caracter
		//si (caracter es un caracter digito o letra minuscula)
			//imprimir caracter
			//si (caracter letra minuscula)
				//si (caracter es vocal){
					//imprimir "es vocal"
				//sino (si es conconante){
					//imprimir "es consonante"
		
		char caracter;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Ingresar un caracter: ");
			caracter = entrada.readLine().charAt(0);
			
			while(((caracter >= 'a')&&(caracter <= 'z')) || ((caracter >='0')&&(caracter <='9'))) {
				
				System.out.println("El caracter ingresado es: "+caracter);
				
				if(((caracter >= 'a')&&(caracter <= 'z'))) {
					compararCaracter(caracter);	
				}
				
				System.out.println("Ingresar un caracter: ");
				caracter = entrada.readLine().charAt(0);
			}
			System.out.println("chau!");
					
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error"+ e);
		}

	}
	
	public static void compararCaracter(char c) {
		if((c =='a')||(c =='e')||(c =='i')||(c =='o')||(c =='u')) {
			System.out.println("El caracter es vocal.");
		} else {
			System.out.println("El caracter es consonante.");
		}
	}

}
