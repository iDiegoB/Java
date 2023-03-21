public class Arreglos {
    public static void main (String[] args) {

        int[] enteros = {2,3,4,6,8,9,10,12,14,15,16,18,20,22};
        int suma=0;

        System.out.print("\nLos números son: ");
        for (int i=0; i<enteros.length-1; i++) {
            System.out.print(enteros[i] + ", ");
        }
        System.out.print(enteros[enteros.length-1]);

        for (int i=0; i<enteros.length; i+=2) {
            suma += enteros[i];
        }
        System.out.println("\nLa suma es: " + suma);
    }
}
