import java.util.Scanner;

public class Arandanos{
	public static void main(String[]args){
	 int cant=0, pais, pais1;
	 String tipo;
			Scanner aran= new Scanner(System.in);
				System.out.print("hola, ¿Qué tipo de berrie ha sido cosechada, blue o normal?");
				tipo= aran.next();
				System.out.print("¿Cuantos kilos han sido cosechados?");
				cant= aran.nextInt();
				if (tipo=="normal" && cant>5000){
					 pais=(cant*10/100);
					System.out.print("En el pais se debe vender una cantidad correspondiente a: " + pais); 
				}
					else{
						if (tipo=="blue" && cant>5000){
							pais1 = (cant*20/100);
							System.out.print("En el pais se debe vender una cantidad correspondiente a:" + pais1); 
						}
						else{
							if (cant<=5000){
								System.out.print("Distribucion nacional y de exportacion indeterminada");
							}
						}
					}
	}
}