import java.util.Scanner;

public class ejercicio {
    public static void main(String[] args) {
        String[][] calendario = new String[50][16];

        //inicializar matriz en no reservado
        for (int i = 0; i < calendario.length ; i++) {
            for (int j = 0; j < calendario[0].length; j++) {
                calendario[i][j]="No reservado";
            }
        }
        Scanner sc = new Scanner(System.in);
        int sala = 50;
        int bloque = 16;
        String asignatura = "";

        do {
            //ingresando sala
            System.out.println("Ingrese numero de salas");
            sala = sc.nextInt();
            //validar
            while(sala<-1 || bloque>50){
                System.out.println("Ingrese numero de sala valido");
                sala = sc.nextInt();
            }
            //ingresando bloque
            System.out.println("Ingrese numero de bloque");
            bloque = sc.nextInt();
            //validar
            while(sala<-1 || bloque>16){
                System.out.println("Ingrese numero de bloque valido");
                bloque = sc.nextInt();
            }
            //ingresando asignatura
            System.out.println("Ingrese asignatura");
            asignatura = sc.next();
            //validar
            while(asignatura.equals("")){
                System.out.println("Ingrese una asignatura valido");
                asignatura = sc.next();
            }
            //si todos los datos son 0 debe salir del ciclo y no seguir reservando
            if(sala==0 && bloque==0 && asignatura.equals("0")){
                break;
            }

            // reservando sala
            String noReservado = "No reservado";
            if(!noReservado.equals(calendario[sala-1][bloque-1])){
                System.out.println("El bloque indicado para reservar no esta disponible");
                break;
            }else{
                calendario[sala-1][bloque-1]=asignatura;
                System.out.println("Su reserva se ha realizado con exito");
            }

        } while (sala!=0 && bloque!=0 && !asignatura.equals("0"));

        //mostrar las reservas
        for (int i = 0; i < calendario.length ; i++) {
            for (int j = 0; j < calendario[0].length; j++) {
                System.out.println("Sala "+(i+1)+" Bloque"+(j+1)+ " :"+calendario[i][j]);
            }
        }
    }
}