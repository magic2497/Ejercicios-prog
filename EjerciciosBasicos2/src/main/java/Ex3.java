import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        System.out.println("Pon el precio del producto");
        Scanner entrada = new Scanner(System.in);
        double precio = entrada.nextDouble();
        double iva = (21.0 * precio) /100;
        System.out.println("El precio con iva incluido es "+ (precio + iva));
    }
}
