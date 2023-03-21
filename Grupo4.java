public class Grupo4{
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);

        int planetas[] = new int [7];
        int planetas2[] = (1, 2, 3, 4, 5, 6, 7);
        String paltas[] = new String [5];
        String paltas2[] = {"hass", "con pelo", "mexicola", "fuerte", "Edranol"};
        double sueldo[] = new double [3];
        double sueldo2[] =(22500.4, 45000.35, 50000.55 );
        char caracter[] = new char [2];
        char caracter2[] = a="ñ",b="b",c="i";

        System.out.println("Imprimiendo ascendente");
        for (int i = 0; i < planetas.length; i++){
            System.out.print(planetas[i] + " ");
        }

        System.out.println("");

        System.out.println("Imprimiendo ascendente");
        for (int i = planetas2.length-1; i>=0;  i--){
            System.out.print(planetas2[i] + " ");
        }

        System.out.println("");



    }
}