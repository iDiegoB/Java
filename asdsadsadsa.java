    import java.util.Scanner;
    public class asdsadsadsa {
        public static void main(String[] args) {
            int AguaCaidaTotal[][] = new int[20][12];
            int AguaCaidaAnual[] = new int[20];
            int Totalaños[] = new int[20];
            Scanner teclado = new Scanner(System.in);
            System.out.println("El total de agua caida es");
            calculaTotales(AguaCaidaTotal, Totalaños);
        }

        public static void calculaTotales(int AguaCaidaTotal[][], int TotalAños[]){
            int totalanual= 0;
            for (int i = 0; i < AguaCaidaTotal.length; i++) {
                for (int j = 0; j < AguaCaidaTotal[0].length; j++) {
                    System.out.println("Ingrese el total de acua caida del año "+(i+1)+ " y mes "+(j+1));
                    AguaCaidaTotal[i][j] = (int)(Math.random()*5+1);
                }
            }
            for (int i = 0; i < AguaCaidaTotal.length ; i++) {
                for (int j = 0; j < AguaCaidaTotal[0].length ; j++) {
                    System.out.println("El total de agua caida del año "+(i+1)+" es:");
                    System.out.println(AguaCaidaTotal[i][j] + " ");
                    totalanual = AguaCaidaTotal[i][j] + totalanual;
                }
                TotalAños[i] = totalanual;
                totalanual = 0;
                System.out.println("El total del año " +(i+1)+" es: "+TotalAños[i]);
            }
        }
    }