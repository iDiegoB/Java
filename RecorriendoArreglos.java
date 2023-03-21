import java.util.Scanner;
public class RecorriendoArreglos{
     public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
		System.out.print("Ingrese cantidad de números a generar: ");
		int NumAzar[]= new int[tec.nextInt()] ;// se crea un arreglo con el tamaño indicado por el usuario
	 
		 for(int i= 0; i < NumAzar.length; i++){
			NumAzar[i] = (int)(Math.random()*50); // se generan números al azar y se asignan a cada posición del arreglo
		 }
		
		/* Importante!!
		(NumAzar.length-1) permite determinar la última posición, porque NumAzar.length da el tamaño del arreglo y sabemos que al 
		partir en cero las posiciones relativas, la última posición será uno menos que el tamaño
		*/
		
		System.out.println("[Imprime desde posicion 0, hasta " + (NumAzar.length-1) +"]");
		for(int i= 0; i < NumAzar.length; i++){ // imprime ascendente [pos 0 hasta la última]
			System.out.print(NumAzar[i]+"\t"); // se imprime el vector(arreglo), se usa tabulador (\t) para imprimir ordenado
		 }
		 
		 //"\n ")comando para saltar líneas
		 System.out.println(" \n \n \n [Imprime desde posicion " + (NumAzar.length-1) + " hasta posicion 0] ");
		 for(int i= NumAzar.length-1; i >= 0; i--){ // imprime descendente [desde la última posición hasta la posición 0]
			System.out.print(NumAzar[i]+"\t"); 
		 }
	}

}