import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Staircase {
	//Escribir un programa que dibuje una starcaise con signos de # de tamaño n ingresada por el usuario */
	static void staircase(int n) {
        int i = n;
        int contador = 1;
        do {
        	String cadena = "";
        	String signo = "";
        	for (int j = 1; j < n; j++) {
        		cadena = cadena + "\u0020";
        	}
        	for (int k = 0; k < contador; k++) {
        		signo += "#";
        	}
        	System.out.print(cadena);
        	System.out.println(signo);
        	n--;
        	contador++;
        } while (n != 0);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	System.out.println("ingresar un valor:\n");
        int n = scanner.nextInt();
        System.out.println("#");
        staircase(n);

    }
}
