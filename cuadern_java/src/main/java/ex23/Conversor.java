package ex23;

public class Conversor {
    public static void main(String[] args) {
        System.out.println("100 grados Fahrenheit a Celsius son " + calcularCelsius(50.0));

    }





    public static double calcularCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
