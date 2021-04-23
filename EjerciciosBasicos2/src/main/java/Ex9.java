import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {

        String password = "hola";
        int intentos = 3;


        while (intentos > 0) {
            System.out.println("Pon la contraseña");
            Scanner entrada = new Scanner(System.in);
            String intento = entrada.nextLine();

            if (intento.equals(password)) {
                System.out.println("Enhorabuena");
                break;
            } else {
                intentos = intentos - 1;
                System.out.println("Error te quedan " + intentos + " intentos");

            }

        }


    }
}
