import java.util.Scanner;

public class ArreglosRandom{
	public static void main(String[]args){
	   // definiendo variables
	   Scanner tec = new Scanner(System.in);
	   int azar;
	   System.out.print("Ingrese tamaño del arreglo a trabajar");
	int Num[] = new int [tec.nextInt()]; // creo el arreglo con el tamaño indicado por el usuario.
	   
	   System.out.println(Num.length); // muestra el tamaño del arreglo
	   
	   for (int i = 0; i < Num.length; i++){
	       	Num[i]=(int)(Math.random()*10); // hago el casting para que llene con números enteros.
	   }
	   
	   for (int i = 0; i < Num.length; i++){
	       System.out.print(Num[i] + " ");
	   }
	   azar = (int)(Math.random()*(Num.length));
	   System.out.println("Azar: " + azar);
	   while(azar !=0){ // mientras el número al azar no sea cero, el ciclo se repite
	      System.out.println(Num[azar] + " " + azar);
	      azar = (int)(Math.random()*(Num.length));
	   }
	   System.out.println (azar);
    }
}