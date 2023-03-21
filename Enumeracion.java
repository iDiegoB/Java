import java.util.Scanner;
public class Enumeracion{
	public static void main(String[] args) {
		int contRed=0;
		int contBlue=0;
		int contGreen=0;
		String color;
		Scanner num = new Scanner(System.in);
		System.out.println("Indique su color primario favorito(rojo, azul, verde");
		for(int i=1; i<=6; i++){
			color = num.next();
			if(color.equals("rojo")){
				contRed++;
			}else{
				if(color.equals("azul")){
					contBlue++;
				}else{
					if(color.equals("verde")){
						contGreen++;
					}else{
						System.out.println("Color invalido");
					}
				}
			}
		}
		System.out.println("El total de personas que gustan del color rojo es: " + contRed);
		System.out.println("El total de personas que gustan del color verde es: " + contGreen);
		System.out.println("El total de personas que gustan del color azul es: " + contBlue);
		if(contBlue>contGreen){
			if(contBlue>contRed){
				if(contGreen>contRed){
					System.out.println("El color azul es mayor que el verde, que es mayor que el rojo");
				}else{
					System.out.println("El color rojo es mayor que el azul, que es mayor que el verde");
			}
		}else{
			if(contGreen>contRed){
				if(contBlue>contRed){
					System.out.println("El color verde es mayor que el azul, que es mayor que el rojo");
				}else{
					System.out.println("El color verde es mayor que el rojo, que es mayor que el azul");
				}
			}else{
				System.out.println("El color rojo es mayor que el verde, que es mayor que el azul");
			}
		}	
	}
}
