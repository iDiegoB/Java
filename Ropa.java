import java.util.Scanner;
public class Ropa{
		public static void main(String[] args) {
			int totropa=0, cant=0;
			String donantes;
			Scanner ropa = new Scanner(System.in);
			do{
				System.out.print("ingrese cantidad de ropa a donar");
				cant=ropa.nextInt();
				totropa=totropa+cant;
				System.out.print("¿quedan donantes?");
				donantes=ropa.next();
			}while(donantes.equals("si"));
				System.out.print("Se donaron en total:	"+ totropa);
	}
}