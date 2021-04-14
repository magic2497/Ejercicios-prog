import java.util.Scanner;

class Ex1 {

    public static void main(String[] args) {

        System.out.println("Pon un el numero que quieres convertir");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();

        System.out.println((char) numero);
    }
}
