import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        System.out.println("Pon un dia de la semana");
        Scanner entrada = new Scanner(System.in);
        String dia = entrada.nextLine();
        switch (dia) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
            case "sabado":
                System.out.println(dia + " es laborable");
                break;
            case "domingo":
                System.out.println(dia + " no es laborable");
                break;
            default:
                System.out.println("Eso no es un dia");
        }
    }
}
