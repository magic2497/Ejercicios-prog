package ex16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Valores {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 5 ; i++) {

            System.out.println("pon un numero");
            Scanner entrada = new Scanner(System.in);
            int num = entrada.nextInt();
            lista.add(num);
        }
        System.out.println("El valor mas alto de esta lista es "+Collections.max(lista));
        System.out.println("El valor mas pequeño de esta lista es "+Collections.min(lista));
    }
}
