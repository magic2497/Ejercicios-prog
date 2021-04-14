package ex6;

import java.util.Scanner;

public class Peso2 {
    public static void main(String[] args) {
        System.out.println("Pon tu peso en kilogramos");
        Scanner entrada = new Scanner(System.in);
        int peso = entrada.nextInt();

        System.out.println("Pon tu altura en centimetros");
        Scanner entrada2 = new Scanner(System.in);
        int altura = entrada2.nextInt();

        double alturaConvertida = (double) altura / 100;
        double ims = peso / Math.pow(alturaConvertida, 2);
        if(ims <= 16){
            System.out.println("| "+ims+" | Diagnóstico | |Criterio de ingreso en hospital|");
        }
        else if (ims  >= 16 && ims<= 17){
            System.out.println("| "+ims+" | Diagnóstico | |Infrapeso|");

        }
        else if (ims  >= 17 && ims<= 18){
            System.out.println("| "+ims+" | Diagnóstico | |Bajo peso|");

        }
        else if (ims  >= 18 && ims<= 25){
            System.out.println("| "+ims+" | Diagnóstico | |Peso normal (saludable)|");

        }
        else if (ims  >= 25 && ims<= 30){
            System.out.println("| "+ims+" | Diagnóstico | |Sobrepeso|");

        }
        else if (ims  >= 30 && ims<= 35){
            System.out.println("| "+ims+" | Diagnóstico | |Sobrepeso crónico|");

        }
        else if (ims  >= 35 && ims<= 40){
            System.out.println("| "+ims+" | Diagnóstico | |Obesidad premórbida|");

        }
        else if ( ims <= 40){
            System.out.println("| "+ims+" | Diagnóstico | |Obesidad mórbida|");

        }


    }
}
