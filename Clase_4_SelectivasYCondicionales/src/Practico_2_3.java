//Construir un programa que solicite desde teclado un n�mero de
//mes y posteriormente notifique por pantalla la cantidad de d�as
//de ese mes. En el caso de que ingrese 2 como n�mero de mes
//(febrero), para imprimir la cantidad de d�as deber� solicitar
//ingresar un n�mero de anio (no usar �), para determinar si es
//bisiesto o no con la siguiente sentencia:
//_si ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) es verdadero,
//entonces es bisiesto.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practico_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroMes;
		int anio;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un numero de mes: ");
			numeroMes= Integer.valueOf(entrada.readLine());
			
			switch(numeroMes) {
				case 4:
				case 6:
				case 9:
				case 11:{
					
					System.out.println("Tiene 30 dias");
					break;
				}
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12: {
					System.out.println("Tiene 31 dias");
					break;
				}
				case 2: {
					if(numeroMes == 2) {
						System.out.println("ingrese a�o: ");
						anio= Integer.valueOf(entrada.readLine());
						
						if((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
							System.out.println("a�o bisiesto");
							System.out.println("tiene 29 dias");
						} else {
							System.out.println("tiene 28 dias");
						}					
					}
				}
				default: {
					System.out.println("ERROR! Ingrese un numero del 1 al 12");
				}
			}
						
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Debe ingresar un numero");
		}

	}

}
