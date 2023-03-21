import java.util.Scanner;
public class Pub{
	public static void main(String[] args) {
		int edad=0, cont=0;
		Scanner pubb = new Scanner(System.in);
		System.out.print("ingrese edad: 	");
		edad=pubb.nextInt();
		while (edad!=0){
			if (edad>=18){
				cont++;
			}
			System.out.print("ingrese edad: 	");
			edad=pubb.nextInt();
		}
		System.out.print("ingresaron al pub: "+ cont+ "	mayores de 18 ");
	}
}	