/*
 * Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, invierta el orden del contenido (por ejemplo: el que está en 0 se intercambia con
el que está en 9, el que está en 1 con el que está en 8…). Este intercambio no se debe realizar
de manera explícita, hay que hacer un método que incluya una iteración de intercambio.
 */
public class Clase7_ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numeros;
		numeros = new int [11];
		
		try {
			cargarArreglo(numeros); //carga el arreglo
			System.out.println("ARREGLO ORIGINAL");
			imprimirArreglo(numeros); //imprime el arreglo original
			
			invertirArreglo(numeros);
			
			System.out.println("ARREGLO INVERTIDO");			
			imprimirArreglo(numeros); //imprime el arreglo invertido
			
	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error"+e);
		}
	}

	//carga de arreglo de int con valores de MINVALOR a MAXVALOR
	public static void cargarArreglo(int [] arr){
		//int max = 10;
		//int min = 1;
				
		for (int pos = 0; pos < arr.length; pos++){
			arr[pos]=pos;
			//arr[pos]=(int) (Math.floor(Math.random() * (max - min)) + min);;
		}
	}
	
	public static void imprimirArreglo(int [] arr){
		for (int pos = 0; pos < arr.length; pos++){
		System.out.print(arr[pos]+ " ");
		}
	}
	
	
	public static void invertirArreglo(int [] arr) {
		int aux;
		int n = arr.length -1;
		for(int i = 0;i < n; i++){
			aux = arr[i];         //en aux se almacena primer numero
			arr[i] = arr[n];      //en la primera posicion se guarda el ultimo valor
			arr[n]=aux;           //en la ultima pos se almacena aux que tenia el primer valor
			n--;                  //se disminuye de  derecha a izquierda el arreglo
	      }	
	}
	
	
//	public static void invertirArreglos(int[] arr) {
//		int i = 0;
//		int j = arr.length -1;
//		int aux = 0;
//		
//		while(i < j) {
//			aux = arr[i];
//			arr[i] = arr[j];
//			arr[j] = aux;
//			i++;
//			j--;			
//		}
//	}
}
