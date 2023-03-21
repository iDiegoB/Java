import java.util.Scanner;

public class ejerciciopipe {

    //Rellenar Jugadores
    public static void  JugadoresMatriz(String Jugadores[],Scanner teclado){
        for (int i = 0; i < Jugadores.length ; i++) {
            System.out.println("Ingrese el nombre del jugador");
            Jugadores[i] = teclado.next();
        }
    }

    //Rellenar juegos
    public static void JuegosMatriz(String Juegos[],Scanner teclado) {
        for (int i = 0; i < Juegos.length; i++) {
            System.out.println("Ingrese el nombre del juego");
            Juegos[i] = teclado.next();
        }
    }



    //Comenzamos a validar el nombre del jugador en matriz
    public static void IdentificadorJugador(String Jugadores[], Scanner teclado) {
        System.out.println("Ingresa el nombre del jugador a buscar");
        String buscar = teclado.next();
        boolean resp = false;
        for (int i = 0; i < Jugadores.length; i++) {
            if (!buscar.equalsIgnoreCase(Jugadores[i]) == true) {
                resp = true;
                System.out.println("El jugador si fue encontrado");
                break;
            }
        }
        if (resp == false) {
            System.out.println("El jugador no ha sido encontrado");
        }
    }

    //Ingresar puntajes por jugadores
    public static void puntaje(int Puntajes[][],Scanner teclado, String Jugadores[], String Juegos[]){
        for (int i = 0; i < Puntajes.length ; i++) {
            for (int j = 0; j < Puntajes[0].length ; j++) {
                System.out.println("Ingrese el puntaje del jugador "+Jugadores[i]+" del juego "+ Juegos[j]);
                Puntajes[i][j]= teclado.nextInt();
            }
        }
    }






    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String Jugadores[] = new String[30];
        String Juegos[] = new String[10];
        int Puntajes[][] = new int[30][10];

        System.out.println("VAMOS A COMENZAR A ANOTAR A LOS JUGADORES");
        JugadoresMatriz(Jugadores,teclado);
        System.out.println("YA HAS FINALIZADO");


        System.out.println("COMIENZA A ANOTAR LOS JUEGOS!");
        JuegosMatriz(Juegos,teclado);


        //Comenzamos a validar el nombre del jugador en matriz
        IdentificadorJugador(Jugadores, teclado);
        puntaje(Puntajes,teclado,Jugadores, Juegos);
    }
}