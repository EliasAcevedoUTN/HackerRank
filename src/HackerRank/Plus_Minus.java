import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Plus_Minus {
	static void plusMinus(int[] arr) {
		float divisor = arr.length;
		float positivos = 0;
		float negativos = 0;
		float zero = 0;
		for (int i = 1 ; i < arr.length; i++) {
			if (arr[i] > 0) {
				positivos++;
			} else if (arr[i] < 0) {
				negativos++;
			} else {
				zero++;
			}
		}
		DecimalFormat formato1 = new DecimalFormat("#.");
		System.out.println(formato1.format(positivos/divisor));
		System.out.println(formato1.format(negativos/divisor));
		System.out.println(formato1.format(zero/divisor));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        

        int[] arr = {1,2,3,-1,-2,-3,0,0};


        plusMinus(arr);

        
    }
}
