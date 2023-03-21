import java.util.Scanner;

public class contr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] encuestas = new int[3][3];
        System.out.println("Ingrese los datos de los encuestados");
        matriz(encuestas, sc);
        int menu = 1;
        do {
            //Menu
            System.out.println("Ingrese la opcion del menu");
            System.out.println("1:Porcentaje de ICINF (tengan o no trabajo)");
            System.out.println("2:Porcentaje de ICO (tengan o no trabajo)");
            System.out.println("3:Porcentaje de IECI que trabaja");
            System.out.println("4:Porcentaje de CPA que trabaja");
            System.out.println("5:El sueldo promedio de ICINF que trabaja");
            System.out.println("6:Salir");
            menu = sc.nextInt();
            switch (menu) {
                case 1://1:Porcentaje de ICINF (tengan o no trabajo)
                    System.out.println("El porcentaje de quienes trabajan en ICINF es" + porcentajeProfesion(encuestas, 1, 0));
                    break;
                case 2://2:Porcentaje de ICO (tengan o no trabajo)
                    System.out.println("El porcentaje de quienes trabajan en ICO es" + porcentajeProfesion(encuestas, 2, 0));
                    break;
                case 3://3:Porcentaje de IECI que trabaja
                    System.out.println("El porcentaje de quienes trabajan en IECI es" + porcentajeProfesion(encuestas, 4, 1));
                    break;
                case 4://4:Porcentaje de CPA que trabaja
                    System.out.println("El porcentaje de quienes trabajan en CPA es" + porcentajeProfesion(encuestas, 3, 1));
                    break;
                case 5://5:El sueldo promedio de ICINF que trabaja
                    double result = sueldoPromedioTrabajador(encuestas);
                    if (result == 0) {
                        System.out.println("No hay un encuestado de ICINF que este trabajando");
                    } else {
                        System.out.println("El promedio es: " + result);
                    }
                    break;
                case 6:
                    break;
            }
        } while (menu != 6);
        imprimir (encuestas);
    }
        static void matriz (int[][] encuestas, Scanner sc){
            for (int i = 0; i < encuestas.length; i++) {
                do {
                    System.out.println("Por favor indique su profesion(1=ICINF, 2=ICO, 3=CPA, 4=IECI)");
                    encuestas[i][0] = sc.nextInt();
                }while (encuestas[i][0]>4 || encuestas[i][0]<1);
                System.out.println("Ingrese si esta trabajando o no (1=si, 2=no)");
                encuestas[i][1] = sc.nextInt();
                if (encuestas[i][1] == 1) {
                    encuestas[i][2] = (int) (Math.random() * (600000 - 2000000 + 1) + 2000000);
                    System.out.println("sueldo= " + encuestas[i][2]);
                } else {
                    if (encuestas[i][1] == 2) {
                        System.out.println("sueldo= 0");
                    } else {
                        System.out.println("ingrese numero valido");
                    }
                }
            }
            }
                static double porcentajeProfesion ( int encuestas[][], int asignatura, int trabajo){
                    double porcent;
                    int cont = 0;
                    for (int i = 0; i < encuestas.length; i++) {
                        if (encuestas[i][0] == asignatura && trabajo == 0) {
                            cont++;
                        } else {
                            if (encuestas[i][0] == asignatura && trabajo == 1 && encuestas[i][1] == 1) {
                                cont++;
                            }
                        }
                    }
                    porcent=(double)cont*100/encuestas.length;
                    return(porcent);
                }
                    static double sueldoPromedioTrabajador ( int encuestas[][]){
                        double promedio = 0;
                        int sueldo = 0, contra = 0;
                        for (int i = 0; i < encuestas.length; i++) {
                            if (encuestas[i][0] == 1) {
                                if (encuestas[i][1] == 1) {
                                    contra++;
                                    sueldo += encuestas[i][2];
                                }
                            }
                        }
                        if (contra == 0) {
                            return (0);
                        } else {
                            promedio = (double) sueldo / contra;
                            return (promedio);
                        }
                    }

                        static void imprimir ( int encuestas[][]){
                            for (int i = 0; i < encuestas.length; i++) {
                                for (int j = 0; j < encuestas[0].length; j++) {
                                    System.out.print(encuestas[i][j]+ "  ");
                                }
                                System.out.println("");
                            }
                        }
    }