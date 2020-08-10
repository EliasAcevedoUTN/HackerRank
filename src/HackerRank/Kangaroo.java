import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Kangaroo {
	// Complete the kangaroo function below.
	static String kangaroo(long x1, long v1, long x2, long v2) {
		String resultado = "NO";
		long totalK1 = x1 + v1;
		long totalK2 = x2 + v2;
		if ((x2 > x1 && v2 > v1) || (x2 > x1 && v2 == v1) || (x2 < x1 && v2 < v1) || (x2 < x1 && v2 == v1) ) {
			resultado = "NO";
		} else if (totalK1 > totalK2 && v1 > v2) {
			resultado = "NO";
		} else if (totalK2 > totalK1 && v2 > v1 ) {
			resultado = "NO";
		}
		else {
			if (totalK1 > totalK2) {
				while (true) {
					if (totalK1 == totalK2) {
						resultado = "YES";
						break;
					}
					if (totalK2 > totalK1) break;
					totalK1 += v1;
					totalK2 += v2;
				}
			} else {
				while (true) {
					if (totalK1 == totalK2) {
						resultado = "YES";
						break;
					}
					if (totalK1 > totalK2) break;
					totalK1 += v1;
					totalK2 += v2;
				}
			}
		}
		return resultado;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int x1 = 23;

		int v1 = 9867;

		int x2 = 9814;

		int v2 = 5861;

		String result = kangaroo(x1, v1, x2, v2);

		System.out.println(result);

		scanner.close();
	}
}
