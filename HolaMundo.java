import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {    
  
           Scanner lectura = new Scanner(System.in);

           String nombre;
           
           System.out.print("Introduzca su nombre: "); 
       
           nombre = lectura.next();

           System.out.println("Hola " + nombre + "!!!");
     }
}
