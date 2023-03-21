public class a {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        System.out.println("La suma de la diagonal de una matriz cuadrada es: "+ sumaDiagonal(matriz));
imprimir(matriz);
    }
    //DIAGONAL
    public static int sumaDiagonal(int[][] mat) {
        // Precondicion: filas(mat) = columnas(mat)>=1
        int suma = 0;
        for (int i=0; i< mat.length; i++) {
            suma += mat[i][i];
        }
        return suma;
    }
    //IMPRIMIR
    public static void imprimir(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i]+"   ");

        }
    }
}
