import java.util.Scanner;
public class hola {
    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);
        int matriz[][];
        matriz = llenadomatriz();
        imprimir(matriz);
        String Foc;
        int num=0;
        int test=0;
        do{
            System.out.println("Indique si desea conocer los datos de una fila o columna y el numero de esta");
            Foc=xd.next();
            num=xd.nextInt();
            test=Valida(matriz, num, Foc);
        }while(test==80);
    }

    public static int[][] llenadomatriz() {
        int llenado[][] = new int[8][3];
        for (int i = 0; i < llenado.length; i++) {
            for (int j = 0; j < llenado[0].length; j++) {
                llenado[i][j] = (int) (Math.random() * 10);
            }
        }
        return (llenado);
    }
    public static void imprimir(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println("");
        }
    }
    public static int Valida(int matriz[][], int num, String FoC){
        int check=80;
        if(FoC.equals("fila") && num<=8){
            LlamarFila(matriz, num);
            check=0;
        }else{
            if(FoC.equals("columna") && num<=3){
                LlamarColumna(matriz, num);
                check=0;
            }
        }
        return(check);
    }
    //muestra la fila entera, se llama arriba
    public static void LlamarFila(int matriz[][], int i){
        for(int j=0; j<matriz[0].length; j++){
            System.out.print(matriz[i-1][j] + "\t");
        }
    }
    //muestra la columna entera, se llama arriba
    public static void LlamarColumna(int matriz[][], int i){
        for(int j=0; j<matriz.length; j++){
            System.out.print(matriz[j][i-1] + "\t");
        }
    }
}