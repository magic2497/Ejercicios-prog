package ex20;

public class Maximo {
    public static void main(String[] args) {
        System.out.println(" El maxim de els dos numeros que hem introduit es "+ maximo2(10, 30));
        System.out.println( " El maxim de els tres numeros que hem introduit es "+maximo3(10, 20, 30));

    }

    public static int maximo2(int x, int y) {
        int major;
        if(x>y){
            major = x;
        }else {
            major = y;
        }
        return major;
    }



    public static int maximo3(int x, int y, int z) {
        return maximo2(maximo2(x, y), z);
    }
}
