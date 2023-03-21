import java.util.Scanner;
public class Contro {
    public static void main(String[] args) {
        Scanner xd=new Scanner(System.in);
        String tipodetra = new String();
        double remuneracion=0;
        int horastra = 0, precioho=0;
        do {
            tipodetra = tipodetrabajador(tipodetra, xd);
            horastra = horastrabajadas(horastra, xd);
            precioho = preciohorastrabajadas(precioho, xd);
            System.out.println(calculoremuneracion(horastra, tipodetra, precioho));
            remuneracion=calculoremuneracion(horastra,tipodetra,precioho);
        }while(remuneracion==0);
    }

    public static String tipodetrabajador(String tipodetra, Scanner xd) {
        System.out.println("ingrese tipo de trabajo");
        tipodetra=xd.next();
        return tipodetra;
    }

    public static int horastrabajadas(int horastra, Scanner xd) {
        System.out.println("ingrese horas trabajadas");
        horastra=xd.nextInt();
        return horastra;
    }

    public static int preciohorastrabajadas(int precioho, Scanner xd) {
        System.out.println("ingrese precio por hora");
        precioho=xd.nextInt();
        return precioho;
    }
//ejemplo validar y sacar porcentaje (numerono100%*100/nomerosi100%)
    public static double calculoremuneracion(int horastra, String tipodetra, int precioho) {
        double remuneracion=0;
            if (tipodetra.equalsIgnoreCase("gerente")) {
                remuneracion = (double) (horastra * precioho + 125000) * 0.20;
            } else {
                if (tipodetra.equalsIgnoreCase("vendedor")) {
                    remuneracion = (double) (horastra * precioho + 35000) * 0.20;
                } else {
                    if (tipodetra.equalsIgnoreCase("secretaria")) {
                        remuneracion = (double) (horastra * precioho + 15000) * 0.20;
                    } else {
                        System.out.println("ingrese tipo de trabajo valido");
                    }
                }
            }
        return remuneracion;
    }

}
