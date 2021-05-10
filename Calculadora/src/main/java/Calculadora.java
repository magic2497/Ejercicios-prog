import java.util.Scanner;

public class Calculadora {


    public static void main(String[] args) {
        Service service = new Service();
        Integer contador = 1;
                String operacion = "";
                String decision = "";
                while (contador < 2) {

                    while (contador < 2) {
                        System.out.println("***********************************************************************");
                        System.out.println("**********Bienvenido a la calculadora mas puntera del mercado**********");
                        System.out.println("*********Introduce el nombre de la accion que quieres realizar*********");
                        System.out.println("***********************************************************************");
                        System.out.println("                             1-sumar                                   ");
                        System.out.println("                             2-restar                                  ");
                        System.out.println("                             3-multiplicar                             ");
                        System.out.println("                             4-dividir                                 ");
                        System.out.println("                             5-resto                                   ");
                        System.out.println("                             6-apagar                                  ");
                        System.out.println("***********************************************************************");
                        System.out.println("***********************************************************************");
                        System.out.println(" ");

                        Scanner entrada = new Scanner(System.in);
                        operacion = entrada.nextLine();
                        if (service.validarOperacion(operacion)) {
                    System.out.println("*********************Has elegido la accion " + operacion + "**********************");
                    System.out.println(" ");

                    break;

                } else {
                    System.out.println("**********Error operacion no existente vuelve a escribir**************");
                    System.out.println(" ");
                }

            }
            if (operacion.equals("apagar")) {
                System.out.println("**************************Hasta la proxima*****************************");
                break;
            }
            System.out.println("***********************************************************************");
            System.out.println("************************Pon el primer numero***************************");
            System.out.println("***********************************************************************");
            System.out.println(" ");
            Scanner entrada2 = new Scanner(System.in);
            Double num1 = entrada2.nextDouble();
            System.out.println("***********************************************************************");
            System.out.println("**************************Pon el segundo numero**************+*********");
            System.out.println("***********************************************************************");
            System.out.println(" ");
            Scanner entrada3 = new Scanner(System.in);
            Double num2 = entrada3.nextDouble();
            System.out.println("***********************************************************************");
            System.out.println("*****************El resultado de la operacion es " + service.operaciones(num1, num2, operacion)+"******************");
            System.out.println("***********************************************************************");
            System.out.println(" ");

            while (contador < 2) {
                System.out.println("***********************************************************************");
                System.out.println("***************Quieres volver a utilizar la calculadora?***************");
                System.out.println("***********************************************************************");
                System.out.println(" ");
                Scanner entrada4 = new Scanner(System.in);
                 decision = entrada4.nextLine();
                if (decision.equals("si")) {
                    break;
                } else if (decision.equals("no")) {
                    System.out.println("***********************************************************************");
                    System.out.println("**************************Hasta la proxima*****************************");
                    System.out.println("***********************************************************************");
                    System.out.println(" ");
                    break;
                } else {
                    System.out.println("***********************************************************************");
                    System.out.println("***********************Error vuelve a escribir*************************");
                    System.out.println("***********************************************************************");
                    System.out.println(" ");
                }
            }
            if (decision.equals("no")){
                break;
            }
        }
    }

}
