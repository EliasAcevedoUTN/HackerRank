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
public class LisaWorkbook {
    
    static int workbook(int n, int k, int[] arr) {
        int problemas = 0;
        int pages = 1;
        int chapters = 1;
        while (chapters <= n){
            int problems = arr[chapters - 1];
            int problemasXpage = 0;
            for (int i = 1; i <= problems; i++){
                problemasXpage++;
                if (problemasXpage > k){
                    pages++; 
                    problemasXpage = 1;
                }
                if(i == pages){
                    problemas++;
                }
            }
            pages++;          
            chapters++;
        }
        return problemas;
    }

    public static void main(String[] args)  {

        int n = 10;

        int k = 5;

        int[] arr = {3, 8, 15, 11, 14, 1, 9, 2, 24, 31};

        int result = workbook(n, k, arr);

        System.out.println(result);
    }
    
}
