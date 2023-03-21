import java.util.Scanner;
public class New{
	public static void main(String[] args) {
		Scanner xd = new Scanner(System.in);
		double suma=0;
		double notas[]= new double[4];
			for (int i = 0; i < notas.length; i++){ 	       	
			System.out.println("ingrese su nota: ");
			notas[i]=xd.nextDouble();
			if(i==2 || i==3){
				notas[2]=notas[2]+0.2;
				notas[3]=notas[3]+0.2;
			}
			
		}
		for (int i = 0; i < notas.length; i++){ 	       	
		System.out.println(notas[i]);
		suma= suma +notas [i];
		}
		System.out.println("");
		System.out.println("Hola	"+ (int)(suma/4));
	}
}