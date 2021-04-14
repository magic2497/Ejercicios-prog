import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        System.out.println("Pon un numero");
        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();
        if (num1 >= 0) {
            //lo que esta haciendo la aplicacion es pasar el integera string y luego cuenta el numero de caracteres que tiene
            System.out.println("El número " + num1 + " tiene " + Integer.toString(num1).length() + " dígitos");
        }else {
            System.out.println("error el numero tiene que ser positivo");
        }
    }
}
