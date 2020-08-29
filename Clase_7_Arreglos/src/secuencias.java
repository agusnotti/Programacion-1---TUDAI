



public class secuencias {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numeros ={0,1,5,0,5,2,5,0,4,5,2,0};
		int inicio = 0;
		int fin = 0;
		
		
		imprimirArreglo(numeros); //imprime el arreglo original
		try {		
			
			while(inicio < numeros.length) {
				inicio = inicioSecuencia(numeros, inicio);
				if (inicio != -1) {
					fin = finSecuencia(numeros, inicio);
					if(fin != -1) {						
						System.out.println("inicio secuencia: "+inicio+ "y el fin esta en "+fin);	
						inicio = fin+1;
					}
					else inicio = numeros.length;					
				}
				else inicio = numeros.length;			
			}	
	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error"+e);
		}
	}
	
	public static void imprimirArreglo(int [] arr){
		for (int pos = 0; pos < arr.length; pos++){
		System.out.print(arr[pos]+ " ");
		}
	}

	public static int inicioSecuencia(int[] arr, int inicio) {
		int i = 0;
		
		while ((i < arr.length) && (arr[i] == 0)) {
			i++;
		}
		
		if(i < arr.length) {
			return i; 
		} else {
			return -1;
		}
	}
	
	public static int finSecuencia(int[] arr,  int inicio) {
		int i = inicio;
		
		while ((i < arr.length) && (arr[i] != 0)) {
			i++;
		}
		
		if(i < arr.length) {
			return i -1; 
		} else {
			return -1;
		}
	}
}