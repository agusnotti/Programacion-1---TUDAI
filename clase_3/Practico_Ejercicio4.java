package clase_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practico_Ejercicio4 {
    public static void main (String[]args){

        int num1=0;
                
        try {

            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Ingrese un numero entero: ");
            num1 = Integer.valueOf(entrada.readLine());

            System.out.println("(("+num1+" % 6 == 0) && ("+num1+" % 7 == 0)): "+((num1%6==0) && (num1%7==0)));
            System.out.println("(("+num1+" > 30) && ("+num1+" % 2 == 0)) || ("+num1+" <= 30): "+(((num1>30)&&(num1%2==0))||(num1<=30)));
            System.out.println("(("+num1+"/5)>10): "+((num1/5)>10));
            
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}