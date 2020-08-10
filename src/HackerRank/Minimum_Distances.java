package HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 *
 * @author Elías Acevedo
 */
public class Minimum_Distances {

    static int minimumDistances(int[] a) {
        int distanciaMinima = 1000000000;
        int distancia = 0;
        boolean bandera = true;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    distancia = Math.abs(i - j);
                    if (distancia < distanciaMinima) {
                        distanciaMinima = distancia;
                        bandera = false;
                    }
                }

            }
        }
        if (bandera){
            distanciaMinima = -1;
        }
        return distanciaMinima;
    }

    public static void main(String[] args) {

        int[] a = {7, 1, 3, 4, 1, 7};

        int result = minimumDistances(a);

        System.out.println(result);
    }

}
