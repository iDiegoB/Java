import java.util.Scanner;

public class DiegoBarraC3 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int cantPro = 0, producto = 0, cant = 0, valorproducto = 0, valinv = 0;
        String resp;
        //indica el tamaño de filas del arreglo, "productos"
        System.out.print("indique la cantidad de productos: ");
        cant = tec.nextInt();
        int[][] array = new int[cant][3];

        //se imprime matriz y se guardan los datos
        System.out.printf("%-15s %15s %15s %15s", "Producto", "Precio", "Stock minimo", "Stock actual");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                //se genera el precio
                array[i][0] = (int) (Math.random() * (50000 - 2000) + 2000);
                //se genera el stock minimo
                array[i][1] = (int) (Math.random() * (100 - 1) + 1);
                //se genera el stock actual
                array[i][2] = (int) (Math.random() * (500 - 1) + 1);
            }
        }
        System.out.println();
        //se imprime el arreglo
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%-15s", (i + 1));
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf("%15s", array[i][j]);
            }
            System.out.println();
        }
        do {
            System.out.println("indique el producto que desea comprar");
            producto = tec.nextInt();
            //para que se adecue al arreglo y seleccione empezando del 1
            producto = (producto - 1);
            if (producto < array.length) {
                System.out.println("indique la cantidad");
                cantPro = tec.nextInt();
                for (int i = 0; i < array.length; i++) {
                    if (producto == i) {
                        array[i][2] -= cantPro;
                        valorproducto = cantPro * array[i][0];
                    }
                }
            }
            System.out.println("¿desea seguir comprando?");
            resp = tec.next();
        } while (resp.equalsIgnoreCase("si"));

        //imprimiendo arreglo pero con stock actual reducido
        System.out.println("\nCon stock reducido: ");
        System.out.printf("%-15s %15s %15s %15s", "Producto", "Precio", "Stock minimo", "Stock actual");
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%-15s", (i + 1));
            //calcular valor inventario
            valinv += array[i][0] * array[i][2];
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf("%15s", array[i][j]);
            }
            System.out.println();
        }
        //muestra valor inventario
        System.out.println("valor inventario = $" + valinv);

        //imprime listado que estan bajo stock
        System.out.println("\nBajo stock:");
        System.out.printf("%-15s %15s %15s %15s", "Producto", "Precio", "Stock minimo", "Stock actual");
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i][2] < array[i][1]) {
                System.out.printf("%-15s", (i + 1));
                for (int j = 0; j < array[0].length; j++) {
                    System.out.printf("%15s", array[i][j]);
                }
                System.out.println();
            }
        }

    }
}
