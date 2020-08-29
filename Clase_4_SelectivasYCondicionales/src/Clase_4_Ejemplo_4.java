/*Imprime si un valor es par o es multiplo de 3 e imprime el valor
*/
public class Clase_4_Ejemplo_4 {
    public static void main(String[] args) {
        int valor = 5;
        if (valor % 2 == 0) {

            System.out.println(valor + " es par");

        } else if (valor % 3 == 0) {

            System.out.println(valor + " es multiplo de 3");

        }
        System.out.println("El valor es " + valor);
    }
}