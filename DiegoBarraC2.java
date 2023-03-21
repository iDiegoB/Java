import java.util.Scanner;

public class DiegoBarraC2 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        String tipoPersona;
        int contFuncionarioBajoPeso=0,contFuncionarioPesoNormal=0,contFuncionarioSobrePeso=0,contFuncionarioObesidad=0;
        int contAlumnoBajoPeso=0,contAlumnoPesoNormal=0,contAlumnoSobrePeso=0,contAlumnoObesidad=0;
        double IMC=0;
        String encuesta;
        do {
            System.out.println("¿realizara la encuesta?\nsi o no");
            encuesta = tec.next();
            if (encuesta.equalsIgnoreCase("si")) {
                System.out.println("ingrese si es:\nFuncionario\nAlumno");
                tipoPersona = tec.next();
                if (tipoPersona.equalsIgnoreCase("funcionario")) {
                    System.out.println("indique IMC");
                    IMC = tec.nextDouble();
                    if (IMC < 18.5) {
                        System.out.println("Bajo peso");
                        contFuncionarioBajoPeso++;
                    } else {
                        if (IMC >= 18.5 && IMC <= 24.9) {
                            System.out.println("Peso normal");
                            contFuncionarioPesoNormal++;
                        } else {
                            if (IMC >= 25.0 && IMC <= 29.9) {
                                System.out.println("Sobrepeso");
                                contFuncionarioSobrePeso++;
                            } else {
                                if (IMC > 30) {
                                    System.out.println("Obesidad");
                                    contFuncionarioObesidad++;
                                }
                            }
                        }
                    }
                } else {
                    if (tipoPersona.equalsIgnoreCase("alumno")) {
                        System.out.println("indique IMC");
                        IMC = tec.nextDouble();
                        if (IMC < 18.5) {
                            System.out.println("Bajo peso");
                            contAlumnoBajoPeso++;
                        } else {
                            if (IMC >= 18.5 && IMC <= 24.9) {
                                System.out.println("Peso normal");
                                contAlumnoPesoNormal++;
                            } else {
                                if (IMC >= 25.0 && IMC <= 29.9) {
                                    System.out.println("Sobrepeso");
                                    contAlumnoSobrePeso++;
                                } else {
                                    if (IMC > 30) {
                                        System.out.println("Obesidad");
                                        contAlumnoObesidad++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }while (encuesta.equalsIgnoreCase("si"));//La variable double, en el teclado es necesario usar una coma en vez de un punto//
        System.out.println("Rangos IMC      Estado Nutricional      Cantidad de Alumnos     Cantidad de Funcionarios");
        System.out.println("Menos de 18.5       Bajo peso                    "+ contAlumnoBajoPeso+"                         "+contFuncionarioBajoPeso);
        System.out.println("18.5 - 24.9         Peso normal                  "+ contAlumnoPesoNormal+"                         "+contFuncionarioPesoNormal);
        System.out.println("25.0 - 29.9         Sobre peso                   "+ contAlumnoSobrePeso+"                         "+contFuncionarioSobrePeso);
        System.out.println("Más de 30.0         Obesidad                     "+ contAlumnoObesidad+"                         "+contFuncionarioObesidad);
    }
}
