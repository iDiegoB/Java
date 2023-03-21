import java.util.Scanner;
public class ejercicio_01 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int num1=4, num2=6;
        Valores(num1, num2);
    }
    static void Valores(int x1, int x2) {
        int suma;
        suma = x1 + x2;
        System.out.println("El resultado de la suma es: " + suma);
    }
}
