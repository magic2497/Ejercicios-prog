import java.util.Scanner;

public class metodos {
    public static void main(String[] args) {
        int contador = 3;
        while (contador > 0) {
            System.out.println("***********************************************************************");
            System.out.println("**********************Bienvenido al menu de metodos********************");
            System.out.println("*********Introduce el numero del metodo que quieres realizar***********");
            System.out.println("***********************************************************************");
            System.out.println("                             1-Array                                   ");
            System.out.println("                             2-Array inverso                           ");
            System.out.println("                             3-Medias                                  ");
            System.out.println("                             4-Caracteres                              ");
            System.out.println("                             5-String invertida                        ");
            System.out.println("                             6-String sin espacios en blanco           ");
            System.out.println("                             7-Concatenacion                           ");
            System.out.println("                             8-Vocales                                 ");
            System.out.println("                             9-Ascii                                   ");
            System.out.println("                             10-Apagar                                 ");
            System.out.println("***********************************************************************");
            System.out.println("***********************************************************************");
            System.out.println(" ");

            Scanner entrada = new Scanner(System.in);
            int operacion = entrada.nextInt();
            entrada.nextLine();


            switch (operacion) {
                case 1:
                    metodoArray();
                    break;
                case 2:
                    metodoArrayInvertido();
                    break;
                case 3:
                    metodoMedias();
                    break;
                case 4:
                    System.out.println("Pon una palabra");
                    Scanner entrada2 = new Scanner(System.in);
                    String palabra = entrada2.nextLine();
                    metodoEspacios(palabra);

                    break;
                case 5:
                    System.out.println("Pon una palabra");
                    Scanner entrada3 = new Scanner(System.in);
                    String palabraInversa = entrada3.nextLine();
                    metodoPalabraInverssa(palabraInversa);
                    break;
                case 6:
                    System.out.println("Pon una palabra");
                    Scanner entrada4 = new Scanner(System.in);
                    String palabraEspacios = entrada4.nextLine();
                    metodoEspacios2(palabraEspacios);
                    break;
                case 7:
                    System.out.println("Pon una palabra");
                    Scanner entrada5 = new Scanner(System.in);
                    String palabra1 = entrada5.nextLine();


                    System.out.println("Pon una palabra");
                    Scanner entrada6 = new Scanner(System.in);
                    String palabra2 = entrada6.nextLine();
                    metodoConcatenar(palabra1, palabra2);


                case 8:
                    System.out.println("Pon una palabra");
                    Scanner entrada7 = new Scanner(System.in);
                    String palabra7 = entrada7.nextLine();

                    System.out.println("Pon una vocal");
                    Scanner entrada8 = new Scanner(System.in);
                    char letra = entrada8.next().charAt(0);

                    metodoVocales(palabra7, letra);
                    break;
                case 9:
                    System.out.println("Pon una palabra");
                    Scanner entrada9 = new Scanner(System.in);
                    String palabra9 = entrada9.nextLine();
                    metodoAscii(palabra9);
                    break;
                case 10:
                    System.out.println("Apagando");
                    break;
                default:
                    System.out.println("Este metodo no existe");
                    break;
            }
            if (operacion == 10){
                break;
            }
        }
    }
    public static void metodoArray() {


        String lista[];
        lista = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("pon un numero");

            Scanner entrada = new Scanner(System.in);
            String listas = entrada.nextLine();

            lista[i] = listas;
        }

        for (int i = 0; i < 5; i++) {

            System.out.println(lista[i]);
        }


    }


    public static void metodoArrayInvertido() {
        String lista[];
        lista = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("pon un numero");

            Scanner entrada = new Scanner(System.in);
            String listas = entrada.nextLine();

            lista[i] = listas;
        }

        for (int i = lista.length - 1; i >= 0; i--) {

            System.out.println(lista[i] + " ");
        }


    }

    public static void metodoMedias() {
        double sumPositivos = 0;
        double sumNegativos = 0;
        double contadorPositivos = 0;
        double contadorNegativos = 0;
        double contarCeros = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("pon un numero");

            Scanner entrada = new Scanner(System.in);
            double numero = entrada.nextDouble();

            if (numero > 0) {
                sumPositivos = sumPositivos + numero;
                contadorPositivos++;
            } else if (numero == 0) {
                contarCeros++;
            } else {
                sumNegativos = sumNegativos + numero;
                contadorNegativos++;
            }

        }

        double mediaPositivos = sumPositivos / contadorPositivos;
        double mediaNegativos = sumNegativos / contadorNegativos;

        System.out.println("La media de numeros positivos es " + mediaPositivos);
        System.out.println("La media de numeros negativos es " + mediaNegativos);
        System.out.println("Has puesto " + contarCeros + " ceros");
    }

    public static int metodoEspacios(String palabra) {
        String palabra2 = palabra.replace(" ", "");
        int numero = palabra2.length();
        System.out.println("la palabra tiene " + numero + " letras");

        return numero;
    }

    public static StringBuilder metodoPalabraInverssa(String palabraInversa) {
        StringBuilder palabra1 = new StringBuilder();
        palabra1.append(palabraInversa);
        palabra1.reverse();
        System.out.println(palabra1);
        return palabra1;
    }

    public static String metodoEspacios2(String palabraEspacios) {
        String palabra2 = palabraEspacios.replace(" ", "");

        System.out.println(palabra2);

        return palabra2;
    }

    public static String metodoConcatenar(String palabra1, String palabra2) {
        String cadenaJunta = palabra1 + palabra2;
        System.out.println(cadenaJunta);

        return cadenaJunta;
    }

    public static String metodoVocales(String palabra1, char letra) {
        String palabra2 = palabra1.replace('a', letra);
        palabra2 = palabra1.replace('e', letra);
        palabra2 = palabra1.replace('i', letra);
        palabra2 = palabra1.replace('o', letra);
        palabra2 = palabra1.replace('u', letra);
        System.out.println(palabra2);

        return palabra2;
    }

    public static void metodoAscii(String palabra9) {
        int letra = 0;
        for (int i = 0; i <palabra9.length() ; i++) {


            letra = palabra9.codePointAt(i);
            System.out.println(letra);
        }

    }

}


