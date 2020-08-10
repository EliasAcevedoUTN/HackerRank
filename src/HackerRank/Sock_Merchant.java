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
public class Sock_Merchant {
    
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int resultado = 0;
        int sumaPar = 0;
        Set<Integer> conjunto = new HashSet();
        for (int i = 0; i < ar.length; i++){
            conjunto.add(ar[i]);
        }
        for (Integer valor: conjunto){
            for (int i = 0; i < ar.length; i++){
                if (valor == ar[i]) {
                    sumaPar++;
                }
            }
            resultado += (sumaPar/2);
            sumaPar = 0;
        }
        return resultado;
    }


    public static void main(String[] args) {
        
        int n = 9;

        int[] ar = {10,20,20,10,10,30,50,10,20};

        int result = sockMerchant(n, ar);
        
        System.out.println(result);

    }
}
