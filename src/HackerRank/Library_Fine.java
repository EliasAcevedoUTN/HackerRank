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
public class Library_Fine {
    
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int pagar = 0;
        if (y1 == y2){
            if (m1 == m2) {
                if (d1 == d2){
                    pagar = 0;
                } else if (d1 < d2){
                    pagar = 0;
                } else {
                    pagar = 15 * (d1 - d2);
                }
            } else if (m1 < m2){
                pagar = 0;
            } else {
                pagar = 500 * (m1 - m2);
            }
        } else if (y1 < y2){
            pagar = 0;
        } else {
            pagar = 10000;
        }
        return pagar;
    }


    public static void main(String[] args)  {

        int d1 = 2;

        int m1 = 7;

        int y1 = 1014;

        int d2 = 1;

        int m2 = 1;

        int y2 = 1015;

        int result = libraryFine(d1, m1, y1, d2, m2, y2);
        
        System.out.println(result);
    }
    
}
