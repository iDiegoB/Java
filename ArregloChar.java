import java.util.Scanner;

public class ArregloChar{
	public static void main(String[] args) {
	    String a;
		int mayPal[] = new int[5];
		int minPal[]=new int[5];
		Scanner tec = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++){
			System.out.print("Ingrese numero ");
			minPal[i] = tec.next().charAt(0);// selecciono el primer caracter ingresado
			
		}
		}
		
		for (int i = 0; i< 5; i++){
			System.out.println(minPal[i] + " " + mayPal[i]);
		}
		
	}
}