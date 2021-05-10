package ex22;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NumPrimo {
    public static void main(String[] args) {
        Integer[] primos;

        primos = divisoresPrimos(10);
        for (Integer num : primos) {
            System.out.println(num + " ");
        }
    }


    public static Integer[] divisoresPrimos(int n) {
        Integer[] array;
        ArrayList<Integer> primos = new ArrayList<Integer>();

        for (int i = 1; i <= n; i++) {
            if(esPrimo(i))
                primos.add(new Integer(i));
        }

        array = new Integer[primos.size()];
        return primos.toArray(array);
    }


    public static boolean esPrimo(int n) {
        int cont = 2;
        boolean primo = true;

        while ((primo) && (cont != n)) {
            if (n % cont == 0)
                primo = false;
            cont++;
        }

        return primo;
    }
}
