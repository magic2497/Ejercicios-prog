import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        int num2;
        do {
            System.out.println("Pon un numero positivo");
            Scanner entrada = new Scanner(System.in);
            num2 = entrada.nextInt();

        } while (num2 <= 0);
        System.out.println("tu numero es "+num2);

    }
}
