package ex14;

import java.util.Scanner;

public class BucleFactorial {

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
        double num = entrada.nextDouble();

        double factorial = 1;

        if (validar(num)) {


            while (num != 0) {
                factorial = factorial * num;
                num--;


            }
            System.out.println("El factorial del numero seleccionado es "+factorial);
        } else {
            System.out.println("Error numero no permitido");
        }


    }
}
