
/*Dado un numero entero ingresado por el usuario hacer: _ imprimir A si el numero es multiplo de 5, _ o imprimir B si el numero es multiplo de 7,
*_ o imprimir C si el numero es multiplo de 2 y de 3, _ o imprimir el numero
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase_4_Ejemplo_5 {
    public static void main(String[] args) {
        int numero;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero entero :");
            numero = Integer.valueOf(entrada.readLine());
            if (numero % 5 == 0) {

                System.out.println("A");

            } else if (numero % 7 == 0) {
                System.out.println("B");

            } else if ((numero % 2 == 0) && (numero % 3 == 0)) {
                System.out.println("C");

            } else {

                System.out.println("El numero es: " + numero);

            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}