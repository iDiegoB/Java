import java.util.Scanner;
public class cont3 {
    public static void main(String[] args) {
        int precio, descuento, cantidad, total, dist, cont=0, tot;
        Scanner xd = new Scanner(System.in);
        String codigo;
            System.out.println("ingrese cuantos codigos distintos comprara: ");
            dist=xd.nextInt();
        do {
            System.out.println("los codigos de los juegos son: abc, cde y hik");
            codigo=xd.next();
            cont++;
                switch (codigo) {
                    case "abc":
                        System.out.println("precio producto: ");
                        precio = xd.nextInt();
                        System.out.println("descuento: ");
                        descuento = xd.nextInt();
                        System.out.println("cantidad: ");
                        cantidad = xd.nextInt();
                        total = (descuento*precio)/100;
                        tot= total*cantidad;
                        System.out.println("total a pagar: " + total);
                        break;
                    case "cde":
                        cont++;
                        System.out.println("precio producto: ");
                        precio = xd.nextInt();
                        System.out.println("descuento: ");
                        descuento = xd.nextInt();
                        System.out.println("cantidad: ");
                        cantidad = xd.nextInt();
                        total = (descuento*precio)/100;
                        tot= total*cantidad;
                        System.out.println("total a pagar: " + total);
                        break;

                    case "hik":
                        System.out.println("precio producto: ");
                        precio = xd.nextInt();
                        System.out.println("descuento: ");
                        descuento = xd.nextInt();
                        System.out.println("cantidad: ");
                        cantidad = xd.nextInt();
                        total = (descuento*precio)/100;
                        tot= total*cantidad;
                        System.out.println("total a pagar: " + total);
                        break;
                }
            }while(cont<dist);
    }
}
