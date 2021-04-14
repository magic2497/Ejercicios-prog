package ex4;

import java.util.Scanner;

public class Peso {
    public static void main(String[] args) {
        System.out.println("Pon tu peso en kilogramos");
        Scanner entrada = new Scanner(System.in);
        int peso = entrada.nextInt();

        System.out.println("Pon tu altura en centimetros");
        Scanner entrada2 = new Scanner(System.in);
        int altura = entrada2.nextInt();

        double alturaConvertida = (double) altura / 100;
        double ims = peso / Math.pow(alturaConvertida, 2);

        System.out.println("Tu Indice de Masa Corporal es " + ims);
    }
}
