import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Pon el radio");

        int radio = entrada.nextInt();
        double area = (Math.PI * Math.pow(radio, 2));

        System.out.println( "La area es " + area);


    }
}
