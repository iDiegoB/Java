import java.util.Scanner;
public class arregloLetras{
	public static void main(String[]args){
	   // definiendo variables
	   Scanner tec=new Scanner(System.in);
	   String pal;
	   int sum=0;
	   System.out.print("Ingrese una palabra ");
	   pal = tec.next();
	 
	   char letras[]=new char[pal.length()]; // se crea el arreglo en base al tamaño de la palabra
	   
	   for(int i = 0; i < letras.length; i++){ // llenado el arreglo con cada letra de la palabra
	       letras[i]=pal.charAt(i);
		   
	   }
	  
	   for(int i= 0; i < letras.length; i++){ // mostrando el arreglo
	       System.out.print(letras[i]+" ");
	   }
	   System.out.print("En total la palabra tiene " + sum + " vocal a");
     }
}



