import java.util.Scanner;
public class studi {
    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);
        String nombresjugadores[];
        String nombredejuegos[];
        String jugadoress[] = new String[3];
        int puntaje[][];
        System.out.println("indique nombre de jugadores");
        jugadores(xd,jugadoress);
        System.out.println("indique nombre de juegos");
        nombredejuegos = juegos(xd);
        System.out.println("indique mejor puntaje por jugador");
        puntaje = mejorpuntaje(xd);
        System.out.println("Indique el jugador");
        String jugador = xd.next();
        identificadorjugador(jugador,jugadoress);
    }

    public static String[] jugadores(Scanner xd, String jugadoress[]) {
        for (int i = 0; i < jugadoress.length; i++) {
            jugadoress[i] = xd.next();
        }
        return jugadoress;
    }

    public static String[] juegos(Scanner xd) {
        String juekos[] = new String[1];
        for (int i = 0; i < juekos.length; i++) {
            juekos[i] = xd.next();
        }
        return (juekos);
    }

    public static int[][] mejorpuntaje(Scanner xd) {
        int mekorpunt[][] = new int[5][1];
        for (int i = 0; i < mekorpunt.length; i++) {
            for (int j = 0; j < mekorpunt[0].length; j++) {
                mekorpunt[i][j] = xd.nextInt();
            }
        }
        return (mekorpunt);
    }

    //validar
    public static void identificadorjugador(String jugador, String jugadoress[]) {
        int i = 0;
        boolean buscar = false;
        while (i  < jugadoress.length) {
            if (jugador.equalsIgnoreCase(jugadoress[i]) == true) {
                buscar = true;
            }
            i++;
        }
        if(buscar==true) {
            System.out.println("Fue encontrado anashei");
        }else{
            System.out.println("No lo encontramo naita gancho");
        }
    }
}