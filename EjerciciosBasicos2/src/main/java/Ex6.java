public class Ex6 {
    public static void main(String[] args) {
        System.out.println("los numeros divisibles entre 2 y 3 son:");
        for (int i = 1; i <= 100 ; i++) {
            if (i % 3 == 0){
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }

        }
    }
}
