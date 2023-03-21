import java.util.Scanner;
public class Control5DiegoBarra {
    public static void main(String[] args) {
        // Declaracion de variables
        Scanner tcld = new Scanner(System.in);
        int[][] puntajes = new int[15][7];
        String[] paises = {"Mexico","China","Alemania","Japon","Colombia","Rusia","Inglaterra","Suecia",
                "EE.UU.","Canada","Portugal","Paises Bajos","Francia","Polonia","Cuba"};
        String[] paisesConRecord;
        int[] puntajeTotalPorPais;
        String nombrePais;
        int opcion, puntajeRecord=6;

        generaPuntajes(puntajes);

        puntajeTotalPorPais = determinaPuntajePorPais(puntajes); // función que debe hacer (***)

        System.out.print("\nPuntajes totales por pais: ");
        despliegaPuntajes(puntajeTotalPorPais);

        // Menu de opciones
        do {
            System.out.println("\n\nMENU DE OPCIONES");
            System.out.println("1. Determina medalla de oro");
            System.out.println("2. Determina records");
            System.out.println("3. Salir");
            System.out.print("\n\tIngrese opcion: ");
            opcion = tcld.nextInt();

            switch(opcion) {
                case 1: // Determina pais con medalla de oro

                    nombrePais = determinaPaisConMedallaDeOro(puntajeTotalPorPais,paises); // (***)
                    System.out.println("\nPais ganador de medalla de oro: " + nombrePais);
                    break;

                case 2: // Determina paises con records
                    paisesConRecord = determinaPaisesConRecord(puntajeTotalPorPais,paises,puntajeRecord);//(***)

                    if (paisesConRecord != null) {
                        System.out.print("\nPaises con record olimpico son: ");
                        despliegaPaises(paisesConRecord);
                    } else {
                        System.out.println("\nNingun pais superó el record olimpico");
                    }
                    break;

                case 3: // Salir del programa
                    System.out.println("\nSaliendo del programa...");
                    break;

                default: System.out.println("\nOpcion erronea");
            }
        } while (opcion != 3);

    }

    public static void generaPuntajes(int[][] puntajes) {
        // Genera puntajes
        for (int i=0; i<puntajes.length; i++) {
            for (int j=0; j<puntajes[0].length; j++) {
                puntajes[i][j] = (int)(Math.random()*11);
            }
        }
        // Despliega puntajes
        for (int[] fila : puntajes) {
            for (int elem : fila) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    public static void despliegaPaises(String[] nombres) {
        for (String elem : nombres) {
            if (elem != null) {
                System.out.print(elem + " ");
            }
        }
    }

    public static void despliegaPuntajes(int[] puntajes) {
        for (int elem : puntajes) {
            System.out.print(elem + " ");
        }
    }
// determinar puntaje por pais
public static int [] determinaPuntajePorPais (int [] [] puntajes) {
        int []puntajepaises=new int[puntajes.length];
    for (int i = 0; i < puntajes.length; i++) {
        for (int j = 0; j < puntajes[0].length; j++) {
            if(j<5) {
                puntajepaises[i]+= (puntajes[i][j]* 0.6)/4;
            }else {
                puntajepaises[i]+= (puntajes[i][j]* 0.4)/3;
            }
        }
    }
    return puntajepaises;
}
    public static String determinaPaisConMedallaDeOro(int[] puntajeTotalPorPais ,String[] paises) {
        int masalto = 0;
        int puntajemasAlto = 0;
        for(int i=0; i<puntajeTotalPorPais.length; ++i){
            if(masalto < puntajeTotalPorPais[i]){
                masalto = puntajeTotalPorPais[i];
                puntajemasAlto = i;
            }
        }
        return paises[puntajemasAlto];
    }
    //determinar paises con record
    public static String[] determinaPaisesConRecord(int[] puntajeTotalPorPais,String[] paises,int puntajeRecord) {
        String []paisesConRecord = new String[paises.length];
        int cont=0;
        for(int i=0; i<puntajeTotalPorPais.length; ++i){
            if(puntajeTotalPorPais[i] >= puntajeRecord){
                paisesConRecord[cont] = paises[i];
                cont++;
            }
        }
        if(paisesConRecord[0] == null){
            return null;
        }else{
            return paisesConRecord;
        }
    }
}