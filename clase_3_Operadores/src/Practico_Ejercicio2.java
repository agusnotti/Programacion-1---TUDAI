/* Escribir un programa que imprima por pantalla la tabla de valores
de verdad para el or y and por separado. */

public class Practico_Ejercicio2{
    public static void main(final String[] args) {
        boolean v = true;
        boolean f = false;

        System.out.println("Tabla de valores de verdad de AND");
        System.out.println("Falso && Falso:  "+f+
                            "\nFalso && Verdadero: "+(f && v)+
                            "\nVerdadero && Falso: "+(v && f)+
                            "\nVerdadero && Verdadero: "+v);

        System.out.println("Tabla de valores de verdad de OR");
        System.out.println("Falso || Falso:  "+f+
                            "\nFalso || Verdadero: "+(f || v)+
                            "\nVerdadero || Falso: "+(v || f)+
                            "\nVerdadero || Verdadero: "+v);
    }
}