package ex13;

import java.util.Scanner;

public class Elevado {

    static boolean validar(double num) {
        if (num > 0 && (num % 1) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println("Pon un numero entero y positivo");
        Scanner entrada = new Scanner(System.in);
        double num1 = entrada.nextDouble();

        System.out.println("Pon un numero entero y positivo");
        Scanner entrada2 = new Scanner(System.in);
        double num2 = entrada.nextDouble();

        if (validar(num1) && validar(num2)) {
            double resultat = 1;
            for (int i = 0; i < num2; i++) {
                resultat = resultat * num1;
            }
            System.out.println(resultat);
            System.out.println(Math.pow(2, 6));
        }
    }
}
