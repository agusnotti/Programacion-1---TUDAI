import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class APUNTES_ARREGLOS_MATRICES {
	/* Constantes necesarias para carga e impresion de arreglos (valores a modificar)*/

	public static final  int MAX = 10; 
	public static final  int MIN = 0;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static final int MAXFILA = 4;
	public static final int MAXCOLUMNA = 5;
	public static final double probabilidad_letra = 0.4;
	public static final double probabilidad_numero = 0.4;

	public static void main(String[] args) {
		int numero = 0;

		//Declarar un arreglo como colección de datos de un tipo tiene la forma tipo_dato [] nombre_arreglo; NO TIENE DATOS TODAVIA, SOLO ES UNA REFERECNIA DE DONDE ESTARAN LOS DATOS.
		int [] arrEnteros;   
		char [] arrChar;		
		double [] arrDouble;



		//Para hacer el espacio donde estarán los datos se realiza nombre_arreglo = new tipo_dato[CANTIDAD];
		arrEnteros = new int [MAX];    
		arrChar = new char[MAX];;
		arrDouble = new double[MAX];

		// arrEnteros = {1, 3, 5}; La asignación de espacio por extension. SOLO SE USA CUANDO SE PIDE DE HACERLO DE ESA FORMA.


		//DECLARACION DE MATRIZ
		int [][] matentero;

		//ASIGANCION DE ESPACIO DE MATRIZ
		matentero = new int [MAXFILA][MAXCOLUMNA];

		//mat[fila] es un arreglo de enteros al que se le pueden aplicar los métodos desarrollados sobre arreglos.


		try{


			System.out.println("ARREGLO POR TECLADO");			
			cargarArregloPorTeclado(arrEnteros);
			imprimirArregloInt(arrEnteros);		



			System.out.println("ARREGLO ALEATORIO DE ENTEROS");
			cargar_arreglo_aleatorio_int(arrEnteros);
			imprimirArregloInt(arrEnteros);


			System.out.println("ARREGLO ALEATORIO DE CHAR");
			cargar_arreglo_aleatorio_char(arrChar);
			imprimir_arreglo_char(arrChar);



			cargar_arreglo_aleatorio_double(arrDouble);
			imprimir_arreglo_double(arrDouble);

			obtener_pos_arreglo(arrEnteros, numero);

			buscarPosOcurrencia(arrEnteros, numero);



			/* ACCESO A UN ELEMENTO DE UN ARREGLO */

			//arrEnteros[0] = 1;  --> se accede a la posición 0 del arreglo y se le asigna un 1. NO ES RECOMENDADO

			// int pos = 2;                
			// arrEnteros[pos] = 5;  --> se accede a la posición pos del arreglo y se le asigna un 5. USAR ESTE!!
			//pos tiene que tener un valor entre 0 y CANTIDAD-1 de elementos del arreglo, sino dará ERROR



		}
		catch(Exception exc){
			System.out.println(exc);
		}


	}

	/* ###################################################    FUNCIONES     ############################################################*/

	// ##################  IMPRIMIR ARREGLO	
	public static void imprimirArregloInt(int [] arr){
		for (int pos = 0; pos < MAX; pos++){  //definir MAX como constante
			System.out.print(arr[pos]+ " ");
		}
	}


	// ##################  IMPRIMIR ARREGLO de CHAR
	public static void imprimir_arreglo_char(char [] arr){
		for (int pos = 0; pos < MAX; pos++){   //definir MAX como constante
			System.out.println("nombre_arreglo["+pos+"]=>: "+arr[pos]);
		}
	}


	//##################  IMPRIMIR ARREGLO de DOUBLE
	public static void imprimir_arreglo_double(double [] arr){
		for (int pos = 0; pos < MAX; pos++){  //definir MAX como constante
			System.out.println("nombre_arreglo["+pos+"]=>: "+arr[pos]);
		}
	}


	//##################  IMPRIMIR ARREGLO de SECUENCIAS CHAR
	public static void imprimir_arreglo_secuencias_char(char [] arr){
		System.out.print("Arreglo de secuencias char\n|");
		for (int pos = 0; pos < MAX; pos++){
			System.out.print(arr[pos]+"|");
		}
		System.out.print("\n");
	}


	//##################  IMPRIMIR ARREGLO de SECUENCIAS INT
	public static void imprimir_arreglo_secuencias_int(int [] arr){
		System.out.print("Arreglo de secuencias int\n|");
		for (int pos = 0; pos < MAX; pos++){
			System.out.print(arr[pos]+"|");
		}
		System.out.print("\n");
	}



	//##################  CARGAR ARREGLO DESDE TECLADO	
	public static void cargarArregloPorTeclado(int[] arr) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			for (int i = 0; i < MAX; i++){
				System.out.println("Ingrese un entero: ");

				arr[i]= Integer.valueOf(entrada.readLine()); /*arrEnteros es un arreglo, arrenteros[i] es como una variable de tipo entero a la que se le asigna un valor */
			}

		} catch (Exception e) {
			System.out.println("error"+e);			
		}		
	}


	// ##################  CARGA ARREGLO de ENTEROS
	public static void cargarArreglo(int[] arr) {
		for (int i = 0; i < MAX; i++) {
			arr[i] = i;
		}
	}


	// ##################  CARGA ARREGLO ALEATORIO de ENTEROS  ---> con valores de MINVALOR a MAXVALOR definidas como constantes
	// INCORPORAR LA LIBRERIA import java.util.Random;
	public static void cargar_arreglo_aleatorio_int(int [] arr){
		Random r = new Random();
		for (int pos = 0; pos < MAX; pos++){
			arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
		}
	}


	//##################  CARGA ARREGLO ALEATORIO de CHAR con valores de 'a' a la 'z'
	// INCORPORAR LA LIBRERIA import java.util.Random;
	public static void cargar_arreglo_aleatorio_char(char [] arr){
		Random r = new Random();
		for (int pos = 0; pos < MAX; pos++){
			arr[pos]=(char)(r.nextInt(26) + 'a');
		}
	}


	//##################  CARGA ARREGLO ALEATORIO de DOUBLE --->  con valores de MINVALOR a MAXVALOR
	// INCORPORAR LA LIBRERIA import java.util.Random;
	public static void cargar_arreglo_aleatorio_double(double [] arr){
		Random r = new Random();
		for (int pos = 0; pos < MAX; pos++){
			arr[pos]=((MAXVALOR-MINVALOR+1)*r.nextDouble() + MINVALOR*1.0);
		}
	}

	//##################  CARGAR ARREGLO DE SECUENCIAS CHAR
	public static void cargar_arreglo_aleatorio_secuencias_char(char
			[] arr){
		Random r = new Random();
		arr[0] = ' ';
		arr[MAX-1] = ' ';
		for (int pos = 1; pos < MAX-1; pos++){
			if (r.nextDouble()>probabilidad_letra){  //public static final double probabilidad_letra = 0.4;
				arr[pos]=(char)(r.nextInt(26) + 'a');
			}
			else{
				arr[pos]=' ';
			}
		}
	}


	//##################  CARGAR ARREGLO DE SECUENCIAS INT
	public static void cargar_arreglo_aleatorio_secuencias_int(int []
			arr){
		Random r = new Random();
		arr[0] = 0;
		arr[MAX-1] = 0;
		for (int pos = 1; pos < MAX-1; pos++){
			if (r.nextDouble()>probabilidad_numero){  //public static final double probabilidad_numero = 0.4;
				arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
			}
			else{
				arr[pos]=0;
			}
		}
	}	


	//##################  OBTENER SUMA DE SECUENCIA
	public static int obtener_suma_secuencia(int[] arr, int inicio, int fin){
		int suma = 0;
		while (inicio <= fin){
			suma+=arr[inicio];
			inicio++;
		}
		return suma;
	}

	//##################  IMPRIMIR SUMA DE SECUENCIA
	public static void imprimir_suma_cada_secuencia(int[] arr){
		int inicio,fin,suma;
		inicio = 0;
		fin = -1;
		while ((inicio < MAX)){
			inicio = obtener_inicio_secuencia(arr,fin+1); 
			if (inicio < MAX){
				fin = obtener_fin_secuencia(arr,inicio);
				suma = obtener_suma_secuencia(arr,inicio,fin);
				System.out.println("La suma de la secuencia de "+inicio+" a "+fin+" es "+suma);
			}
		}
	}


	//##################  OBTENER INICIO DE SECUENCIA
	public static int obtener_inicio_secuencia_desde(int[] arr, int inicio){
		while ((inicio < MAX)&&(arr[inicio]==0))
			inicio++;
		return inicio;
	}


	//##################  OBTENER INICIO DE SECUENCIA
	public static int obtener_inicio_secuencia(int[] arr, int inicio){
		while ((inicio >MIN)&&(arr[inicio]!=0))
			inicio--;
		return inicio+1;
	}



	//##################  OBTENER FIN DE SECUENCIA
	public static int obtener_fin_secuencia(int[] arr, int inicio){
		while ((inicio < MAX)&&(arr[inicio]!=0))
			inicio++;
		return inicio-1;
	}





	//##################  CORRIMIENTO DERECHA	---> INSERTAR ELEMENTO EN ARREGLO
	public static void corrimiento_der(int [] arr, int pos){
		int indice = MAX-1;
		while (indice > pos){
			arr[indice] = arr[indice-1];
			indice--;
		}
	}


	//##################  CORRIMIENTO IZQUIERDA  ---> BORRAR ELEMENTO DE ARREGLO
	public static void corrimientoIzquierda(int [] arr, int indice){
		int pos = indice;
		while (pos < MAX -1){  //o MAX
			arr[pos] = arr[pos+1];
			pos++;
		}
		if(indice == MAX-1) {
			arr[indice] = 0;
		}			
	}


	//##################  INVERTIR ARREGLO	
	public static void invertirArreglos(int[] arr) {
		int i = 0;
		int j = arr.length -1;  //o MAX
		int aux = 0;

		while(i < j) {
			aux = arr[i];
			arr[i] = arr[j];
			arr[j] = aux;
			i++;
			j--;			
		}
	}


	//#################   BUSCAR OCURRENCIA ---> booleano
	public static boolean buscarPosOcurrencia(int [] arr, int num) {
		boolean existeOcurrencia= false;		

		for (int i = 0; i < MAX; i++) {
			if(arr[i] == num) {
				existeOcurrencia=true;
				corrimientoIzquierda(arr, i); //YA ME ELIMINA LA OCURRENCIA
				i--;
			} 
		}		
		return existeOcurrencia; 
	}



	//##################  ENCONTRAR POSICION 
	public static int obtener_pos_arreglo(int [] arr, int numero){
		int posicion = 0;
		while ((posicion < MAX) && (arr[posicion] != numero)){
			posicion++;
		}
		return posicion;
	}



	//##################  ENCONTRAR POSICION
	public static int buscarOcurrencia(int[] arr, int num) {
		int pos = -1; //en caso de que la ocurrencia no este me retorna -1
		int i = 0;

		while((i < MAX) || (pos == -1)) {
			if(arr[i] == num) {
				pos = i;
			}			
			i++;	
		}
		return pos;
	}



	//##################  BUSCAR POSICION EN ARREGLO ORENADO CRECIENTE  --->La posicion que retorna no significa que este ahí, es donde deberia estar
	public static int buscar_pos_arreglo_ord_crec(int[] arr,int numero) {
		int pos = 0;
		while ((pos<MAX)&&(arr[pos]<numero)){
			pos++;
		}
		return pos;
	}



	//##################  PROMEDIO
	public static int promedio_arreglo(int [] arr){
		int suma = 0;
		for (int pos = 0; pos < MAX; pos++){
			suma+=arr[pos];
		}
		return (suma/MAX);
	}



	//##################  TABLA MULTIPLICAR
	public static void calcularTablaMultiplicar(int numero) {
		int multiplicacion = 0;

		for (int i = 0; i <= MAX; i++) {
			multiplicacion = numero * i;
			System.out.println(numero +" x "+i+ " = "+multiplicacion);
		}
	}




	///////////////////////// MATRIZ


	//##################  CARGAR MATRIZ ENTEROS MANUAL
	public static void cargar_matriz_int(int [][] mat){
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			for (int fila = 0; fila < MAXFILA; fila++){
				for (int columna = 0; columna < MAXCOLUMNA; columna++){
					System.out.println("Ingrese un entero para la posicion ["+fila+"]["+columna+"]");
					mat[fila][columna] = Integer.valueOf(entrada.readLine());
				}
			}
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}


	//##################  CARGAR MATRIZ CHAR ALEATORIO
	public static void cargar_matriz_aleatorio_char(char [][] mat){
		Random r = new Random();
		for (int fila = 0; fila < MAXFILA; fila++){
			for (int columna = 0; columna < MAXCOLUMNA; columna++){
				mat[fila][columna]=(char)(r.nextInt(26) + 'a');
			}
		}
	}

	//##################  CARGAR MATRIZ ENTEROS ALEATORIO
	public static void cargar_matriz_aleatorio_int(int [][] mat){
		Random r = new Random();
		for (int fila = 0; fila < MAXFILA; fila++){
			for (int columna = 0; columna < MAXCOLUMNA; columna++){
				mat[fila][columna]=(r.nextInt(MAXVALOR+MINVALOR-1) + MINVALOR);
			}
		}
	}

	//##################  CARGAR MATRIZ DOUBLE ALEATORIO
	public static void cargar_matriz_aleatorio_double(double [][] mat){
		Random r = new Random();
		for (int fila = 0; fila < MAXFILA; fila++){
			for (int columna = 0; columna < MAXCOLUMNA; columna++){
				mat[fila][columna]=((MAXVALOR-MINVALOR-1)*r.nextDouble() + MINVALOR*1.0);  
			}
		}
	}


	//##################  IMPRIMIR MATRIZ CHAR
	public static void imprimir_matriz_char(char [][] mat){
		for (int fila = 0; fila < MAXFILA; fila++){
			System.out.print("|");
			for (int columna = 0; columna < MAXCOLUMNA; columna++){
				System.out.print(mat[fila][columna]+"|");
			}
			System.out.println("");
		}
	}

	//##################  IMPRIMIR MATRIZ INT
	public static void imprimir_matriz_int(int [][] mat){
		for (int fila = 0; fila < MAXFILA; fila++){
			System.out.print("|");
			for (int columna = 0; columna < MAXCOLUMNA; columna++){
				System.out.print(mat[fila][columna]+"|");
			}
			System.out.println("");
		}
	}

	//##################  IMPRIMIR MATRIZ DOUBLE
	public static void imprimir_matriz_double(double [][] mat){
		for (int fila = 0; fila < MAXFILA; fila++){
			System.out.print("|");
			for (int columna = 0; columna < MAXCOLUMNA; columna++){
				System.out.print(mat[fila][columna]+"|");
			}
			System.out.println("");
		}
	}


	//##################  IMPRIMIR FILA COLUMNA
	public static void imprimir_fila_columna_matriz(int[][] mat, int numero){
		int fila = 0;
		int columna = MAXCOLUMNA;
		while ((fila < MAXFILA) && (columna == MAXCOLUMNA)){
			columna = obtener_pos_arreglo(mat[fila],numero);
			if (columna == MAXCOLUMNA){
				fila++;
			}
		}
		if ((fila < MAXFILA) && (columna < MAXCOLUMNA)){
			System.out.println(numero+" se encuentra en "+fila+" y "+columna);
		}
		else {
			System.out.println(numero+" no se encuentra en la matriz"); 
		}
	}


	//##################  IMPRIMIR PROMEDIO FILA
	public static void imprimir_promedios_filas (int[][] mat){
		for (int fila = 0 ; fila < MAXFILA; fila++){
			System.out.println("Promedio de la fila "+fila+" es "+promedio_fila(mat,fila));
			System.out.println("Promedio de la fila "+fila+" es "+promedio_arreglo(mat[fila]));
		}
	}

	//##################  PROMEDIO FILA
	public static int promedio_fila (int[][] mat, int fila){
		int promedio;
		int suma = 0;
		for (int columna = 0 ; columna < MAXCOLUMNA; columna++) {
			suma+=mat[fila][columna];
		}
		promedio = suma/MAXCOLUMNA;		 
		return promedio;
	}


	//##################  PROMEDIO ARREGLO ---> CON DATOS DE MATRIZ
	public static int promedio_arreglo (int[] arr){
		int promedio;
		int suma = 0;
		for (int pos = 0 ; pos < MAXCOLUMNA; pos++) {
			suma+=arr[pos];
		}
		promedio = suma/MAXCOLUMNA;		 
		return promedio;
	}


	//##################  PROMEDIO POR PANTALLA PROMEDIO MATRIZ
	public static void imprimir_por_pantalla_promedios_matriz(int [][] mat){
		int promedio;
		for (int columna = 0; columna < MAXCOLUMNA; columna++){
			promedio = obtener_promedio_columna(mat,columna);
			System.out.println("el promedio de la columna "+columna+" es "+promedio);
		}
	}

	//##################  OBTENER PROMEDIO DE COLUMNA
	public static int obtener_promedio_columna(int [][] mat, int columna){
		int promedio,suma;
		suma = 0;
		for (int fila = 0; fila < MAXFILA; fila++){
			suma+=mat[fila][columna];
		}
		promedio=suma/MAXFILA;
		return promedio;
	}

	//##################  CORRIMIENTO DERECHA FILA COLUMNA
	public static void corrimiento_der_fila_columna(int [] arrenteros, int pos){
		int indice = MAXCOLUMNA-1;
		while (indice > pos){
			arrenteros[indice] = arrenteros[indice-1];
			indice--;
		}

	}
	
	
	//ORDENAR MATRIZ SELECCION
	public static void ordenar_matriz_columna_seleccion(int [][] mat, int columna) {
		int pos_menor, tmp;
		for (int i = 0; i < MAXFILA; i++) { 
			pos_menor = i; 		
			for (int j = i + 1; j < MAXFILA; j++){ 	
				if (mat[j][columna] < mat[pos_menor][columna]) { 	
					pos_menor = j;
				}
			}
			if (pos_menor != i){
				tmp = mat[i][columna];
				mat[i][columna] = mat[pos_menor][columna];
				mat[pos_menor][columna] = tmp;
			}
		}
	}
	
	
	
	
	
	public static void imprimir_matriz_char(char [][] mat){
		for (int fila = 0; fila < MAXFILA; fila++){
			imprimir_arreglo_secuencias_char(mat[fila]);
			System.out.println("");
		}
	}

	public static void imprimir_matriz_int(int [][] mat){
		for (int fila = 0; fila < MAXFILA; fila++){
			imprimir_arreglo_secuencias_int(mat[fila]);
			System.out.println("");
		}
	}	
	
	public static void cargar_matriz_aleatorio_secuencias_int(int [][] mat){
		for (int fila = 0; fila < MAXFILA; fila++){
			cargar_arreglo_aleatorio_secuencias_int(mat[fila]);
		}
		System.out.println("");
	}		

	public static void cargar_matriz_aleatorio_secuencias_char(char [][] mat){
		for (int fila = 0; fila < MAXFILA; fila++){
			cargar_arreglo_aleatorio_secuencias_char(mat[fila]);
		}
		System.out.println("");
	}		
	
	public static void cargar_arreglo_aleatorio_secuencias_char(char [] arr){
		Random r = new Random();
		arr[0] = ' ';
		arr[MAXCOLUMNA-1] = ' ';
		for (int pos = 1; pos < MAXCOLUMNA-1; pos++){
			if (r.nextDouble()>probabilidad_letra){
				arr[pos]=(char)(r.nextInt(26) + 'a');
			}
			else{
				arr[pos]=' ';				
			}
		}
	}

	public static void imprimir_arreglo_secuencias_char(char [] arr){
		System.out.print("|");
		for (int pos = 0; pos < MAXCOLUMNA; pos++){
			System.out.print(arr[pos]+"|");
		}
	}
	
	public static void cargar_arreglo_aleatorio_secuencias_int(int [] arr){
		Random r = new Random();
		arr[0] = 0;
		arr[MAXCOLUMNA-1] = 0;
		for (int pos = 1; pos < MAXCOLUMNA-1; pos++){
			if (r.nextDouble()>probabilidad_numero){
				arr[pos]=(r.nextInt(MAXVALOR+MINVALOR-1) + MINVALOR); 
			}
			else{
				arr[pos]=0;				
			}
		}
	}

	public static void imprimir_arreglo_secuencias_int(int [] arr){
		System.out.print("|");
		for (int pos = 0; pos < MAXCOLUMNA; pos++){
			System.out.print(arr[pos]+"|");
		}
	}
	
	
	public static void imprimir_suma_secuencias_matriz(int[][] mat){
		for (int fila = 0; fila < MAXFILA; fila++){
			System.out.println("Para la fila "+fila);
			imprimir_suma_cada_secuencia(mat[fila]);
		}
	}	
	
	public static void imprimir_suma_cada_secuencia(int[] arr){
		int inicio,fin,suma;
		inicio = 0;
		fin = -1;
		while ((inicio < MAXCOLUMNA)){
			inicio = obtener_inicio_secuencia(arr,fin+1);
			if (inicio < MAXCOLUMNA){
				fin = obtener_fin_secuencia(arr,inicio);
				 suma = obtener_suma_secuencia(arr,inicio,fin);
				 System.out.println("La suma de la secuencia de "+inicio+" a "+fin+" es "+suma);
			}
		}
	}

	public static int obtener_suma_secuencia(int[] arr, int inicio, int fin){
		int suma = 0;
		while (inicio <= fin){
			suma+=arr[inicio];
			inicio++;
		}
		return suma;
	}




}
