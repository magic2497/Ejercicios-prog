package ex7;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        System.out.println("Pon el tipo de operacion que quieres hacer");
        Scanner entrada = new Scanner(System.in);
        String operacion = entrada.nextLine();

        System.out.println("Pon el primer numero");
        Scanner entrada2 = new Scanner(System.in);
        int num1 = entrada2.nextInt();

        System.out.println("Pon el segundo numero");
        Scanner entrada3 = new Scanner(System.in);
        int num2 = entrada3.nextInt();


        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacio = num1 * num2;
        int divisio = num1 / num2;


        if (operacion.equals("S") || operacion.equals("s")) {
            System.out.println("El resultado de la suma es " + suma);
        } else if (operacion.equals("R") || operacion.equals("r")) {
            System.out.println("El resultado de la resta es " + resta);
        } else if (operacion.equals("M") || operacion.equals("m")) {
            System.out.println("El resultado de la multiplicacion es " + multiplicacio);
        } else if (operacion.equals("D") || operacion.equals("d")) {
            System.out.println("El resultado de la division es " + divisio);
        }


    }

}
