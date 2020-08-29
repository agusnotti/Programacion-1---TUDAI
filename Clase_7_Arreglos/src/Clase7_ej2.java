/*
 * 2. Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, obtenga la cantidad de números pares que tiene y la imprima.
 */
public class Clase7_ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numerosPares;
		int [] numeros;
		numeros = new int [10];
		
		try {
			cargarArreglo(numeros);
			imprimirArreglo(numeros);
			numerosPares= esPar(numeros);
			System.out.println("cantidad de numeros pares: "+numerosPares);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error"+e);
		}

	}
	//carga de arreglo de int con valores de MINVALOR a MAXVALOR
		public static void cargarArreglo(int [] arr){
			int max = 10;
			int min = 1;
					
			for (int i = 0; i < arr.length; i++){
				//arr[i]=i;
				arr[i]=(int) (Math.floor(Math.random() * (max - min)) + min);;
			}
		}
		
		public static void imprimirArreglo(int [] arr){
			for (int i = 0; i < arr.length; i++){
			System.out.println("numeros["+i+"]=>: "+arr[i]);
			}
		}
		
		public static int esPar(int [] arr) {
			int cantidadPares=0;
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]%2==0) {
					cantidadPares++;
					System.out.println(arr[i]);
				}
			}
			return cantidadPares;
		}

}
