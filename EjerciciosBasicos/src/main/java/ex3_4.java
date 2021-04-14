import java.util.Scanner;

public class ex3_4 {
    //Version 1
    /* static String nom ="Magi" ;


    public static void main(String[] args) {
            System.out.println("Bienvenido " + nom );





    }*/


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Pon tu nombre");
        String nom = entrada.nextLine();

        System.out.println("Bienvenido " + nom);


    }
}
