import java.util.Scanner;

public class ArregloChar{
	public static void main(String[] args) {
	    String a;
		char mayPal[] = new char[5];
		char minPal[]=new char[5];
		Scanner tec = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++){
			System.out.print("Ingrese letra ");
			minPal[i] = tec.next().charAt(0);// selecciono el primer caracter ingresado
			
		}
		
		
		for (int i=0; i <5; i++){
			mayPal[i] = Character.toUpperCase(minPal[i]); // permite transformar un caracter a mayúscula
		}
		
		for (int i = 0; i< 5; i++){
			System.out.println(minPal[i] + " " + mayPal[i]);
		}
		
	}
}