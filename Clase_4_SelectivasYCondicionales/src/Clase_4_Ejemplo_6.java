
/*Dado un caracter ingresado por el usuario hacer: _ imprimir si es caracter minuscula, _ o imprimir si es caracter mayuscula,
*_ o imprimir no es caracter letra
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase_4_Ejemplo_6 {
    public static void main(String[] args) {
        char caracter;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un caracter :");
            caracter = entrada.readLine().charAt(0);
            if (('a' <= caracter) && (caracter <= 'z')) {

                System.out.println("Es caracter minuscula");

            } else if (('A' <= caracter) && (caracter <= 'Z')) {

                System.out.println("Es caracter mayuscula");

            } else {

                System.out.println("No es caracter letra");

            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}