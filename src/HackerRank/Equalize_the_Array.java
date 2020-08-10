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
public class Equalize_the_Array {
    
    static int equalizeArray(int[] arr) {
        int min;
        int mayorIguales = 0;
        for (int i = 0; i < arr.length; i++ ){
            int iguales = 0;
            for (int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]) iguales++;
            }
            if (iguales > mayorIguales){
                mayorIguales = iguales;
            }
        }
        return min = arr.length - mayorIguales;
    }

    public static void main(String[] args) throws IOException {

        int[] arr = {1,2,2,3};
        
        int result = equalizeArray(arr);

        System.out.println(result);
    }
    
}
