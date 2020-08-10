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
public class Beautiful_Days_at_the_Movies {
    static int beautifulDays(int i, int j, int k) {
        int diasHermosos = 0;
        for (int p = i ; p <= j; p++ ){
            String inverso = String.valueOf(p);
            String aux = "";
            for (int m = inverso.length() - 1; m >=0; m--){
                aux += inverso.charAt(m) + "";
            }
            int numInverso = Integer.parseInt(aux);
            int diferenciaAbs = Math.abs(p - numInverso);
            if (diferenciaAbs%k == 0){
                diasHermosos++;
            }
        }
        return diasHermosos;
    }

    public static void main(String[] args)  {

        int i = 20;

        int j = 23;

        int k = 6;

        int result = beautifulDays(i, j, k);

        System.out.println(result);
    }
}
