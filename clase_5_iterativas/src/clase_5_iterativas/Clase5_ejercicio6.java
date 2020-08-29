/*
 * Escribir un programa que mientras que el usuario ingrese un número entero
entre 1 y 10 inclusive, lleve la suma de los números ingresados. Finalmente,
cuando sale del ciclo muestre por pantalla el resultado de la suma.
 */
package clase_5_iterativas;
 import java.io.BufferedReader;
 import java.io.InputStreamReader;
 
public class Clase5_ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int suma=0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		try {
			
			System.out.println("ingrese un numero del 1 al 10");
			num = Integer.valueOf(entrada.readLine());
			
			while((num != 0) && ((num>=1)&&(num<=10))) {
				suma += num;	
				
				System.out.println(suma);
				System.out.println("ingrese otro numero: ");
				num = Integer.valueOf(entrada.readLine());
			}
			System.out.println("El resultad final de la suma es: "+suma);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
		}
	}

}
