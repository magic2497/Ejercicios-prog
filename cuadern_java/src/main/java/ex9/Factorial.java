package ex9;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {


        System.out.println("Pon un numero");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        int factorial = 1;

        while ( numero!=0) {
            factorial=factorial*numero;
            numero--;

        }
        System.out.println(factorial);
    }
}
