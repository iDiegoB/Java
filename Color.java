import java.util.Scanner;
public class Color{
	public static void Color(String[] args){
		//Scanner
		Scanner tec = new Scanner(System.in);
		//variables
		int rojo = 0;
		int verde = 0;
		int azul = 0;
		String color;
		//codigo
		for(int i = 1; i<=5; i++){
			System.out.print("Hola, por favor ingresa tu color primario favorito (rojo, verde y azul): ");
			color = tec.next();
			if(color.equals("rojo")){
				rojo = rojo + 1;
			}
			else{
				if(color.equals("verde")){
					verde = verde + 1;
				}
				else{
					if(color.equals("azul")){
						azul = azul + 1;
					}
					else{
						System.out.println("color invalido");
					}
				}
			}
		}
		System.out.println("El total de personas que gustan del color rojo es: " + rojo);
		System.out.println("El total de personas que gustan del color verde es: " + verde);
		System.out.println("El total de personas que gustan del color azul es: " + azul);
	}
}
