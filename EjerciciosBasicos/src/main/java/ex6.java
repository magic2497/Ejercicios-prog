import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Pon un numero");

        int divisor = entrada.nextInt();
        if (divisor%2 == 0){
            System.out.println( "Se puede dividir entre 2");
        }
        else{
            System.out.println( "No se puede dividir entre 2");
        }




    }
}
