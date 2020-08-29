/*Imprime si un valor es par o impar. Ademas imprime el
*valor
*/
public class Clase_4_Ejemplo_2 {
    public static void main(String[] args) {
        int valor = 5;
        if (valor % 2 == 0) {

            System.out.println(valor + " es par");

        } else {

            System.out.println(valor + " es impar");

        }
        System.out.println("El valor es " + valor);
    }
}