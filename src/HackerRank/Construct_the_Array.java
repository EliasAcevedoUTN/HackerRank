import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Construct_the_Array {
	// Complete the countArray function below.
    static long countArray(int n, int k, int x) {
        // Return the number of ways to fill in the array.
    	int cantidad = 0;
    	int elementos = n;
    	int numero = (int) (Math.random() * k) + 1;//genera valor aleatorio
    	int[] numeros = new int[n];
    	for (int i = 0; i < numeros.length; i++ ) {
    		if (i == 0) {
    			numeros[0] = 1;
    		}
    		if (i == (numeros.length-1)) {
    			numeros[i] = x;
    		}
    		
    	}
    	
    	return cantidad;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nkx = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nkx[0]);

        int k = Integer.parseInt(nkx[1]);

        int x = Integer.parseInt(nkx[2]);

        long answer = countArray(n, k, x);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
