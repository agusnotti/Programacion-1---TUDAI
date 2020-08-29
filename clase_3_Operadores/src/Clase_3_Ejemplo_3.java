/* operadores incrementales
*/
public class Clase_3_Ejemplo_3{
    public static void main(final String[] args) {
        int a, b;
        a = 5;
        a++;
        System.out.println("a = " + a);
        a = 5;
        ++a;
        System.out.println("a = " + a);
        a = 5;
        b = a++;
        System.out.println("a = " + a + ", b = " + b);
        a = 5;
        b = ++a;
        System.out.println("a = " + a + ", b = " + b);
    }
}