import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);
        System.out.println("hola putita");
        String[] nombres ={"Juan","Sofia","Pilar","Diego", "Patricio", "Karina", "Alex", "Nicolas", "Mabel", "Felipe"};
        double[][] matriz = new double[nombres.length][4];
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Ingrese Notas de: " + nombres[i]);
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Ingrese notas: ");
                matriz[i][j] = xd.nextDouble();
            }
        }
        for(int i=0; i<matriz.length;i++) {
            double suma = 0;

            for (int j=0; j < matriz[0].length; j++){
                suma+=matriz[i][j];

            }
            System.out.println("promedio de "+(nombres[i])+":"+(suma/4));
        }
        double mayor,menor;
        for(int i=0; i<matriz.length;i++) {
            mayor=0;
            menor=8;
            for (int j=0; j < matriz[0].length; j++){
                if (matriz[i][j]>mayor){
                    mayor=matriz[i][j];
                }
                if(matriz[i][j]<menor){
                    menor=matriz[i][j];
                }
            }
            System.out.println("nota mas alta de " +nombres[i]+" es: "+ mayor);
            System.out.println("nota mas baja de " +nombres[i]+" es: "+ menor);
        }
    }
}