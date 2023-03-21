import java.util.Scanner;
public class Control1{
	public static void main(String[] args) {
		int ruta=0, tiempo=0, distIdaRegreso=0, dist=0;
		String categoria;
		Scanner control1 = new Scanner(System.in);
		do{
			System.out.print(" 1: Pinto, 2: Rinconada de cato, 3: Puente el diablo");
			ruta= control1.nextInt();
			System.out.print(" Categoria novato o entrenado");
			categoria= control1.next();
			if (categoria.equals("novato")){
				switch (ruta){
				case 1: tiempo=150;
				dist=25; break;
				case 2: tiempo=81;
				dist=13; break;
				case 3: tiempo=48;
				dist=8; break;
				}
			}else{
					if (categoria.equals("novato")){
						switch (ruta){
							case 1: tiempo = 75;
							dist = 25; break;
							case 2: tiempo = 40;
							dist = 13; break;
							case 3: tiempo = 24;
							dist = 8; break;
						}
					}
				}
				distIdaRegreso = (dist*2)*1000;
				System.out.print("El ciclista recorre: "+ distIdaRegreso+ " metros, en un tiempo promedio de: "+ tiempo +" minutos");
		}while(!categoria.equals("fin"));
	}
}