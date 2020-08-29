package clase_3;

/* operadores combinados sobre el tipo entero y double
*/
public class Clase_3_Ejemplo_4{
    public static void main(String[] args) {
        int i, j;
        double a, b;
        i = 7;
        j = 3;
        a = 7.0;
        b = 3.0;
        i += j;
        a /= b;
        System.out.println("Operador combinado suma: i+=j " + i);
        System.out.println("Operador combinado division: a/=b " + a);
    }
}