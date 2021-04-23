/*
package ex18;



import java.util.Scanner;


public class Vectores {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] vector1 = new int[leerEntero("Espacios del primer vector: ")];
        int[] vector2 = new int[leerEntero("Espacios del segundo vector: ")];
        int[] vectorConcatenado = new int[vector1.length+vector2.length];
        System.out.println("\nIntroduciendo valores primer vector");
        llenarArray(vector1);
        System.out.println();
        System.out.println("\nIntroduciendo valores segundo vector");
        llenarArray(vector2);
        System.out.println();
        concatenarArrays(vector1, vector2, vectorConcatenado);
        System.out.println("Primer vector");
        visualizar(vector1);
        System.out.println("\nSegundo vector");
        visualizar(vector2);
        System.out.println("\nVector resultante");
        visualizar(vectorConcatenado);


    }

    private static void concatenarVectores(int[] vector1, int[] vector2,
                                         int[] vectorConcatenado) {
        for (int i = 0; i<vector1.length; i++) {
            vectorConcatenado[i] = vector1[i];
        }

        for (int i = 0, j=vector2.length; i<vector2.length; i++, j++) {
            vectorConcatenado[j] = vector2[i];
        }
    }

    private static void llenarVector(int[] pVector){
        for(int i=0;i<pVector.length;i++){
            pVector[i] = leerEntero("Inserta el valor " + (i+1) + ": ");
        }
    }

    private static void visualizar(int[] pArray){
        for (int i=0; i<pArray.length; i++) {
            System.out.print(pArray[i] + " ");
        }
    }

    private static int leerEntero(String s){
        System.out.print(s);
        int num = sc.nextInt();
        return num;
    }
}
*/
