public class ejercicioo{
    public static void main(String[] args) {
        int matriz[][];
        matriz=Llenadomatriz();
        imprimir(matriz);

    }
    public static int [][] Llenadomatriz(){
        int a[][]=new int[8][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = (int) (Math.random() * 10);
            }
        }
        return (a);
    }
   public static void imprimir ( int matriz [][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+ "  ");
            }
            System.out.println("");
        }
    }
}