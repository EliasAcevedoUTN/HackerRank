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
public class Beautiful_Triplets {
    
    static int beautifulTriplets(int d, int[] arr) {
        int triples = 0;
        for (int i = 0; i < arr.length - 2; i++){
            for (int j = i + 1; j < arr.length - 1; j++){
                for(int k = j + 1; k < arr.length; k++){
                    if (arr[i] < arr[j] && arr[j] < arr[k]){
                        if (arr[j] - arr[i] == d && arr[k] - arr[j] == d){
                            triples++;
                        }
                    }
                }
            }
        }
        return triples;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

//        int n = Integer.parseInt(nd[0]);

        int d = 3;

        int[] arr = {1,2,4,5,7,8,10};

        int result = beautifulTriplets(d, arr);

        System.out.println(result);
    }
        
}
