import java.util.Scanner;
public class aaa {
    public static void main(String[] args) {
        Scanner xd=new Scanner(System.in);
        int matriz[][];
        int num, fila;
        matriz=llenarmatriz();
        imprimir(matriz);
        System.out.println(sumafila(matriz));
       mayorfila(matriz);


    }

    public static int[][] llenarmatriz() {
        int llenado[][]=new int[8][3];
        for (int i = 0; i < llenado.length ; i++) {
            for (int j = 0; j < llenado[0].length; j++) {
                llenado[i][j]=(int)(Math.random()*10);
            }
        }
        return (llenado);
    }

    public static void mayorfila(int matriz[][]) {
        int mayor, fila, columna;
        mayor=matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j]>=mayor){
                    mayor=matriz[i][j];
                    fila=i;
                    columna=j;
                    System.out.println("mayor=  "+mayor+"  fila=  "+ fila+"  columna=  "+ columna);
                }
            }
        }
    }

    public static void imprimir (int matriz[][]) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+ "  ");
            }
            System.out.println("");
        }
    }

    public static int sumafila(int matriz[][]) {
        int suma=0;
        for (int i = 0; i < matriz.length; i++) {
            suma+=matriz[i][0];
        }
           return suma;
        }
}
