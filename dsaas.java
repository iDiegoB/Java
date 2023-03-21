import java.util.Scanner;
public class dsaas{
    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);
        int p=0, o=0;
        System.out.println("indique cuantos tipos de libros llevara");
        int n=xd.nextInt();
        System.out.println("indique a cuantos paises sera distribuido");
        int m=xd.nextInt();
        int [][] numeroejemplares=new int [n][m];
        String libros[] = new String[n];
        String paises[]=new String[m];
        leeNombres(xd, libros, paises);
        numeroejemplares=procesaVentas(xd,p , o );
        muestraTotalLibrosPorPais(numeroejemplares, paises);
        muestraTotalPorLibro(numeroejemplares, paises);

    }

    public static void leeNombres(Scanner xd, String [] libros,String [] paises) {
        for (int i = 0; i < libros.length; i++) {
            System.out.println("indique nombre de libro");
            libros[i]=xd.next();
        }
        for (int i = 0; i < paises.length; i++) {
            System.out.println("indique nombre de paises");
            paises[i]=xd.next();
        }
    }

    public static int[][] procesaVentas(Scanner xd, int p,int o ) {
        System.out.println("indique numero de ventas a realizar");
        p=xd.nextInt();
        o=3;
        int [][]procesaVentass=new int[p][o];
        int codigolibro=0;
        int codigopais=0;
        int numejemplares=0;
        for (int i = 0; i< procesaVentass.length; i++) {
            codigolibro = (int) (Math.random() * 5);
            System.out.println("codigo del libro: " + codigolibro);
            procesaVentass[i][0] = codigolibro;
            codigopais =(int) (Math.random() * (6 - 10 + 1) + 10);
            System.out.println("codigo pais: " + codigopais);
            procesaVentass[i][1] = codigopais;
            System.out.println("indique numero de ejemplares");
            numejemplares = xd.nextInt();
            procesaVentass[i][2] = numejemplares;

        }
        System.out.println("codigo libro   codigo pais    numero de ejemplares");
        for (int i = 0; i < procesaVentass.length; i++) {
            for (int j = 0; j < procesaVentass[0].length; j++) {
                System.out.print(procesaVentass[i][j]+"               ");
            }
            System.out.println("");
        }
        return procesaVentass;
    }
    public static void muestraTotalLibrosPorPais(int[][]numeroejemplares, String[]paises) {
        int[] pPaises = new int[paises.length];
        int ejemplares=0;
        for (int i = 0; i < numeroejemplares.length; i++) {
            ejemplares = numeroejemplares[i][2];
            pPaises[numeroejemplares[i][1]]+= ejemplares;
        }
        for (int i = 0; i < pPaises.length; i++) {
            System.out.println("Para el pais " + paises[i] + " se deben enviar " + pPaises[i] + " libros");
        }
    }
    public static void muestraTotalPorLibro(int[][]numeroejemplares, String[]paises) {
        int[] pPaises = new int[paises.length];
        for(int i = 0; i < numeroejemplares.length; i++) {
            if(numeroejemplares[i][0] == numeroejemplares[i][0] && numeroejemplares[i][2] > 0) {
                pPaises[numeroejemplares[i][1]] += numeroejemplares[i][2];
            }
        }
        for(int i = 0; i < pPaises.length; i++) {
            if(pPaises[i] >= 10) {
                System.out.println("Al pais " + paises[i] + " se le enviaran " + pPaises[i] + " ejemplares");
            }
        }
    }
}