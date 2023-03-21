import java.util.Scanner;
public class lkl {
    public static void main(String[] args) {
        Scanner xd=new Scanner(System.in);
        String nombresjugadores[];
        String nombredejuegos[];
        int puntaje[][];
        int valorpuntaje=0, x=0;
        String nombrejugador, nombrejuego;
        int respuesta=0, respuesta2=0;
        System.out.println("indique nombre de jugadores");
        nombresjugadores=jugadores(xd);
        System.out.println("indique nombre de juegos");
        nombredejuegos=juegos(xd);
        System.out.println("indique mejor puntaje por jugador");
        puntaje=mejorpuntaje(xd);
        do{
            System.out.println("indique nombre de jugador que desea encontrar");
            nombrejugador = xd.next();
            respuesta=identificadorjugador(nombresjugadores, nombrejugador, xd);
        }while (respuesta==50);
        do{
            System.out.println("indique nombre de juego que desea encontrar");
            nombrejuego = xd.next();
            respuesta2=identificadorjuegos(nombredejuegos, nombrejuego, xd);
        }while (respuesta2==50);
        do {
            System.out.println("ingrese nuevo valor a su puntaje");
            valorpuntaje = xd.nextInt();
            x=puntajess(puntaje, valorpuntaje);
        }while(x==50);
    }

    public static String []jugadores(Scanner xd) {
        String jugadoress[]=new String[3];
        for (int i = 0; i < jugadoress.length; i++) {
            jugadoress[i]=xd.next();
        }
        return jugadoress;
    }

    public static String [] juegos (Scanner xd) {
        String juekos[]=new String[1];
        for (int i = 0; i < juekos.length; i++) {
            juekos[i]=xd.next();
        }
        return (juekos);
    }

    public static int[][]mejorpuntaje(Scanner xd) {
        int mekorpunt[][]=new int[3][1];
        for (int i = 0; i < mekorpunt.length; i++) {
            for (int j = 0; j < mekorpunt[0].length ; j++) {
                mekorpunt[i][j]=xd.nextInt();
            }
        }
        return (mekorpunt);
    }

    public static int identificadorjugador(String nombresjugadores[], String nombrejugador, Scanner xd) {
        int respuesta=50;
        int fila;
        for (int i = 0; i < nombresjugadores.length; i++) {
            if (nombrejugador.equalsIgnoreCase(nombresjugadores[i])) {
                respuesta = 0;
                fila=i;
                System.out.println("encontrado en fila: "+fila);
            }
        }
        if (respuesta == 0) {
            System.out.println("el jugador " + nombrejugador + " ha sido encontrado");
            respuesta=0;
        } else {
            System.out.println("el jugador " + nombrejugador + " no ha sido encontrado");
            respuesta=50;
        }
        return respuesta;
    }
    public static int identificadorjuegos(String nombredejuegos[], String nombrejuego, Scanner xd) {
        int respuesta2=50;
        int columna;
        for (int i = 0; i < nombredejuegos.length; i++) {
            if (nombrejuego.equalsIgnoreCase(nombredejuegos[i])) {
                respuesta2 = 0;
                columna=i;
                System.out.println("encontrado en columna: "+columna);
            }
        }
        if (respuesta2 == 0) {
            System.out.println("el juego " + nombrejuego);
            respuesta2=0;
        } else {
            System.out.println("el juego" + nombrejuego + " no ha sido encontrado");
            respuesta2=50;
        }
        return respuesta2;
    }

    public static int puntajess(int puntaje[][], int valorpuntaje) {
        int x=50;
        for (int i = 0; i < puntaje.length; i++) {
            for (int j = 0; j < puntaje[0].length; j++) {
                if(valorpuntaje>puntaje[i][j]){
                    System.out.println("valor puntaje ha sido cambiado");
                    valorpuntaje=puntaje[i][j];
                    x=0;
                } else{
                    if(valorpuntaje<=puntaje[i][j])
                    System.out.println("valor puntaje no ha sido cambiado");
                    x=50;
                }

            }
        }
        return x;
    }

    public static void imprimir(int puntajes[][], String []nombrejuego, String[]nombrejugador) {
        for (int i = 0; i < nombrejuego.length; i++) {
            System.out.print("");
        }
    }
}