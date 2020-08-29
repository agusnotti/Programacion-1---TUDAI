/* operadores sobre el tipo entero y double
*/
public class Clase_3_Ejemplo_2{
    public static void main(String[] args) {
        int i, j, res1, res2, res3;
        double a, b, res4, res5;
        i = 7;
        j = 3;
        a = 7.0;
        b = 3.0;
        res1 = i-j;
        res2 = i/j;
        res3 = i%j;
        res4 = a*b;
        res5 = a/4.0;
        System.out.println("Operador resto: i - j = " + res1);
        System.out.println("Operador division: i / j = " + res2);
        System.out.println("Operador resto: i % j = " + res3);
        System.out.println("Operador multiplicacion: a * b = " + res4);
        System.out.println("Operador division: a / 4.0 = " + res5);
    }
}