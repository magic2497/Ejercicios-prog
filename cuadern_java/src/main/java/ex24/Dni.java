package ex24;

public class Dni {

    public static void main(String[] args) {
        System.out.println(validar("43470872K"));
        System.out.println(validar("34626954I"));
    }
    private static final String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

    public static boolean validar(String dni) {
        return comprobarFormato(dni) && comprobarLetra(dni);
    }


    private static boolean comprobarFormato(String dni) {
        boolean valido = true;

        valido = (dni.length() == 9);

        if(valido) {
            char c = dni.charAt(dni.length()-1);
            valido = Character.isLetter(c);
        }

        if(valido) {
            int i = 0;
            while(valido && i<dni.length()-2) {
                char n = dni.charAt(i);
                valido = Character.isDigit(n);
                i++;
            }
        }

        return valido;
    }



    private static boolean comprobarLetra(String dni) {
        char letra = dni.charAt(dni.length()-1);
        int num = Integer.valueOf(dni.substring(0, dni.length()-1));

        return letras.charAt(num % 23) == letra;
    }
}
