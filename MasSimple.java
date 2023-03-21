import java.util.Scanner;
public class MasSimple{
		public static void main(String[] args) {
			int salario=0, contotal=0, cont1=0, cont2=0, edad=0;
			Scanner xd = new Scanner(System.in);
			do{
				System.out.println("indique su salario	");
				salario=xd.nextInt();
				System.out.println("indique su edad	");
				edad=xd.nextInt();
				if (salario<700000 && edad>50){
					System.out.println("sera parte del programa Chillan mas limpio, podra cambiar su estufas a combustión lenta por estufas peleteras");
					cont1++;
				}else{
				if (salario>=700000 && edad<=50 || salario>=700000 && edad>=50 || salario<=700000 && edad<=50){
						System.out.println("no sera parte del programa Chillan mas limpio, no cumple los requisitos.");
						cont2++;
					}
				}
				contotal++;
			}while (contotal!=130);
			System.out.println("Total personas postulantes:	"+ contotal+ "	porcentaje:	100% ");
			System.out.println("Total personas con beneficio:	"+ cont1+ "	porcentaje: " + (100*cont1/contotal)+"%");
			System.out.println("Total personas sin beneficio:	"+ cont2+ "	porcentaje: "+ (100*cont2/contotal)+ "%");
		}
	}