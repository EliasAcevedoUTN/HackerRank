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
public class Extra_Long_Factorials {

    static void extraLongFactorials(int n) {

        BigInteger valor  = BigInteger.valueOf(1);
        for(int i=1;i<=n;i++){
            valor=valor.multiply(BigInteger.valueOf(i));
        }
        System.out.println(valor);
    }

//    static int extraLongFactorials(int n) {
//        int resultado = 0;
//        if (n == 1){
//            resultado = n;
//        } else {
//            resultado = n*(extraLongFactorials(n-1));
//        }
//        return resultado;
//    }
public static void main(String[] args) {
        int n = 45;

        extraLongFactorials(n);

    }
}
