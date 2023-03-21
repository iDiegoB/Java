import java.util.Scanner;

public class Estantes{
	public static void main(String[]args){
		int estantex;
		Scanner estan= new Scanner(System.in);
		System.out.print("Si realiza 10 o más estantes, se le cancelará $2.500 por cada estante.   ");
		System.out.print("Si realiza entre 7 y 9, $2.000 por c/u  ");
		System.out.print("Si realiza 5 se le cancela $1.000  ");
		System.out.print("Si realiza menos de 5, se le cancela $500 por c/u   ");
		System.out.print("Indique cuantos estantes ordeno");
		estantex= estan.nextInt();
		if(estantex>=10){
			System.out.print("se le cancelará $2.500 por cada estante.   ");
		}
		else{
			if(estantex>7 && estantex<9){
				System.out.print("$2.000 por c/u");
			}
			else{
				if(estantex==5){
					System.out.print("se le cancela $1.000 por c/u");
				}
				else{
					if(estantex<5){
						System.out.print("se le cancela $500 por c/u");
					}
				}
			}
		}
	}
}