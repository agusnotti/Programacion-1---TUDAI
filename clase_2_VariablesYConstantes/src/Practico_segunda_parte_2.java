import java.io.BufferedReader;
import java.io.InputStreamReader;

class Practico_segunda_parte_2 {
  public static void main(String[] args) {
      String name;
      String lastname;
      int age;
      double height;
      String occupation;
      String address;

      try{
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Ingrese su nombre ");
        name = entrada.readLine();
        
        System.out.println("Ingrese su apellido ");
        lastname=entrada.readLine();
        
        System.out.println("ingrese su edad ");
        age=Integer.valueOf(entrada.readLine());
        
        System.out.println("ingrese su altura ");
        height=Double.valueOf(entrada.readLine());
        
        System.out.println("ingrese su ocupacion ");
        occupation=entrada.readLine();
        
        System.out.println("ingrese su direccion ");
        address=entrada.readLine();
        
        System.out.println("Su nombre es "+name);
        System.out.println("Su apellido es "+lastname);
        System.out.println("Su edad es "+age);
        System.out.println("Su altura es "+height);
        System.out.println("Su ocupacion es "+occupation);
        System.out.println("Su direccion es "+address);


      }

      catch(Exception exc){
        	System.out.println(exc);

      }
  }
}