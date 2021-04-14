package ex12;

public class Fibonacci {

    static int fibonacci(int n)
    {
        if (n>1){
            return fibonacci(n-1) + fibonacci(n-2);
        }
        else if (n==1) {
            return 1;
        }
        else if (n==0){
            return 0;
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args) {


        int contador = 0;

        while (contador < 51) {

            System.out.print(fibonacci(contador)+" ");

            contador++;
        }
    }
}
