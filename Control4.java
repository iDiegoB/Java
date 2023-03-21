import java.util.Scanner;
public class Control4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int respcase1, salariocase1 = 0, sumasalariocase1 = 0, respcase3=0;
        int trabajo2 = 0, respcase2, salariocase2 = 0, sumasalariocase2 = 0, sumasalariocase3 = 0;
        int trabajo3 = 0, salariocase3 = 0;
        int trabajo4 = 0, respcase4 = 0, salariocase4 = 0;
        int sueldo[] = new int[20];
        int trabajo[] = new int[20];
        int profesion[] = new int[20];
        int arreglo[][] = new int[20][3];
        int salario[] = new int [20];
        for (int i = 0; i < profesion.length; i++) {
            System.out.println("Ingrese los datos de su profesión");
            System.out.println("1: ICINF, 2: ICO, 3: CPA,  4: IECI ");
            profesion[i] = teclado.nextInt();
            switch (profesion[i]) {
                case 1:
                    if (profesion[i] == 1) {
                        System.out.println("¿Se encuentra trabajando?");
                        System.out.println("1= Si,  2= No");
                        respcase1 = teclado.nextInt();
                        trabajo[i] = respcase1;
                        if (respcase1 > 2 || respcase1 < 1) {
                            System.out.println("El numero ingresado es erroneo, ingrese valor 1 o 2");
                        } else {
                            if (respcase1 == 1) {
                                salariocase1 = (int) (Math.random() * (600000 - 2000000 + 1) + 2000000);
                                System.out.println("Su salario asignado es: " + salariocase1);
                                sumasalariocase1 = sumasalariocase1 + salariocase1;
                                sueldo[i] = salariocase1;
                            } else {
                                if (respcase1 == 2) {
                                    System.out.println("Su sueldo asignado es 0");
                                    salariocase1 = 0;
                                }
                            }
                        }
                    }
                    break;
                case 2:
                    if (profesion[i] == 2) {
                        System.out.println("¿Se encuentra trabajando?");
                        System.out.println("1= Si, 2= No");
                        respcase2 = teclado.nextInt();
                        trabajo[i] = respcase2;
                        if (respcase2 > 2 || respcase2 < 1) {
                            System.out.println("El numero ingresado es erroneo, ingrese valor 1 o 2");
                        } else {
                            if (respcase2 == 1) {
                                salariocase2 = (int) (Math.random() * (600000 - 2000000 + 1) + 2000000);
                                System.out.println("Su salario asignado es: " + salariocase2);
                                sumasalariocase2 = sumasalariocase2 + salariocase2;
                                sueldo[i] = salariocase2;
                            } else {
                                if (respcase2 == 2) {
                                    System.out.println("Su sueldo asignado es 0");
                                    salariocase2 = 0;
                                }
                            }
                        }
                    }
                    break;
                case 3:
                    if (profesion[i] == 3) {
                        System.out.println("¿Se encuentra trabajando?");
                        System.out.println("1= Si, 2= No");
                        respcase3 = teclado.nextInt();
                        trabajo[i] = respcase3;
                    }
                    if (respcase3 > 2 || respcase3 < 1) {
                        System.out.println("El numero ingresado es erroneo, ingrese valor 1 o 2");
                    } else {
                        if (respcase3 == 1) {
                            salariocase3 = (int) (Math.random() * (600000 - 2000000 + 1) + 2000000);
                            System.out.println("Su salario asignado es: " + salariocase3);
                            sumasalariocase3 = sumasalariocase3 + salariocase3;
                            sueldo[i] = salariocase3;
                        } else {
                            if (respcase3 == 2) {
                                System.out.println("Su sueldo asignado es 0");
                                salariocase3 = 0;

                            }
                        }
                    }
                case 4:
                    if (profesion[i] == 4) {
                        System.out.println("¿Se encuentra trabajando?");
                        System.out.println("1= Si, 2= No");
                        respcase4 = teclado.nextInt();
                        trabajo[i] = respcase4;
                    }
                    if (respcase4 > 2 || respcase4 < 1) {
                        System.out.println("El numero ingresado es erroneo, ingrese valor 1 o 2");
                    } else {
                        if (respcase4 == 1) {
                            salariocase4 = (int) (Math.random() * (600000 - 2000000 + 1) + 2000000);
                            System.out.println("Su salario asignado es: " + salariocase4);
                            int sumasalariocase4 = 0;
                            sumasalariocase4= sumasalariocase4 + salariocase4;
                            sueldo[i] = salariocase4;
                        } else {
                            if (respcase4 == 2) {
                                System.out.println("Su sueldo asignado es 0");
                                salariocase4 = 0;
                            }
                        }
                    }
            }
        }
        for (int i = 0; i < profesion.length; i++) {
            System.out.print(profesion[i]+ " ");
            System.out.print(trabajo[i]+" ");
            System.out.print(sueldo[i]+" ");
            System.out.println("");
        }
    }
}