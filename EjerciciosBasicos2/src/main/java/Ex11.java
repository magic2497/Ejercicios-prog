import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        System.out.println("Pon un numero");
        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();

        System.out.println("Pon un numero");
        Scanner entrada2 = new Scanner(System.in);
        int num2 = entrada2.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println( Math.floor(Math.random()*(num2-num1+1)+num1));
        }

    }
}
