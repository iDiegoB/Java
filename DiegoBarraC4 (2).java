import java.util.Scanner;

public class DiegoBarraC4 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int resp=0, prov=0, encontrado=0, total=0;
        System.out.println("indique cantidad de proveedores: ");
        prov= tec.nextInt();
        int mat[][] = new int[prov][3];
        llenarMatriz(mat,tec);
        String[] proveedores = new String[prov];
        nomProductores(proveedores,tec);
        do {
            System.out.println("indique: \n1.-gramos por tipo de clasificación que se recibieron\n2.-Gramos por productor\n3.-Consultar por nombre de productor\n4.-Salir");
            resp = tec.nextInt();
            switch (resp) {
                case 1:
                    System.out.println("gramos por tipo de clasificación que se recibieron");
                    mostrarMat(mat);
                    break;
                case 2:
                    gramosProductor(mat, proveedores);
                    break;
                case 3:
                    encontrado = porProductor(mat, proveedores, tec);
                    if (encontrado != -1) {
                        for (int j = 0; j < mat[0].length; j++) {
                            total += mat[encontrado][j];
                        }
                    } else {
                        System.out.println("nombre no encontrado");
                    }
                    System.out.println("cantidad total del productor " + proveedores[encontrado] + " es de : " + total + " gramos");
                    break;
                case 4:
                    System.out.println("saliendo...");
                    break;
            }
        }while (resp<4);

    }
    static void llenarMatriz(int [][] mat, Scanner tec){
        String resp2;
        for (int i = 0; i < mat.length; i++) {
            System.out.println("ingresa cajon? si/no");
            resp2 = tec.next();
            if (resp2.equalsIgnoreCase("si")) {
                System.out.println("ingrese gramos de tomate en conserva");
                mat[i][0] = tec.nextInt();
                System.out.println("ingrese gramos de tomate en salsa");
                mat[i][1] = tec.nextInt();
                System.out.println("ingrese gramos de tomate en secado");
                mat[i][2] = tec.nextInt();
            }else{
                mat[i][0]=0;
                mat[i][1]=0;
                mat[i][2]=0;
            }
        }
    }
    static void nomProductores(String [] proveedores, Scanner tec){
        for (int i = 0; i < proveedores.length; i++) {
            System.out.println("indique nombre de Productor");
            proveedores[i]= tec.next();
        }
    }
    static void mostrarMat(int [][] mat){
        System.out.printf("%10s %10s %10s","Conserva", "Salsa", "Secado");
        System.out.println();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.printf("%10s",mat[i][j] + "gr");
            }
            System.out.println();
        }
    }
    static void gramosProductor(int [][] mat, String [] proveedores){
        System.out.printf("%10s %10s %10s %10s","Productor","Conserva", "Salsa", "Secado");
        System.out.println();
        for (int i = 0; i < proveedores.length; i++) {
            System.out.printf("%10s",proveedores[i]);
            for (int j = 0; j < mat[0].length; j++) {
                System.out.printf("%10s",mat[i][j] + "gr");
            }
            System.out.println();
        }
    }
    static int porProductor(String [] proveedores, Scanner tec){
        String productor;
        System.out.println("indique nombre del productor");
        productor= tec.next();
        for (int i = 0; i < proveedores.length; i++) {
            if (productor.equalsIgnoreCase(proveedores[i])) {
                return i;
            }
        }
        return -1;
    }
}
