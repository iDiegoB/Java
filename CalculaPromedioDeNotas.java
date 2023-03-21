import java.util.Scanner;
public class CalculaPromedioDeNotas {
    public static void main(String[] args) {
        Scanner tcld = new Scanner(System.in);
        String[] nombres = new String[30];
        int [][] notas = new int[30][4];
        int sumaNotas = 0, promedio;
        System.out.println("Calculo de notas finales");
        /* Ciclo for que se repite 30 veces*/
        for (int i = 0; i < nombres.length; i++) {
            System.out.println();
            System.out.print("Ingrese nombre del alumno " + (i + 1) + " -> ");
            nombres[i] = tcld.next();
            for (int j = 0; j < notas[i].length; j++) {
                do {
                    System.out.print("Ingrese nota " + (j + 1) + " -> ");
                    notas[i][j] = tcld.nextInt();
                    if (notas[i][j] < 1 || notas[i][j] > 7) {
                        System.out.println("Error. Nota debe estar entre 1 y 7");
                    }
                } while (notas[i][j] < 1 || notas[i][j] > 7);
            }
        }
        System.out.println();
        System.out.println("Promedios finales");
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                sumaNotas += notas[i][j];
            }
        }
    }
}