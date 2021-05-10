
package ex18;



import java.util.Scanner;


public class Vectores {

    public static void main(String[] args) {
        int[] v1, v2, v3;

        v1 = new int[10];
        v2 = new int[10];

        for (int i = 0; i < v1.length; i++) {
            v1[i] = (int) (10*Math.random()+1);
            v2[i] = (int) (10*Math.random()+1);
        }


        v3 = new int[v1.length + v2.length];
        for (int i = 0; i < v1.length; i++) {
            v3[i] = v1[i];
            v3[v1.length + i] = v2[i];
        }


        for (int i = 0; i < v3.length; i++) {
            System.out.print(v3[i] + " ");
        }


    }

}

