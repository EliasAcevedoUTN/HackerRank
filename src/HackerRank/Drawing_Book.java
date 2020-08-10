package HackerRank;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
/**
 *
 * @author Elías Acevedo
 */
public class Drawing_Book {
    static int pageCount(int n, int p) {
        int resultado = 0;
        int ida = 0;
        int vuelta = 0;
        if (n%2 == 0){
            n+=1;
        }
        for (int i = 0; i < n; i+=2){
            if ((i == p) || (i+1) == p) break;
            ida++;
        }
        for (int i = n; i >= 0; i-= 2){
            if ((i == p) || (i-1) == p) break;
            vuelta++;
        }
        if (ida < vuelta){
            resultado = ida;
        } else {
            resultado = vuelta;
        }
        return resultado;
    }

    public static void main(String[] args) {

        int n = 5;

        int p = 5;

        int result = pageCount(n, p);

        System.out.println(result);
        
    }
}
