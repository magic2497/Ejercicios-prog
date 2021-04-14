package ex8;

import org.apache.catalina.valves.rewrite.InternalRewriteMap;

import java.lang.reflect.Array;

public class Letras {
    static char[] lista = {'A', 'B', 'C', 'D'};

    public static void main(String[] args) {


        for (int i = 0; i < lista.length; ++i) {
            System.out.println(  Character.toLowerCase(lista[i]));
        }

    }
}

