/*Dado un numero entero ingresado por teclado realice: _si el n�mero es 0 imprimir es cero, _si el numero es 1 o
*2 imprimir es uno o dos, si es cualquier otro numero imprimir si dicho numero es positivo o negativo.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase_4_Ejemplo_10 {
	public static void main(String[] args) {
		int numero;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese numero entero: ");
			numero = Integer.valueOf(entrada.readLine());
			switch (numero) {
				case 0: {
	
					System.out.println("Es cero");
					break;
	
				}
				case 1:
				case 2: {
	
					System.out.println("Es uno o dos");
					break;
	
				}
				default: {
	
					if (numero > 0) {
	
						System.out.println("Es positivo");
	
					} else {
	
						System.out.println("Es negativo");
	
					}
	
				}
			}
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}
}