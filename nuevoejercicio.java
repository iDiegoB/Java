import java.util.Scanner;
public class nuevoejercicio {
    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);
        String jugadores[]=new String[2];
        String juego[]=new String[1];
        int puntaje[][]=new int[2][1];
        llenarlinea1(jugadores, xd);
        llenarlinea2(juego, xd);
        puntaje(puntaje, xd, jugadores, juego);

    }

    public static void llenarlinea1(String jugadores[], Scanner xd) {
        for (int i = 0; i < jugadores.length; i++) {
            System.out.println("ingrese nombre de jugadores");
            jugadores[i]=xd.next();
        }
    }

    public static void llenarlinea2(String juego[], Scanner xd) {
        for (int i = 0; i < juego.length; i++) {
            System.out.println("ingrese nombre de juegos");
            juego[i]=xd.next();
        }
    }

    public static void puntaje(int puntaje[][], Scanner xd, String [] jugadores, String [] juego) {
        for (int i = 0; i < puntaje.length; i++) {
            for (int j = 0; j < puntaje[0].length; j++) {
                        System.out.println("ingrese puntaje de " + jugadores[i] + " del juego  " + juego[j]);
                        puntaje[i][j]=xd.nextInt();
            }
        }
    }

}
