/*
 * Se pide: hacer un programa completo en el cual se solicite de teclado el
ingreso de un día, un número de mes, y un año; luego calcule la cantidad
de días desde la última luna nueva (edad lunar), e informe por pantalla en
cual de las 4 fases se corresponde para esa fecha.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practico_2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia=0;
		int mes=0;
		int anio=0;
		int numAureo = 0;
		int epacta = 0;
		int edadLunar = 0;
		int diferenciaMensual = 0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	
		
		try {
			System.out.println("ingrese un dia: ");
			dia = Integer.valueOf(entrada.readLine());
			
			System.out.println("ingrese un numero de mes: ");
			mes = Integer.valueOf(entrada.readLine());
			
			System.out.println("ingrese un año: ");
			anio = Integer.valueOf(entrada.readLine());
			
			numAureo = calcularNumAureo(anio);
			epacta = calcularEpacta(numAureo);
			diferenciaMensual = calcularDiferenciaMensual(mes);
			edadLunar = epacta + diferenciaMensual + dia;
			
			if(edadLunar>29) {
				edadLunar %= 30;
			} 
			System.out.println(" La cantidad de días desde la última luna nueva (edad lunar) es: " + edadLunar);
			
			if((edadLunar>=0)&&(edadLunar<=6)) {
				System.out.println("Luna Nueva");
			} else if((edadLunar>6)&&(edadLunar<=13)) {
				System.out.println("Cuarto creciente");
			} else if((edadLunar>13)&&(edadLunar<=21)) {
				System.out.println("Luna Llena");
			}else if((edadLunar>21)&&(edadLunar<=29)) {
				System.out.println("Cuarto menguante");			
			}			
					
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error" + e);
		}

	}
	
	public static int calcularNumAureo(int anio) {
		int numAureo = (anio + 1)%19;
		
		return numAureo;
	}
	
	public static int calcularEpacta( int numAureo) {
		int epacta = ((numAureo-1)*11)%30;
		
		return epacta;
	}
	
	public static int calcularDiferenciaMensual(int mes) {
		int diferenciaMensual = 0;
		
		if((mes >= 3) && (mes<=12)) {
			diferenciaMensual= mes-2;
		} else if ((mes == 1) || (mes == 2)) {
			diferenciaMensual = mes +10;
		}
		
		return diferenciaMensual;
	}

}
