import java.util.Scanner;
public class Diagonal{
	public static void main(String[]args){
	   // definiendo variables
	  
	  int Num[][] = new int[6][6];
	  int fil = 0;
	 
	  // Llenando matriz
	   for (int i = 0; i < Num.length; i++){
	       for (int j = 0; j < Num[0].length; j++){
		    Num[i][j]=(int)(Math.random()*10);
	       }
	   }
	   
	// mostrando resultados por filas
	  System.out.println("Mostrando valores  por Fila");
	  for (int i= 0; i < Num.length; i++){
	      for (int j = 0; j < Num[0].length; j++){
		      System.out.print(Num[i][j]+ "   ");
		  }
		  System.out.println(" ") ;
	  }   	
		
	  // mostrando diagonal principal
	  System.out.println("mostrando diagonal principal");
	  for (int i = 0; i < Num.length; i++){ 
	      System.out.println(Num[i][i]);
	  }
	 

	  // mostrando diagonal secundaria
	  System.out.println("mostrando diagonal secundaria");
	  for (int j= (Num[0].length-1); j>=0; j--){ // partiendo de la última columna y retrocediendo 
	     System.out.println(Num[fil++][j]); // fil inicia en 0 
	  }
    }
}