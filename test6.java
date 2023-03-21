import java.util.Scanner;
public class test6{
     public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
	
		String prod1;
		String prod2;
		String prod3;
		int precioProd1, precioProd2, precioProd3;
		int descp1,descp2,descp3;
		
		System.out.println("Ingrese nombre, precio y decuento del producto 1");
        prod1=tec.next();precioProd1=tec.nextInt();descp1=tec.nextInt();
		
		System.out.println("Ingrese nombre, precio y decuento del producto 2");
        prod2=tec.next();precioProd2=tec.nextInt();descp2=tec.nextInt();
		
		System.out.println("Ingrese nombre, precio y decuento del producto 3");
        prod3=tec.next();precioProd3=tec.nextInt();descp3=tec.nextInt();
		
		String prodC;
		int nc=0;
		int cant=0;
		double TotalCliente=0;
		double tt=0;
		int totCliProd1=0,totCliProd2=0, totCliProd3=0; 
		int Cliente=1;
		double TotalDia=0;
		
		System.out.print(" \n Ingrese cantidad de productos diferentes que lleva el cliente  " + ": \t");
		nc=tec.nextInt();
		while (nc != 0) { // ciclo para control del día
			 Cliente++;
		     TotalCliente=0;
			 for (int i = 0; i < nc; i++){ // ciclo para las compras de un cliente
				System.out.print("Producto " + (i+1) + " : ");
				prodC=tec.next();
				System.out.print("Ingrese cantidad ");
				cant=tec.nextInt(); 
				
				if(prodC.equals(prod1)){
					if (cant > 3){
						System.out.println((double)(cant*precioProd1)*((100-15)/100));
						TotalCliente+= (double)(cant*precioProd1)*((100-15)/100);
					}
					else{
						tt = ((double)cant*precioProd1)*((100-descp1)/100);
						System.out.println(tt);
						TotalCliente+= (double)(cant*precioProd1)*((100-descp1)/100);
					}
				}
				else{
					if (prodC.equals(prod2)){
						if (cant > 3){
						    TotalCliente+= (double)(cant*precioProd2)*((100-15)/100);
						}
						else{
							tt = (double)(cant*precioProd2)*((100-descp2)/100);
							System.out.println(tt);
							TotalCliente+= (double)(cant*precioProd2)*((100-descp2)/100);
						}
					}
					else{
						if (cant > 3){
							TotalCliente+= (double)(cant*precioProd3)*((100-15)/100);
						}
						else{
							tt = (double)(cant*precioProd3)*((100-descp3)/100);
							System.out.println(tt);
							TotalCliente+= (double)(cant*precioProd3)*((100-descp3)/100);
						}
					}
				}			
			 }
			System.out.println("Total a pagar por el cliente " + Cliente + " : " + TotalCliente);
			TotalDia+=TotalCliente;
			
			
			 System.out.print(" \n Ingrese cantidad de productos diferentes que lleva el cliente " + Cliente + ": \t");
			 nc=tec.nextInt();
		}	
			
		
		
		System.out.println("\n Ventas del día:$ " + TotalDia);
		
	}
}
//rvaras@kaizenasesorias.cl