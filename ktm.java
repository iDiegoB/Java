import java.util.Scanner;
public class ktm {
    public static void main(String[] args) {
        String[][] calenario = new String[50][16];
        inicializarMatrizNoReservado(calenario);
        Scanner sc = new Scanner(System.in);

        int menu=1;
        do {
            //Menu
            System.out.println("Ingrese la opcion del menu");
            System.out.println("1:Reservar Sala");
            System.out.println("2:Mostrar en pantalla qué salas están reservadas y en qué bloque");
            System.out.println("3:Salir");

            menu = sc.nextInt();
            switch (menu) {
                case 1://reservar sala
                    int sala = 0;
                    while (sala == 0) {
                        System.out.println("Ingrese numero de salas");
                        sala = validador(1, 50, sc);
                        if (sala == 0) {
                            System.out.println("Numero invalido, ingrese valor valido");
                        }
                    }
                    int bloque = 0;
                    while (bloque == 0) {
                        System.out.println("Ingrese numero de bloque");
                        bloque = validador(1, 16, sc);
                        if (bloque == 0) {
                            System.out.println("Numero invalido, ingrese valor valido");
                        }
                    }

                    System.out.println("Ingrese asignatura");
                    String asignatura = sc.next();
                    reservaSala(calenario, sala, bloque, asignatura);
                    break;
                case 2:  //mostrar por pantalla las reservas
                    System.out.println("Ingrese bloque");
                    int block = sc.nextInt();
                    mostrarReservaSegunBloque(calenario, block);
                    break;
                case 3:
                    break;
            }
        } while (menu != 3);
    }
    public static void reservaSala(String [][] calendario, int sala, int bloque, String asignatura){
        String noReservado = "No reservado";
        if(!noReservado.equalsIgnoreCase(calendario[sala-1][bloque-1])){
            System.out.println("El bloque indicado para reservar no esta disponible");
        }else{
            calendario[sala-1][bloque-1]=asignatura;
            System.out.println("Su reserva se ha realizado con exito");
        }
    }

    public static void mostrarReservaSegunBloque(String [][] calendario, int bloque){
        for (int i = 0; i < 50 ; i++) {
            System.out.println("Bloque"+bloque+ ", Sala "+(i+1)+":"+calendario[i][bloque-1]);
        }

    }

    public static int validador(int min, int max, Scanner tec){
        int valor = tec.nextInt();
        if(valor>=min && valor<=max){
            return valor;
        }else{
            return 0;
        }
    }


    public static void inicializarMatrizNoReservado(String [][] mat){
        for (int i = 0; i < mat.length ; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j]="No reservado";
            }
        }
    }
}
