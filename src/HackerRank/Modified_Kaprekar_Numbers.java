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
public class Modified_Kaprekar_Numbers {

    static void kaprekarNumbers(int p, int q) {
        boolean hay = false;
        for (long i = p; i <= q; i++){
            long izquierda = i*i;
            long derecha = 0;
            long decena = 1;
            boolean es = false;
            while (izquierda > 0 && !es){
                derecha = (i*i)%(10*decena);//voy aumentando los valores a la derecha
                izquierda = izquierda/10;//voy reduciendo los valores a la izquierda
                decena*= 10;
                es = derecha > 0 && izquierda+derecha == i;
            }
            if (es){
                System.out.print(i + " ");
                hay = true;
            }
        }
        if (!hay){
            System.out.println("INVALID RANGE");
        }
    }

    public static void main(String[] args) {
        int p = 4879;

        int q = 5000;

        kaprekarNumbers(p, q);
    }
    
}
