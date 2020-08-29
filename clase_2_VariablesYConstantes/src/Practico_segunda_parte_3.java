import java.io.BufferedReader;
import java.io.InputStreamReader;

class Practico_segunda_parte_3 {
  public static void main(String[] args) {
    char tipo_factura;
    String nombre_cliente, producto_1, producto_2;
    double importe_1, importe_2, importe_total;
    
    try{
      BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
      
      System.out.println("Tipo de factura: ");
      tipo_factura=entrada.readLine().charAt(0);
      
      System.out.println("Nombre y apellido del Cliente ");
      nombre_cliente=entrada.readLine();
      
      System.out.println("Producto 1:  ");
      producto_1=entrada.readLine();
      
      System.out.println("importe del producto: ");
      importe_1=Double.valueOf(entrada.readLine());
      
      System.out.println("Producto 2: ");
      producto_2=entrada.readLine();
      
      System.out.println("importe del producto: ");
      importe_2=Double.valueOf(entrada.readLine());
      
      importe_total=importe_1+importe_2;
      
      System.out.println("Factura \t\t "+tipo_factura+
                         "\nNombre del cliente: "+nombre_cliente+
                        "\nProducto\t\timporte\n"
                        +producto_1+" \t\t"+importe_1+"\n"
                         +producto_2+" \t\t"+importe_2+
                         "\nImporte total \t\t"+importe_total);
    }
    
    catch(Exception exc){
      System.out.println(exc);
    } 
  }
}