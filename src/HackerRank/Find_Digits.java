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
public class Find_Digits {
    
    static int findDigits(int n) {
        int total = 0;
        String valor = String.valueOf(n);
        for (int i = 0; i < valor.length(); i++){
            char aux = valor.charAt(i);
            int valorAux = Integer.parseInt(String.valueOf(aux));
            if (valorAux > 0){
                if (n%valorAux == 0) total++;
            }
        }
        return total;
    }

    public static void main(String[] args)  {

            int n = 12;

            int result = findDigits(n);
            
            System.out.println(result);
    }
    
}
