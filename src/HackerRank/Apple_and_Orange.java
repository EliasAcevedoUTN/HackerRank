import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Apple_and_Orange {
	// Complete the countApplesAndOranges function below.
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int manzanas = 0;
		int naranjas = 0;
		for (int i = 0; i < apples.length; i++) {
			if ((a + apples[i]) >= s && (a + apples[i]) <= t) {
				manzanas++;
			}
		}
		for (int i = 0; i < oranges.length; i++) {
			if ((b + oranges[i]) >= s && (b + oranges[i])<= t) {
				naranjas++;
			}
		}
		System.out.println(manzanas);
		System.out.println(naranjas);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int s = 7;

		int t = 11;

		int a = 5;

		int b = 15;


		int[] apples = {-2,2,1};



		int[] oranges = {5,-6};


		countApplesAndOranges(s, t, a, b, apples, oranges);

		
	}
}
