package ex21;

public class Primo {
    public static void main(String[] args) {
        if(es_primo(4)){

            System.out.println("El numero introducido es primo");
        }else{
            System.out.println("El numero introducido no es primo");
        }

    }
    public static boolean es_primo(int n) {
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


