import java.util.Scanner;
public class calse30julio {
    public static void main(String[] args) {
        Scanner xd=new Scanner(System.in);
        String[] nomRegiones = new String[]{"Tarapacá", "Antofagasta", "Coquimbo", "Vaparaíso", "O'Higgins", "El Bío Bío", "Los Lagos", "Aysén",
                "Magallanes y Antártica Chilena", "Región Metropolitana de Santiago", "Los Ríos", "Arica y Parinacota", "Ñuble"};
int alimentacionPorRegion[][]=new int[13][4];
leematriz(nomRegiones,alimentacionPorRegion, xd);
        imprimir(alimentacionPorRegion);
        System.out.println(mayorveganos(nomRegiones, alimentacionPorRegion));
    }

    public static void leematriz(String[] nomRegiones, int[][] alimentacionPorRegion, Scanner xd){
        for (int i = 0; i < alimentacionPorRegion.length; i++) {
            System.out.println("ingrese los datos de la Region "+nomRegiones[i]);
            System.out.println("indique número de vegetarianos");
            alimentacionPorRegion[i][0]=xd.nextInt();
            System.out.println("indique número de carnívoros ");
            alimentacionPorRegion[i][1]=xd.nextInt();
            System.out.println("indique número de veganos");
            alimentacionPorRegion[i][2]=xd.nextInt();
            System.out.println("indique número de alimentación basa en plantas");
            alimentacionPorRegion[i][3]=xd.nextInt();
        }
    }
    public static void imprimir(int [][] alimentacionPorRegion) {
        for (int i = 0; i < alimentacionPorRegion.length; i++) {
            for (int j = 0; j < alimentacionPorRegion[0].length; j++) {
                System.out.print(alimentacionPorRegion[i][j]+"  ");
            }
            System.out.println("");
        }

    }

    public static String mayorveganos(String [] nomRegiones, int[][]alimentacionPorRegion) {
        int mayorveganos=0;
        String masveganos=null;
        for (int i = 0; i < alimentacionPorRegion.length; i++) {
                if (alimentacionPorRegion[i][2] > mayorveganos) {
                    mayorveganos=alimentacionPorRegion[i][2];
                    masveganos=nomRegiones[i];
            }
        }
        return masveganos;
    }
}
