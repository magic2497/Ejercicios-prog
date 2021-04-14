package ex10;

public class Conversor {
    public static void main(String[] args) {
        double C;

        for (int i = 0; i <= 300; i++) {

            if (i%20 == 0) {
                C = (5.0 / 9.0) * (i - 32.0);

                System.out.println(i+" grados farenheit son: "+ C +" grados celsius");
            }


        }

    }
}
