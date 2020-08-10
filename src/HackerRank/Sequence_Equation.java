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
public class Sequence_Equation {
    
    static int[] permutationEquation(int[] p) {
        int[] array = new int[p.length];
        int numero = p.length;
        
        for (int i = 1; i <= numero; i++){
            int posicion = 0;
            for (int j = 0; j < p.length; j++){
                if ( i == p[j] ){
                    posicion = j + 1;
                    for (int k = 0; k < p.length; k++ ){
                        if (posicion == p[k]){
                            posicion = k + 1;
                            array[i-1] = posicion;
                            break;
                        }
                    }
                }
            }
        }
        return array;
    }

    public static void main(String[] args)  {

        int[] p = {4,3,5,1,2};

        int[] result = permutationEquation(p);
        
        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
    
}
