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
public class Counting_Valleys {
    
    static int countingValleys(int n, String s) {
        int valles = 0;
        int nivel = 0;
        boolean bandera = false;
        for(int i = 0; i < s.length(); i++){
            char letra = s.charAt(i);
            if (letra == 'U'){
                nivel++;
            } else if (letra == 'D'){
                nivel--;
            }
            if (nivel < 0){
                bandera = true;
            }
            if (bandera){
                if ( nivel >= 0) {
                    valles++;
                    bandera = false;
                }
            }
        }
        return valles;
    }

    public static void main(String[] args){
        
        int n = 8;

        String s = "UDDDUDUU";

        int result = countingValleys(n, s);

        System.out.println(result);
    }
    
}
