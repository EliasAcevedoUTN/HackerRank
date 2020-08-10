package HackerRank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Divisible_Sum_Pairs {
    // Complete the divisibleSumPairs function below.
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int resultado  = 0;
        for (int i = 0; i < ar.length - 1; i++){
            for (int j = i + 1; j < ar.length; j++ ){
                if ((i < j) && ((ar[i] + ar[j])%k == 0) ) resultado++;
            }
        }
        return resultado;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = 6;

        int k = 3;

        int[] ar = {1,3,2,6,1,2};


        int result = divisibleSumPairs(n, k, ar);

        System.out.println(result);

    }
}
