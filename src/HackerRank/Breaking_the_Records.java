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
public class Breaking_the_Records {

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
        int resultado[] = new int[2];
        int supero = 0;
        int retrocedio = 0;
        int marca = 0;
        int record = 0;
        int peor = 0;
        for (int i = 0; i < scores.length; i++) {
            marca = scores[i];
            if (i == 0) {
                record = marca;
                peor = marca;
                continue;
            } else {
                if (marca > record) {
                    record = marca;
                    supero++;
                }
                if (marca < peor) {
                    peor = marca;
                    retrocedio++;
                }
            }
        }
        resultado[0] = supero;
        resultado[1] = retrocedio;
        return resultado;
    }

    public static void main(String[] args) {
        int[] scores = {10,5 , 20, 20, 4, 5, 2, 25,1};
        int[] result = breakingRecords(scores);
        for (int i = 0; i < result.length; i++){
            System.out.print(result[i] + ", ");
        }

    }
}
