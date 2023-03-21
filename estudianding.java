import java.util.Scanner;
public class estudianding {
    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);
        int totalmatriz=0;
        int akua[][] = new int[20][12];
        int año = 0;
        int mes=0;
        aguacaida(akua, xd);
        imprimir(akua);
        totalmatriz=sumamatriz(akua);
        System.out.println("indique que mes quiere ver porcentaje de agua caida");
        mes=xd.nextInt();
        System.out.println(sumafila(akua,mes, totalmatriz)+"%");
        System.out.println("indique año que desea calcular");
        año = xd.nextInt();
        System.out.println(sumacolumna( akua, año));
    }
//llena matriz
    public static void aguacaida(int akua[][], Scanner xd) {
        for (int i = 0; i < akua.length; i++) {
            for (int j = 0; j < akua[0].length; j++) {
                System.out.println("indique el agua caida en el mes " + (j + 1) + " año " + (i + 1));
                akua[i][j] = xd.nextInt();
            }
        }
    }
//imprime matriz
    public static void imprimir(int akua[][]) {
        for (int i = 0; i < akua.length; i++) {
            for (int j = 0; j < akua[0].length; j++) {
                System.out.print(akua[i][j] + "  ");
            }
            System.out.println("");
        }
    }
    //suma año
    public static int sumacolumna(int matriz[][], int i) {
        int suma=0;
        for (int j = 0; j < matriz[0].length; j++) {
            suma+=matriz[i-1][j];
        }
        return suma;
    }
    //calcula promedio mes
    public static int sumafila(int matriz[][], int k, int totalmatriz) {
        int suma=0;
        for (int i = 0; i < matriz.length; i++) {
                suma+=matriz[i][k-1]*100/totalmatriz;
        }
        return suma;
    }
//suma toda una matriz
    public static int sumamatriz(int akua[][]) {
        int suma=0;
        for (int i = 0; i < akua.length; i++) {
            for (int j = 0; j < akua[0].length; j++) {
                suma+=akua[i][j];
            }
        }
        return suma;
    }
}
