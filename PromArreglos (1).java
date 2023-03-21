import java.util.Scanner;
public class PromArreglos{
     public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		int suma=0;
		System.out.print("Ingrese cantidad de numeros a generar: ");
		int NumAzar[]= new int[tec.nextInt()] ;// se crea un arreglo con el tamaño indicado por el usuario
	 
		 for(int i= 0; i < NumAzar.length; i++){
			NumAzar[i] = (int)(Math.random()*50); // se generan números al azar y se asignan a cada posición del arreglo
		 }
		
		System.out.println(" \n [Imprime desde posicion 0, hasta " + (NumAzar.length-1) +"]");
		for(int i= 0; i < NumAzar.length; i++){ // imprime ascendente [pos 0 hasta la última]
			System.out.print(NumAzar[i]+"\t"); // se imprime el vector(arreglo), se usa tabulador (\t) para imprimir ordenado
		 }
		 
		 for(int i= 0; i < NumAzar.length; i++){ // imprime ascendente [pos 0 hasta la última]
			suma+= NumAzar[i]; // es igual a decir suma = suma + NumAzar[i]
		 }
		 
		 /* Importante!!
		 
			al dividir 2 enteros, nos debería dar un valor decimal (21.0 -  54,2 etc). Pero en Java muestra solo la parte entera del resultado, por lo tanto, se requiere hacer un casting para que muestre la parte decimal, para ello se antepone el tipo de dato en uno de los 2 valores para que muestre todo el resultado
		 */
		 System.out.print(" \n promedio = " + ((double)suma/NumAzar.length));

	}

}