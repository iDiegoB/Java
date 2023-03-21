import java.util.Scanner;
public class Control2{
	public static void main(String[] args) {
		int contcolorC=0, ContcolorN=0, Contnum1=0, Contnum2=0, Contblanco=0, Contnulo=0, Contnaranjo2=0, Contnaranjo1=0, ContNulo2=0, Contblanco2=0, numnaranjo=0, numceleste=0;
		String color;
		Scanner control = new Scanner(System.in);
		do{
		System.out.print("Celeste o Naranjo");
		color= control.next();
			if (color.equals("Celeste")){
				contcolorC=contcolorC++;
				numceleste=control.nextInt();
				switch (numceleste){
					case 1: Contnum1++; break;
					case 2: Contnum2++; break;
					case 0: Contblanco++; break;
					case -1: Contnulo++; break;
					default: System.out.println("numero no valido");
				}
			}else{
				if (color.equals("Naranjo")){
					ContcolorN=ContcolorN++;
					numnaranjo=control.nextInt();
					switch (numnaranjo){
						case 1: Contnaranjo1++; break;
						case 2: Contnaranjo2++; break;
						case 0: Contblanco2++; break;
						case -1: ContNulo2++; break;
						default: System.out.println("numero no valido");
					}
				}
			}
		}while (!color.equals ("Fin"));
		System.out.print("			El total de votos alcalde es: Candidato 1: " + Contnum1 + " 		Candidato 2: " + Contnum2 + " 		Blanco :	 " + Contblanco + " 		Nulo:	 " + Contnulo);
		System.out.print( "			El total de votos gobernador es: Candidato 1: " + Contnaranjo1 + " 		Candidato 2: " + Contnaranjo2 + " 		Blanco : " + Contblanco2 + " 		Nulo: " + ContNulo2);
	}
}