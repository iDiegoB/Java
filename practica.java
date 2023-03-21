import java.util.Scanner;
public class practica {
    public static void main(String[] args) {
        Scanner xd=new Scanner(System.in);
        String nombres[]=new String[5];
        int puntajeporfila[]=new int[5];
        int datos[][]=new int[5][5];
        llenadomatriz(datos, xd);
        llenadouni(nombres, xd);
        imprimirmatriz(datos);
        imprimiruni(nombres);
        System.out.println("puntaje total por fila ");
        puntajeporfila=(puntajetotalxfila(datos));
        for (int i = 0; i < puntajeporfila.length; i++) {
            System.out.println(puntajeporfila[i]);
        }
    }

    public static void llenadomatriz(int datos[][], Scanner xd) {
        int num=0;
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[0].length; j++) {
                System.out.println("indique numeros");
                num=xd.nextInt();
                datos[i][j]=num;
            }
        }
    }

    public static void llenadouni(String nombres[], Scanner xd) {
        String nombress=null;
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("indique nombre "+ (i+1));
            nombress=xd.next();
            nombres[i]=nombress;
        }
    }

    public static void imprimirmatriz(int datos[][]) {
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[0].length; j++) {
                System.out.print(datos[i][j]+"      ");
            }
            System.out.println("");
        }
    }

    public static void imprimiruni(String nombres[]) {
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i]+"  ");
        }
    }

    public static int[] puntajetotalxfila(int[][] datos) {
        int puntajeporfila[]=new int[5];
        int sumatotal=0;
        for (int i = 0; i < datos.length ; i++) {
            for (int j = 0; j < datos[0].length; j++) {
                sumatotal+= datos[i][j];
                puntajeporfila[i]+=sumatotal;
            }
            sumatotal=0;
        }
        return puntajeporfila;
    }


}
