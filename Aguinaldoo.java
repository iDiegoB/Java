import java.util.Scanner;

public class Aguinaldoo{
	public static void main(String[]args){
		int sueldo=0, edad=0;
		Scanner agui= new Scanner(System.in);
		System.out.print("indique su sueldo");
		sueldo=agui.nextInt();
		System.out.print("indique la edad de su hijo si es que tiene, si no tiene hijos ponga 0");
		edad=agui.nextInt();
		do{
			if(edad>=24 && sueldo>=700000){
			System.out.print("no recibe aporte de $18000");
			}else{
				System.out.print("recibe aporte de $18000 por carga familiar ");
			}
		System.out.print("Si desea terminar el proceso, debe de introducir en edad y sueldo	el numero 0	");
		System.out.println("indique la edad de su hijo/a, para terminar ponga 0		");
		edad = agui.nextInt();
		System.out.println("indique su sueldo, para terminar ponga 0		");
		sueldo = agui.nextInt();
		}while(sueldo!=0 && edad!=0);
	}
}

	
