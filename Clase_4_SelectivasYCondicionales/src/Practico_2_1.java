//Hacer un programa que solicite la carga desde consola de un
//numero entero y realice:
//_si el numero es positivo, imprima “grande” si es mayor a 100 o “chico “ si
//es menor. Además deberá imprimir que el valor es positivo.
//_si no lo es, imprima si el numero es par, o si el numero es múltiplo de 3, o
//ninguna de las opciones anteriores.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practico_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		try {
			BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un numero entero");
			num=Integer.valueOf(entrada.readLine());
			
			if(num>0){
				if(num>100) {
					System.out.println("grande");
				}else {
					System.out.println("chico");
				}
				System.out.println("El numero es positivo");
			}else if(num%2==0){
				System.out.println("el numero es par");
			}else if(num%3==0) {
				System.out.println("el numero es multiplo de 3");
			}else {
				System.out.println("nunguna de las opciones");
			}
						
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		

	}

}
