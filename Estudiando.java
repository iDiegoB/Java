import java.util.Scanner;
public class Estudiando {
    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);
          int profesion[]= new int[2];
          int trabajando[]=new int[2];
          int sueldo[]=new int[2];
          int matriz[][]=new int [2][3];
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < matriz.length; j++) {
                profesion[i]=xd.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println(matriz[i][j]);
            }

        }
    }
}