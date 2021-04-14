package ex3;

public class Radi {
    static int radi = 3;

    public static void main(String[] args) {

        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radi,3) ;
        double superficie = 4 * Math.PI * Math.pow(radi, 2) ;

        System.out.println(volumen);
        System.out.println(superficie);
    }
}
