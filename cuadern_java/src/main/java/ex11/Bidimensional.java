package ex11;

public class Bidimensional {
    public static void main(String[] args) {
        String[][] agenda = new String[6][23];
        agenda[1][14] = "Ir de compras";
        agenda[3][10] = "Hacer la comida";
        agenda[4][1] = "Ir a buscar los niños al cole";
        agenda[5][4] = "Jugar a la play";
        agenda[0][9] = "Buscar libro para leer";

        int contador = 0;
        System.out.println("Esta semana tienes los siguientes planes:");

        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 23; j++) {

                if (agenda[i][j] != null) {
                    System.out.println(agenda[i][j] + " el dia " + i + " a las " + j + " horas");
                } else {
                    contador++;


                }
            }
        }
        if (contador == 138) {
            System.out.println("no tienes planes esta semana");

        }else {
            System.out.println("El resto de horas no tienes planes");
        }
    }
}
