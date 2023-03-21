import java.util.Scanner;

public class Menu{
	public static void main(String[]args){
		int op=0;
		Scanner tec= new Scanner(System.in);
		System.out.print("1: actualizar datos	");
		System.out.print("2: comprar un producto	");
		System.out.print("3: servicio técnico	");
		System.out.print("4: devolucion de productos	");
		System.out.print("5: terminar.	");
		op=tec.nextInt();
		switch(op){
			case 1: System.out.print("1: actualizar datos	"); break;
			case 2: System.out.print("2: comprar un producto	"); break;
			case 3: System.out.print("3: servicio tecnico	"); break;
			case 4: System.out.print("4: devolucion de productos	"); break;
			case 5: System.out.print("terminar.	"); break;
			default: System.out.print("Nothing :D"); break;
			}
	}
}