import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        System.out.println("Cuantos productos has vendido?");
        Scanner entrada = new Scanner(System.in);
        double productos = entrada.nextDouble();
        int contador = 0;
        double valorTotal = 0;

        while (contador < productos) {
            System.out.println("Pon el precio del producto correspondiente");
            Scanner entrada2 = new Scanner(System.in);
            double precio = entrada2.nextDouble();

            valorTotal = valorTotal + precio;

            contador++;

            if (contador == productos) {
                System.out.println(valorTotal);
            }
        }
    }
}
