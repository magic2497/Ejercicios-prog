package ex5;


public class Aleatorio {
    static int num1;
    static int num2;


    public static void main(String[] args) {
        num1 = (int) Math.floor(Math.random() * 100);
        num2 = (int) Math.floor(Math.random() * 100);
        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }


    }
}
