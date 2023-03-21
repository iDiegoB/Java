import java.util.Scanner;
public class azarHoy{
     public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
		System.out.print("Ingrese cantidad de números a generar: ");
		int NumAzar[]= new int[tec.nextInt()] ;// se crea un arreglo con el tamaño indicado por el usuario
	 
		 for(int i= 0; i < NumAzar.length; i++){
			NumAzar[i] = (int)(Math.random()*20); // se generan números al azar y se asignan a cada posición del arreglo
		 }
		 
		for(int i= 0; i < NumAzar.length; i++){
			System.out.print(NumAzar[i]+"\t"); // se imprime el vector(arreglo), se usa tabulador (\t) para imprimir ordenado
		 }
		 
	}

}



