import java.util.Scanner;

public class Aguinaldo{
	public static void main(String[]args){
		int sueldo, edad;
		Scanner agui= new Scanner(System.in);
		System.out.print("indique su sueldo");
		sueldo=agui.nextInt();
		System.out.print("indique la edad de su hijo si es que tiene, si no tiene hijos ponga 24");
		edad=agui.nextInt();
	if (sueldo>1000000 && edad>24){
		System.out.print(" no recibe aguinaldo de fiestas patrias  ");
	} 
	else{
		if (sueldo<700000 && edad<24){
			System.out.print("recibe aporte de $18000 por carga familiar");
		}
		else{
			if(edad==24){
				System.out.print("no tiene carga familiar");
			}
		}
	}
	}
}