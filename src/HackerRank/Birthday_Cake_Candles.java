import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Birthday_Cake_Candles {
	static long birthdayCakeCandles(long[] ar) {
        long resultado = 0;
        long mayorVela = 0;
        long mayorVelaMax = 0;
        for (int i = 0; i < ar.length - 1; i++) {
        	long siguiente = ar[i+1];
        	long actual = ar[i];
        	if (actual > siguiente) {
        		mayorVela = actual;
        	} else {
        		mayorVela = siguiente;
        	}
        	if (mayorVela > mayorVelaMax) {
        		mayorVelaMax = mayorVela;
        	}
        }
        for (int i = 0; i < ar.length; i++) {
        	if (mayorVelaMax == ar[i]) {
        		resultado++;
        	}
        }
        return resultado;
    }
	
	public static void main(String[] args) throws IOException {
		long[] lista = {82, 49, 82, 82, 41, 82, 15, 63, 38, 25};
		long resultado = birthdayCakeCandles(lista);
		System.out.println(resultado);
	}
}
