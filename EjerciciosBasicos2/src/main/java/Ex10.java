import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        System.out.println("Pon un dia de la semana");
        Scanner entrada = new Scanner(System.in);
        String dia = entrada.nextLine();
        switch (dia) {
            case "lunes":
                System.out.println(dia + " es laborable");
                break;
            case "martes":
                System.out.println(dia + " es laborable");
                break;
            case "miercoles":
                System.out.println(dia + " es laborable");
                break;
            case "jueves":
                System.out.println(dia + " es laborable");
                break;
            case "viernes":
                System.out.println(dia + " es laborable");
                break;
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
