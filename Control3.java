import java.util.Scanner;
public class Control3{
public static void main(String[] args) {
		int primero=0, segundo=0, tercero=0, precio1=65, precio2=75, precio3=40, cod=0, CLP=735, US=0, total=0, total2=0, total3=0;
		double descuento;
		String ABCFGK, RSTVHC, KLJNDI, codigo;
		Scanner xd = new Scanner(System.in);
		System.out.println("codigos: ABCFGK, RSTVHC, KLJNDI");
		System.out.println("ingrese codigo de videojuego: ");
		codigo=xd.next();
		do{
			if(codigo.equals("ABCFGK")){
				US=precio1+precio1;
				System.out.println("ingrese cantidad");
				primero=xd.nextInt();
				total=primero+primero;
				if(primero>=3){
							descuento=(precio2*0.15);
							System.out.println("se le aplica un descuento de 15%"+ (double)(descuento));
							(double)(precio1)=(precio1*descuento);
				}
			}else{
				if(codigo.equals("RSTVHC")){
					precio2++;
					System.out.println("ingrese cantidad");
					segundo=xd.nextInt();
					total2=segundo+segundo;
					if(segundo>=3){
						descuento=(precio2*0.15);
						System.out.println("se le aplica un descuento de 15%"+ (double)(descuento));
						(double)(precio2)=(precio2*descuento);
					}
				}else{
					if(codigo.equals("KLJNDI")){
						precio3++;
						System.out.println("ingrese cantidad");
						tercero=xd.nextInt();
						total3=tercero+tercero;
						if(tercero>=3){
							descuento=(precio2*0.15);
							System.out.println("se le aplica un descuento de 15%"+ (double)(descuento));
							(double)(precio3);
							precio3=(precio3*descuento);
						}
					}
				}
			}
				System.out.println("ingrese nuevamente el codigo");
				codigo=xd.next();
		}while (cod!=0);
			System.out.println("ABCFGK: US$: " + precio1 + ("	CLP: ") + (precio1*CLP) );
			System.out.println("KLJNDI: US$: " + precio3 + ("	CLP: ") + (precio3*CLP) );
			System.out.println("RSTVHC US$: " + precio2 + ("	CLP: ") + (precio2*CLP) );
		}
	}
