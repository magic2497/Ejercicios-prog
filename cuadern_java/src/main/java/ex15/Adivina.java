package ex15;

import java.util.Scanner;

public class Adivina {
    public static void main(String[] args) {

        int numero = (int) (100 * Math.random() + 1);
        int vidas = 5;
        while (vidas >= 0) {

            System.out.println("Adivina el numero");
            Scanner entrada = new Scanner(System.in);
            int num = entrada.nextInt();
            if ( num == numero) {
                vidas = vidas - 5;
                System.out.println("numero correcto");
            }else{
                System.out.println("numero incorrecto");
                vidas--;
            }
        }


    }
}
